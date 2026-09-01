package blueduck.ilb.registry;

import blueduck.ilb.Config;
import blueduck.ilb.event.LuckyEvent;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventList {

    public static ArrayList<LuckyEvent> eventList = new ArrayList<LuckyEvent>();

    public static LuckyEvent getEvent(Level level) {
        // Category and individual-event toggles are read from Config here rather than at
        // registration time, because EventAdditions.addEvents() runs during mod construction,
        // before Forge has loaded the config file. Filtering/weighting at selection time
        // guarantees the current config values are honored regardless of that ordering.
        List<LuckyEvent> pool = eventList.stream()
                .filter(EventList::isEnabled)
                .collect(Collectors.toList());

        // Safety net: if every enabled event was filtered out (e.g. misconfiguration disabling
        // every category), fall back to the full pool instead of throwing.
        if (pool.isEmpty()) {
            pool = eventList;
        }

        int totalWeight = pool.stream().mapToInt(EventList::effectiveWeight).sum();
        if (totalWeight <= 0) {
            // Every remaining event was weighted to 0 (e.g. by config) - fall back to a plain
            // uniform pick rather than dividing by zero or silently returning nothing.
            return pool.get(level.getRandom().nextInt(pool.size()));
        }

        int roll = level.getRandom().nextInt(totalWeight);
        int cumulative = 0;
        for (LuckyEvent event : pool) {
            cumulative += effectiveWeight(event);
            if (roll < cumulative) {
                return event;
            }
        }
        return pool.get(pool.size() - 1);
    }

    private static boolean isEnabled(LuckyEvent event) {
        if (!Config.isCategoryEnabled(event.category)) {
            return false;
        }
        if (event.category.equals("default")) {
            return Config.isDefaultEventEnabled(event.id);
        }
        return Config.disabledEvents == null || !Config.disabledEvents.contains(event.id);
    }

    private static int effectiveWeight(LuckyEvent event) {
        int weight = event.category.equals("default")
                ? Config.getDefaultEventWeight(event.id)
                : event.defaultWeight;
        return Math.max(weight, 0);
    }

    public static void addEvent(LuckyEvent event, int weight) {
        // Each event is stored once; weight is applied at selection time (see getEvent()) so
        // that config-driven weight overrides can take effect without re-registering events.
        event.defaultWeight = weight;
        eventList.add(event);
    }

}

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
        // before Forge has loaded the config file. Filtering at selection time guarantees the
        // current config values are honored regardless of that ordering.
        List<LuckyEvent> pool = eventList.stream()
                .filter(EventList::isEnabled)
                .collect(Collectors.toList());

        // Safety net: if every enabled event was filtered out (e.g. misconfiguration disabling
        // every category), fall back to the full pool instead of throwing.
        if (pool.isEmpty()) {
            pool = eventList;
        }

        return pool.get(level.getRandom().nextInt(pool.size()));
    }

    private static boolean isEnabled(LuckyEvent event) {
        if (Config.disabledEvents != null && Config.disabledEvents.contains(event.id)) {
            return false;
        }
        return Config.isCategoryEnabled(event.category);
    }

    public static void addEvent(LuckyEvent event, int weight) {
        for (int i = 0; i < weight; i++) {
            eventList.add(event);
        }
    }

}

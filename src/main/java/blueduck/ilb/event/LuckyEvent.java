package blueduck.ilb.event;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyEvent {

    // category matches one of the Config.enableXEvents toggles (e.g. "default", "alexcaves");
    // id is the unique identifier used by Config's per-event disable list ("safety.disabledEvents")
    public final String category;
    public final String id;

    // Set once by EventList.addEvent() from the weight passed at registration. Used as the
    // fallback weight for categories that don't have a per-event config override (see
    // EventList.effectiveWeight()); for "default" category events, Config's per-event weight
    // takes precedence instead.
    public int defaultWeight;

    public ArrayList<EventAction> actionList = new ArrayList<EventAction>();

    public LuckyEvent(String category, String id, EventAction... actions) {
        this.category = category;
        this.id = id;
        actionList.addAll(Arrays.asList(actions));
    }

    public void execute(ServerLevel level, BlockPos pos, Entity entity) {
        for (int i = 0; i < actionList.size(); i++) {
            actionList.get(i).execute(level, pos, entity);
        }
    }
}

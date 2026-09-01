package blueduck.ilb;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = IntegratedLuckyBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // ---------------------------------------------------------------
    // general
    // ---------------------------------------------------------------
    private static final ForgeConfigSpec.BooleanValue SHOULD_SPAWN_TEMPLES;
    private static final ForgeConfigSpec.BooleanValue SHOULD_CREATIVE_BREAK;

    // ---------------------------------------------------------------
    // loot_tables
    // ---------------------------------------------------------------
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS;
    private static final ForgeConfigSpec.IntValue LOOT_TABLE_WEIGHT;

    // ---------------------------------------------------------------
    // events - one toggle per mod-compat integration (matches EventAdditions.addXEvents()
    // and the "category" every LuckyEvent is tagged with)
    // ---------------------------------------------------------------
    private static final ForgeConfigSpec.BooleanValue ENABLE_DEFAULT_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_ALEX_CAVES_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_ALEX_MOBS_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_OUTER_END_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_JELLYFISHING_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_DUSTRIAL_DECOR_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_BLIGHTED_BEASTS_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_V_TURRETS_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_COMPOUND_V_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_JOLLY_BOXES_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_ARTIFACTS_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_CAVERNS_AND_CHASMS_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_CREATE_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_ROTTEN_CREATURES_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_DIM_DOORS_EVENTS;
    private static final ForgeConfigSpec.BooleanValue ENABLE_INVINCIBLE_EVENTS;

    // ---------------------------------------------------------------
    // safety - fine-grained control on top of the category toggles above
    // ---------------------------------------------------------------
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> DISABLED_EVENTS;

    static
    {
        BUILDER.push("general");
        SHOULD_SPAWN_TEMPLES = BUILDER
                .comment("Enables the Lucky Temple structure spawn in the overworld")
                .define("luckyTemples", true);
        SHOULD_CREATIVE_BREAK = BUILDER
                .comment("Whether breaking a Lucky Block in creative mode should activate its effect")
                .define("creativeDestroy", false);
        BUILDER.pop();

        BUILDER.push("loot_tables");
        ITEM_STRINGS = BUILDER
                .comment("A list of loot tables to add Lucky Blocks to")
                .defineListAllowEmpty("loot_tables", List.of("minecraft:chests/end_city_treasure", "minecraft:chests/ancient_city", "minecraft:chests/desert_pyramid", "minecraft:chests/jungle_temple", "minecraft:chests/bastion_treasure", "minecraft:gameplay/fishing/treasure"), Config::validateName);
        LOOT_TABLE_WEIGHT = BUILDER
                .comment("The weight of Lucky Blocks in the loot tables specified above (higher weight = more likely to generate)")
                .defineInRange("lootTableWeight", 3, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("events");
        ENABLE_DEFAULT_EVENTS = BUILDER
                .comment("Enables the mod's built-in vanilla-Minecraft event pool")
                .define("enableDefaultEvents", true);
        ENABLE_ALEX_CAVES_EVENTS = BUILDER
                .comment("Enables Alex's Caves compat events (only applies if Alex's Caves is installed)")
                .define("enableAlexCavesEvents", true);
        ENABLE_ALEX_MOBS_EVENTS = BUILDER
                .comment("Enables Alex's Mobs compat events (only applies if Alex's Mobs is installed)")
                .define("enableAlexMobsEvents", true);
        ENABLE_OUTER_END_EVENTS = BUILDER
                .comment("Enables Outer End compat events (only applies if Outer End is installed)")
                .define("enableOuterEndEvents", true);
        ENABLE_JELLYFISHING_EVENTS = BUILDER
                .comment("Enables Jellyfishing compat events (only applies if Jellyfishing is installed)")
                .define("enableJellyfishingEvents", true);
        ENABLE_DUSTRIAL_DECOR_EVENTS = BUILDER
                .comment("Enables Dustrial Decor compat events (only applies if Dustrial Decor is installed)")
                .define("enableDustrialDecorEvents", true);
        ENABLE_BLIGHTED_BEASTS_EVENTS = BUILDER
                .comment("Enables Blighted Beasts compat events (only applies if Blighted Beasts is installed)")
                .define("enableBlightedBeastsEvents", true);
        ENABLE_V_TURRETS_EVENTS = BUILDER
                .comment("Enables Vounier Turrets compat events (only applies if that mod is installed)")
                .define("enableVTurretsEvents", true);
        ENABLE_COMPOUND_V_EVENTS = BUILDER
                .comment("Enables Compound V compat events (only applies if Compound V is installed)")
                .define("enableCompoundVEvents", true);
        ENABLE_JOLLY_BOXES_EVENTS = BUILDER
                .comment("Enables Jolly Boxes compat events (only applies if Jolly Boxes is installed)")
                .define("enableJollyBoxesEvents", true);
        ENABLE_ARTIFACTS_EVENTS = BUILDER
                .comment("Enables Artifacts compat events (only applies if Artifacts is installed)")
                .define("enableArtifactsEvents", true);
        ENABLE_CAVERNS_AND_CHASMS_EVENTS = BUILDER
                .comment("Enables Caverns & Chasms compat events (only applies if that mod is installed)")
                .define("enableCavernsAndChasmsEvents", true);
        ENABLE_CREATE_EVENTS = BUILDER
                .comment("Enables Create compat events (only applies if Create is installed)")
                .define("enableCreateEvents", true);
        ENABLE_ROTTEN_CREATURES_EVENTS = BUILDER
                .comment("Enables Rotten Creatures compat events (only applies if that mod is installed)")
                .define("enableRottenCreaturesEvents", true);
        ENABLE_DIM_DOORS_EVENTS = BUILDER
                .comment("Enables Dimensional Doors compat events (only applies if that mod is installed)")
                .define("enableDimDoorsEvents", true);
        ENABLE_INVINCIBLE_EVENTS = BUILDER
                .comment("Enables Invincible compat events (only applies if that mod is installed)")
                .define("enableInvincibleEvents", true);
        BUILDER.pop();

        BUILDER.push("safety");
        DISABLED_EVENTS = BUILDER
                .comment(
                        "Individually disable specific Lucky Block outcomes by id, on top of the category",
                        "toggles above. Every outcome the mod can roll has a stable id such as",
                        "\"default_explode\" or \"alexcaves_spawn_nucleeper\" - see docs/EVENT_IDS.md in the",
                        "mod's source repository for the full list of ids and what each one does.",
                        "Example: [\"default_explode\", \"default_spawn_rain_wither\"]"
                )
                .defineListAllowEmpty("disabledEvents", List.of(), Config::validateName);
        BUILDER.pop();
    }

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean luckyTemplesSpawn;
    public static boolean creativeModeBreaks;
    public static List<? extends String> lootTables;
    public static int weight;

    public static boolean enableDefaultEvents;
    public static boolean enableAlexCavesEvents;
    public static boolean enableAlexMobsEvents;
    public static boolean enableOuterEndEvents;
    public static boolean enableJellyfishingEvents;
    public static boolean enableDustrialDecorEvents;
    public static boolean enableBlightedBeastsEvents;
    public static boolean enableVTurretsEvents;
    public static boolean enableCompoundVEvents;
    public static boolean enableJollyBoxesEvents;
    public static boolean enableArtifactsEvents;
    public static boolean enableCavernsAndChasmsEvents;
    public static boolean enableCreateEvents;
    public static boolean enableRottenCreaturesEvents;
    public static boolean enableDimDoorsEvents;
    public static boolean enableInvincibleEvents;

    public static List<? extends String> disabledEvents;

    private static boolean validateName(final Object obj)
    {
        return true;
    }

    // Maps a LuckyEvent's category (set in EventAdditions.java) to its config toggle.
    // Called from EventList at event-selection time - see EventList.isEnabled().
    public static boolean isCategoryEnabled(String category)
    {
        switch (category)
        {
            case "default": return enableDefaultEvents;
            case "alexcaves": return enableAlexCavesEvents;
            case "alexmobs": return enableAlexMobsEvents;
            case "outerend": return enableOuterEndEvents;
            case "jellyfishing": return enableJellyfishingEvents;
            case "dustrialdecor": return enableDustrialDecorEvents;
            case "blightedbeasts": return enableBlightedBeastsEvents;
            case "vturrets": return enableVTurretsEvents;
            case "compoundv": return enableCompoundVEvents;
            case "jollyboxes": return enableJollyBoxesEvents;
            case "artifacts": return enableArtifactsEvents;
            case "cavernsandchasms": return enableCavernsAndChasmsEvents;
            case "create": return enableCreateEvents;
            case "rottencreatures": return enableRottenCreaturesEvents;
            case "dimdoors": return enableDimDoorsEvents;
            case "invincible": return enableInvincibleEvents;
            default: return true;
        }
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        luckyTemplesSpawn = SHOULD_SPAWN_TEMPLES.get();
        creativeModeBreaks = SHOULD_CREATIVE_BREAK.get();

        // convert the list of strings into a set of items
        lootTables = ITEM_STRINGS.get();
        weight = LOOT_TABLE_WEIGHT.get();

        enableDefaultEvents = ENABLE_DEFAULT_EVENTS.get();
        enableAlexCavesEvents = ENABLE_ALEX_CAVES_EVENTS.get();
        enableAlexMobsEvents = ENABLE_ALEX_MOBS_EVENTS.get();
        enableOuterEndEvents = ENABLE_OUTER_END_EVENTS.get();
        enableJellyfishingEvents = ENABLE_JELLYFISHING_EVENTS.get();
        enableDustrialDecorEvents = ENABLE_DUSTRIAL_DECOR_EVENTS.get();
        enableBlightedBeastsEvents = ENABLE_BLIGHTED_BEASTS_EVENTS.get();
        enableVTurretsEvents = ENABLE_V_TURRETS_EVENTS.get();
        enableCompoundVEvents = ENABLE_COMPOUND_V_EVENTS.get();
        enableJollyBoxesEvents = ENABLE_JOLLY_BOXES_EVENTS.get();
        enableArtifactsEvents = ENABLE_ARTIFACTS_EVENTS.get();
        enableCavernsAndChasmsEvents = ENABLE_CAVERNS_AND_CHASMS_EVENTS.get();
        enableCreateEvents = ENABLE_CREATE_EVENTS.get();
        enableRottenCreaturesEvents = ENABLE_ROTTEN_CREATURES_EVENTS.get();
        enableDimDoorsEvents = ENABLE_DIM_DOORS_EVENTS.get();
        enableInvincibleEvents = ENABLE_INVINCIBLE_EVENTS.get();

        disabledEvents = DISABLED_EVENTS.get();
    }
}

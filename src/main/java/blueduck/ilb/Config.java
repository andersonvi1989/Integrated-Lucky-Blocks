package blueduck.ilb;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    // safety - fine-grained control on top of the category toggles above.
    // Only needed for the 15 mod-compat categories; "default" events have their own fully
    // enumerated section below (defaultEvents) so no id lookup is needed for those.
    // ---------------------------------------------------------------
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> DISABLED_EVENTS;

    // ---------------------------------------------------------------
    // defaultEvents - one enabled/weight pair per built-in vanilla-Minecraft event, generated
    // from EventAdditions.addDefaultEvents(). id -> default weight, in registration order.
    // Regenerate with scripts/gen_event_ids_doc.py's id extraction if that method changes.
    // ---------------------------------------------------------------
    private static final String[][] DEFAULT_EVENT_DEFAULTS = {
            {"default_spawn_rain_zombie", "30"},
            {"default_spawn_rain_spider", "20"},
            {"default_spawn_rain_cave_spider", "15"},
            {"default_spawn_tnt", "5"},
            {"default_spawn_slime", "20"},
            {"default_spawn_stack_creeper", "20"},
            {"default_spawn_rain_wither_skeleton", "5"},
            {"default_spawn_guardian", "10"},
            {"default_spawn_jockey_chicken", "5"},
            {"default_spawn_stack_chicken", "8"},
            {"default_spawn_rain_chicken", "1"},
            {"default_ride_player_chicken", "5"},
            {"default_spawn_jockey_pig", "5"},
            {"default_spawn_villager", "2"},
            {"default_spawn_sniffer", "1"},
            {"default_fish_rain", "5"},
            {"default_spawn_stack_cod", "5"},
            {"default_spawn_warden", "5"},
            {"default_spawn_pig", "3"},
            {"default_spawn_cow", "3"},
            {"default_spawn_sheep", "3"},
            {"default_spawn_snow_golem", "3"},
            {"default_spawn_iron_golem", "2"},
            {"default_spawn_bat", "3"},
            {"default_spawn_allay", "3"},
            {"default_spawn_frog", "2"},
            {"default_spawn_frog_2", "1"},
            {"default_spawn_mooshroom", "2"},
            {"default_set_block_beehive", "2"},
            {"default_spawn_silverfish", "2"},
            {"default_spawn_zoglin", "4"},
            {"default_spawn_rain_iron_golem", "5"},
            {"default_spawn_rain_villager", "3"},
            {"default_encase_in_box_obsidian", "7"},
            {"default_encase_in_box_tnt", "4"},
            {"default_encase_in_box_tnt_2", "2"},
            {"default_lava_roof", "8"},
            {"default_tp_player_up", "5"},
            {"default_spawn_rain_tnt", "8"},
            {"default_cage", "5"},
            {"default_cage_2", "5"},
            {"default_cage_3", "5"},
            {"default_cage_obsidian", "5"},
            {"default_set_block_water", "5"},
            {"default_tp_player_up_2", "1"},
            {"default_tp_player_up_3", "1"},
            {"default_tp_player_up_4", "1"},
            {"default_tp_player_up_5", "1"},
            {"default_arena", "5"},
            {"default_arena_2", "3"},
            {"default_explode", "3"},
            {"default_spawn_rain_wither", "1"},
            {"default_item_diamond", "3"},
            {"default_item_diamond_2", "1"},
            {"default_item_diamond_3", "1"},
            {"default_tag_item_trim_materials", "1"},
            {"default_tag_item_trim_materials_2", "1"},
            {"default_item_netherite_scrap", "1"},
            {"default_item_gold_ingot", "1"},
            {"default_item_iron_ingot", "1"},
            {"default_item_copper_ingot", "1"},
            {"default_item_iron_block", "1"},
            {"default_set_block_diamond_block", "1"},
            {"default_item_redstone", "5"},
            {"default_item_trident", "1"},
            {"default_item_spyglass", "5"},
            {"default_item_sponge", "1"},
            {"default_item_slime_block", "1"},
            {"default_set_block_bedrock", "1"},
            {"default_explode_2", "1"},
            {"default_item_enchanted_golden_apple", "3"},
            {"default_item_beacon", "2"},
            {"default_tag_item_trim_templates", "2"},
            {"default_tag_item_music_discs", "3"},
            {"default_tag_item_swords", "10"},
            {"default_tag_item_trimmable_armor", "5"},
            {"default_tag_item_wool", "5"},
            {"default_tag_item_small_flowers", "5"},
            {"default_tag_item_saplings", "5"},
            {"default_tag_item_arrows", "1"},
            {"default_tag_item_arrows_2", "3"},
            {"default_item_arrow", "6"},
            {"default_item_rotten_flesh", "3"},
            {"default_set_block_ender_chest", "2"},
            {"default_item_flint_and_steel", "1"},
            {"default_spawn_rain_egg", "3"},
            {"default_item_echo_shard", "1"},
            {"default_set_block_water_2", "1"},
            {"default_set_block_water_3", "1"},
            {"default_hole", "3"},
            {"default_item_diamond_block", "3"},
            {"default_set_block_diamond_block_2", "2"},
            {"default_set_block_diamond_block_3", "1"},
            {"default_tag_item_hoes", "3"},
            {"default_tag_item_hoes_2", "1"},
            {"default_loot_chest_chests_buried_treasure", "3"},
            {"default_loot_chest_chests_simple_dungeon", "5"},
            {"default_loot_chest_chests_desert_pyramid", "2"},
            {"default_loot_chest_chests_bastion_bridge", "1"},
            {"default_loot_chest_chests_bastion_other", "1"},
            {"default_loot_chest_chests_woodland_mansion", "2"},
            {"default_nether_reactor", "3"},
            {"default_herobrine_totem", "1"},
            {"default_lucky_temple", "3"},
            {"default_lucky_temple_2", "1"},
            {"default_lucky_temple_3", "1"},
            {"default_tp_player_up_6", "1"},
            {"default_hole_2", "1"},
            {"default_solid_box_coal_block", "2"},
            {"default_solid_box_iron_block", "1"},
            {"default_solid_box_gold_block", "1"},
            {"default_solid_box_copper_block", "3"},
            {"default_solid_box_lapis_block", "1"},
            {"default_solid_box_redstone_block", "1"},
            {"default_set_block_sculk_catalyst", "1"},
            {"default_spawn_rain_lightning_bolt", "5"},
            {"default_spawn_creeper", "5"},
            {"default_feature_sculk_patch_ancient_city", "1"},
            {"default_feature_sculk_patch_ancient_city_2", "1"},
            {"default_feature_sculk_patch_deep_dark", "1"},
            {"default_set_block_torch", "5"},
            {"default_feature_mega_jungle_tree", "1"},
            {"default_effect_levitation", "2"},
            {"default_effect_darkness", "2"},
            {"default_effect_wither", "1"},
            {"default_effect_wither_2", "2"},
            {"default_effect_water_breathing", "1"},
            {"default_tp_player_up_7", "1"},
    };

    private static final Map<String, ForgeConfigSpec.BooleanValue> DEFAULT_EVENT_ENABLED_SPECS = new LinkedHashMap<>();
    private static final Map<String, ForgeConfigSpec.IntValue> DEFAULT_EVENT_WEIGHT_SPECS = new LinkedHashMap<>();

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
                        "Individually disable specific Lucky Block outcomes by id, for the 15 mod-compat",
                        "categories (alexcaves, create, etc.) - \"default\" events have their own dedicated",
                        "defaultEvents section below instead, so you don't need this list for those.",
                        "Every outcome the mod can roll has a stable id such as \"alexcaves_spawn_nucleeper\"",
                        "- see docs/EVENT_IDS.md in the mod's source repository for the full list of ids",
                        "and what each one does.",
                        "Example: [\"alexcaves_spawn_nucleeper\", \"create_item_blaze_cake\"]"
                )
                .defineListAllowEmpty("disabledEvents", List.of(), Config::validateName);
        BUILDER.pop();

        BUILDER.comment(
                "One block per built-in vanilla-Minecraft Lucky Block outcome - no id lookup needed.",
                "Set enabled=false to remove just that outcome from the pool, or change weight to make",
                "it more/less likely relative to the others (higher = more likely; 0 behaves the same",
                "as enabled=false). This section only covers the \"default\" category; other mod-compat",
                "categories are still controlled by the events.enableXEvents toggles and safety.disabledEvents."
        ).push("defaultEvents");
        for (String[] pair : DEFAULT_EVENT_DEFAULTS)
        {
            String id = pair[0];
            int defaultWeight = Integer.parseInt(pair[1]);

            BUILDER.push(id);
            DEFAULT_EVENT_ENABLED_SPECS.put(id, BUILDER
                    .comment("Whether \"" + id + "\" can be rolled when a Lucky Block breaks")
                    .define("enabled", true));
            DEFAULT_EVENT_WEIGHT_SPECS.put(id, BUILDER
                    .comment("Relative weight for \"" + id + "\" (higher = more likely). Default: " + defaultWeight)
                    .defineInRange("weight", defaultWeight, 0, Integer.MAX_VALUE));
            BUILDER.pop();
        }
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

    public static final Map<String, Boolean> defaultEventEnabled = new HashMap<>();
    public static final Map<String, Integer> defaultEventWeight = new HashMap<>();

    private static boolean validateName(final Object obj)
    {
        return true;
    }

    // Looked up from EventList for "default" category events - see EventList.isEnabled().
    public static boolean isDefaultEventEnabled(String id)
    {
        return defaultEventEnabled.getOrDefault(id, true);
    }

    // Looked up from EventList for "default" category events - see EventList.effectiveWeight().
    public static int getDefaultEventWeight(String id)
    {
        return defaultEventWeight.getOrDefault(id, 1);
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

        for (Map.Entry<String, ForgeConfigSpec.BooleanValue> entry : DEFAULT_EVENT_ENABLED_SPECS.entrySet())
        {
            defaultEventEnabled.put(entry.getKey(), entry.getValue().get());
        }
        for (Map.Entry<String, ForgeConfigSpec.IntValue> entry : DEFAULT_EVENT_WEIGHT_SPECS.entrySet())
        {
            defaultEventWeight.put(entry.getKey(), entry.getValue().get());
        }
    }
}

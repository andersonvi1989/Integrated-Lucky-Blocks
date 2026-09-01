package blueduck.ilb.registry;

import blueduck.ilb.event.LuckyEvent;
import blueduck.ilb.event.actions.*;
import blueduck.ilb.worldgen.TemplePalette;
import blueduck.ilb.worldgen.TemplePalettes;
import net.minecraftforge.fml.ModList;

import java.time.LocalDate;
import java.time.Month;

public class EventAdditions {

    public static void addEvents() {
        //Minecraft Events
        addDefaultEvents();

        //Mod Compatibility Events
        if (ModList.get().isLoaded("alexscaves"))
            addAlexCavesEvents();
        if (ModList.get().isLoaded("alexsmobs"))
            addAlexMobsEvents();
        if (ModList.get().isLoaded("outer_end"))
            addOuterEndEvents();
        if (ModList.get().isLoaded("jellyfishing"))
            addJellyfishingEvents();
        if (ModList.get().isLoaded("dustrial_decor"))
            addDustrialDecorEvents();
        if (ModList.get().isLoaded("blighted_beasts"))
            addBlightedBeastsEvents();
        if (ModList.get().isLoaded("v_turrets"))
            addVouniernTurretsEvents();
        if (ModList.get().isLoaded("compound_v"))
            addCompoundVEvents();
        if (ModList.get().isLoaded("jolly_boxes"))
            addJollyBoxesEvents();
        if (ModList.get().isLoaded("artifacts"))
            addArtifactsEvents();
        if (ModList.get().isLoaded("caverns_and_chasms"))
            addCavernsAndChasmsEvents();
        if (ModList.get().isLoaded("create"))
            addCreateEvents();
        if (ModList.get().isLoaded("rottencreatures"))
            addRottenCreaturesEvents();
        if (ModList.get().isLoaded("dimdoors"))
            addDimDoorsEvents();
        if (ModList.get().isLoaded("invincible"))
            addInvincibleEvents();
    }

    public static void addDefaultEvents() {
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_zombie", new SpawnRainAction("minecraft:zombie", 10, 0, 1), new SpawnAction("minecraft:creeper", 1)), 30);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_spider", new SpawnRainAction("minecraft:spider", 3, 0, 1), new SpawnRainAction("minecraft:skeleton", 5, 0, 1)), 20);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_cave_spider", new SpawnRainAction("minecraft:cave_spider", 5, 0, 1)), 15);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_tnt", new SpawnAction("minecraft:tnt", 1)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_slime", new SpawnAction("minecraft:slime", 3)), 20);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_stack_creeper", new SpawnStackAction("minecraft:creeper", 5)), 20);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_wither_skeleton", new SpawnRainAction("minecraft:wither_skeleton", 5, 0, 1), new SpawnRainAction("minecraft:blaze", 1, 3, 2)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_guardian", new SpawnAction("minecraft:guardian", 5)), 10);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_jockey_chicken", new SpawnJockeyAction("minecraft:chicken", "minecraft:zombie", 1)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_stack_chicken", new SpawnStackAction("minecraft:chicken", 24)), 8);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_chicken", new SpawnRainAction("minecraft:chicken", 20, 40, 5)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_ride_player_chicken", new RidePlayerEvent("minecraft:chicken", false, "Player Jockey")), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_jockey_pig", new SpawnJockeyAction("minecraft:pig", "minecraft:zombie", 1, null, "Hog Rider")), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_villager", new SpawnAction("minecraft:villager", 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_sniffer", new SpawnAction("minecraft:sniffer", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_fish_rain", new FishRainAction(32)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_stack_cod", new SpawnStackAction("minecraft:cod", 10)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_warden", new SpawnAction("minecraft:warden", 1)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_pig", new SpawnAction("minecraft:pig", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_cow", new SpawnAction("minecraft:cow", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_sheep", new SpawnAction("minecraft:sheep", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_snow_golem", new SpawnAction("minecraft:snow_golem", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_iron_golem", new SpawnAction("minecraft:iron_golem", 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_bat", new SpawnAction("minecraft:bat", 30)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_allay", new SpawnAction("minecraft:allay", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_frog", new SpawnAction("minecraft:frog", 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_frog_2", new SpawnAction("minecraft:frog", 3)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_mooshroom", new SpawnAction("minecraft:mooshroom", 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_beehive", new SetBlockAction("minecraft:beehive", 0), new SpawnRainAction("minecraft:bee", 3, 1, 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_silverfish", new SpawnAction("minecraft:silverfish", 10)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_zoglin", new SpawnAction("minecraft:zoglin", 1)), 4);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_iron_golem", new SpawnRainAction("minecraft:iron_golem", 5, 120, 5, "Royal Recruit")), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_villager", new SpawnRainAction("minecraft:villager", 5, 72, 0), new SlimePadAction()), 3);

        EventList.addEvent(new LuckyEvent("default", "default_encase_in_box_obsidian", new EncaseInBoxAction("minecraft:obsidian", 3)), 7);
        EventList.addEvent(new LuckyEvent("default", "default_encase_in_box_tnt", new EncaseInBoxAction("minecraft:tnt", 4), new SpawnNearPlayerAction("minecraft:creeper", 1, 2)), 4);
        EventList.addEvent(new LuckyEvent("default", "default_encase_in_box_tnt_2", new EncaseInBoxAction("minecraft:tnt", 3), new SpawnNearPlayerAction("minecraft:creeper", 1, 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_lava_roof", new LavaRoofAction(4, 5, false)), 8);
        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up", new TpPlayerUpAction(10), new EncaseInBoxAction(ModList.get().isLoaded("alexscaves") ? "alexscaves:depth_glass" : "minecraft:glass", 4), new SolidBoxAction("minecraft:water", 3), new SpawnNearPlayerAction("minecraft:glow_squid", 4, 3), new SpawnNearPlayerAction(ModList.get().isLoaded("upgrade_aquatic") ? "upgrade_aquatic:thrasher" : "minecraft:guardian", 3, 3)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_tnt", new SpawnRainAction("minecraft:tnt", 10, 20, 5)), 8);
        EventList.addEvent(new LuckyEvent("default", "default_cage", new CageAction(false), new SetBlockAction("minecraft:anvil", 16)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_cage_2", new CageAction(false), new LavaRoofAction(1, 4, true)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_cage_3", new CageAction(true)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_cage_obsidian", new CageAction("minecraft:obsidian", "minecraft:obsidian", "minecraft:obsidian", true)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_water", new SetBlockAction("minecraft:water", 0), new TpPlayerUpAction(16), new SetBlockAction("minecraft:anvil", 8)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up_2", new TpPlayerUpAction(-10), new SolidSphereAction("minecraft:infested_stone", 3, true), new SolidSphereAction("minecraft:air", 2, true), new SpawnNearPlayerAction("minecraft:silverfish", 1, 1)), 1);

        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up_3", new TpPlayerUpAction(60), new SolidSphereAction("minecraft:diamond_ore", 2, true)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up_4", new TpPlayerUpAction(60), new SolidSphereAction("minecraft:cobweb", 2, true)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up_5", new TpPlayerUpAction(60), new SolidSphereAction("minecraft:gravel", 4, true)), 1);





        EventList.addEvent(new LuckyEvent("default", "default_arena", new ArenaAction(), new SpawnNearPlayerAction("minecraft:zombie", 5, 3), new SpawnNearPlayerAction("minecraft:skeleton", 5, 3)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_arena_2", new ArenaAction(), new SpawnNearPlayerAction("minecraft:ravager", 1, 3)), 3);


        EventList.addEvent(new LuckyEvent("default", "default_explode", new ExplodeAction(5)), 3);

        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_wither", new SpawnRainAction("minecraft:wither", 1, -30, 0)), 1);

        EventList.addEvent(new LuckyEvent("default", "default_item_diamond", new ItemAction("minecraft:diamond", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_item_diamond_2", new ItemAction("minecraft:diamond", 5)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_diamond_3", new ItemAction("minecraft:diamond", 8), new ItemAction("minecraft:gold_ingot", 16), new ItemAction("minecraft:iron_ingot", 16), new ItemAction("minecraft:copper_ingot", 32), new SpawnRainAction("minecraft:firework_rocket", 10, 0, 2)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_trim_materials", new TagItemAction("minecraft:trim_materials", 1, 64), new SpawnRainAction("minecraft:firework_rocket", 10, 0, 2)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_trim_materials_2", new TagItemAction("minecraft:trim_materials", 1, 16), new SpawnRainAction("minecraft:firework_rocket", 5, 0, 2)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_netherite_scrap", new ItemAction("minecraft:netherite_scrap", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_gold_ingot", new ItemAction("minecraft:gold_ingot", 32)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_iron_ingot", new ItemAction("minecraft:iron_ingot", 32)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_copper_ingot", new ItemAction("minecraft:copper_ingot", 32)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_iron_block", new ItemAction("minecraft:iron_block", 32), new ItemAction("minecraft:gold_block", 32), new ItemAction("minecraft:coal_block", 32), new SpawnAction("minecraft:firework_rocket", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_diamond_block", new SetBlockAction("minecraft:diamond_block", 0, false), new SpawnRainAction("minecraft:creeper", 10, 10, 4), new SpawnRainAction("minecraft:tnt", 1, 10, 0)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_redstone", new ItemAction("minecraft:redstone", 32), new ItemAction("minecraft:redstone_torch", 8), new ItemAction("minecraft:repeater", 3), new ItemAction("minecraft:dispenser", 2), new ItemAction("minecraft:piston", 3), new ItemAction("minecraft:hopper", 3)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_item_trident", new ItemAction("minecraft:trident", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_spyglass", new ItemAction("minecraft:spyglass", 1)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_item_sponge", new ItemAction("minecraft:sponge", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_slime_block", new ItemAction("minecraft:slime_block", 1), new MessageAction("Slime Cube!")), 1);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_bedrock", new SetBlockAction("minecraft:bedrock", 0, false), new MessageAction("That's unfortunate.")), 1);

        EventList.addEvent(new LuckyEvent("default", "default_explode_2", new ExplodeAction(2), new SetBlockAction("minecraft:ancient_debris", 0), new SolidBoxAction("minecraft:lava", 1, false)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_item_enchanted_golden_apple", new ItemAction("minecraft:enchanted_golden_apple", 1), new SpawnAction("minecraft:firework_rocket", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_item_beacon", new ItemAction("minecraft:beacon", 1), new SpawnAction("minecraft:firework_rocket", 1)), 2);
        //EventList.addEvent(new LuckyEvent(new ItemAction("minecraft:elytra", 1), new SpawnRainAction("minecraft:shulker", 5, 0, 4)), 1);

        EventList.addEvent(new LuckyEvent("default", "default_tag_item_trim_templates", new TagItemAction("minecraft:trim_templates", 1, 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_music_discs", new TagItemAction("minecraft:music_discs", 1, 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_swords", new TagItemAction("minecraft:swords", 1, 1, true), new TagItemAction("minecraft:tools", 1, 1, true)), 10);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_trimmable_armor", new TagItemAction("minecraft:trimmable_armor", 1, 2)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_wool", new TagItemAction("minecraft:wool", 1, 64)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_small_flowers", new TagItemAction("minecraft:small_flowers", 1, 32), new MessageAction("Romantic, isn't it?")), 5);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_saplings", new TagItemAction("minecraft:saplings", 1, 3)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_arrows", new TagItemAction("minecraft:arrows", 8, 3, true), new ItemAction("minecraft:bow", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_arrows_2", new TagItemAction("minecraft:arrows", 24, 1, true), new ItemAction("minecraft:bow", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_item_arrow", new ItemAction("minecraft:arrow", 32), new ItemAction("minecraft:bow", 1)), 6);
        EventList.addEvent(new LuckyEvent("default", "default_item_rotten_flesh", new ItemAction("minecraft:rotten_flesh", 1)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_ender_chest", new SetBlockAction("minecraft:ender_chest", 0, false)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_item_flint_and_steel", new ItemAction("minecraft:flint_and_steel", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_egg", new SpawnRainAction("minecraft:egg", 32, 72, 5)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_item_echo_shard", new ItemAction("minecraft:echo_shard", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_water_2", new SetBlockAction("minecraft:water", 0, false), new SpawnAction("minecraft:axolotl", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_water_3", new SetBlockAction("minecraft:water", 0, false), new SpawnAction("minecraft:turtle", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_hole", new HoleAction(2, 10), new LavaRoofAction(2, 3, true)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_item_diamond_block", new ItemAction("minecraft:diamond_block", 1), new SpawnAction("minecraft:tnt", 1), new LavaRoofAction(2, 3, false)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_diamond_block_2", new SetBlockAction("minecraft:diamond_block", 1, false), new SpawnRainAction("minecraft:tnt", 1, 5, 0)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_diamond_block_3", new SetBlockAction("minecraft:diamond_block", 1, false)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_hoes", new TagItemAction("minecraft:hoes", 1, 3)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_tag_item_hoes_2", new TagItemAction("minecraft:hoes", 1, 4), new MessageAction("Greetings, Huzz")), 1);
        EventList.addEvent(new LuckyEvent("default", "default_loot_chest_chests_buried_treasure", new LootChestAction("minecraft:chests/buried_treasure"), new SpawnRainAction("minecraft:tnt", 1, 3, 0), new SpawnRainAction("minecraft:tnt", 1, 5, 0)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_loot_chest_chests_simple_dungeon", new LootChestAction("minecraft:chests/simple_dungeon")), 5);
        EventList.addEvent(new LuckyEvent("default", "default_loot_chest_chests_desert_pyramid", new LootChestAction("minecraft:chests/desert_pyramid", true), new SetBlockAction("minecraft:tnt", -1, false)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_loot_chest_chests_bastion_bridge", new LootChestAction("minecraft:chests/bastion_bridge")), 1);
        EventList.addEvent(new LuckyEvent("default", "default_loot_chest_chests_bastion_other", new LootChestAction("minecraft:chests/bastion_other")), 1);
        EventList.addEvent(new LuckyEvent("default", "default_loot_chest_chests_woodland_mansion", new LootChestAction("minecraft:chests/woodland_mansion")), 2);
        EventList.addEvent(new LuckyEvent("default", "default_nether_reactor", new NetherReactorAction()), 3);
        EventList.addEvent(new LuckyEvent("default", "default_herobrine_totem", new HerobrineTotemAction(), new SpawnRainAction("minecraft:lightning_bolt", 5, 2, 0)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_lucky_temple", new LuckyTempleAction(true, false)), 3);
        EventList.addEvent(new LuckyEvent("default", "default_lucky_temple_2", new LuckyTempleAction(true, true)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_lucky_temple_3", new LuckyTempleAction(false, true)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up_6", new TpPlayerUpAction(500)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_hole_2", new HoleAction(2, 1000)), 1);

        EventList.addEvent(new LuckyEvent("default", "default_solid_box_coal_block", new SolidBoxAction("minecraft:coal_block", 1)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_solid_box_iron_block", new SolidBoxAction("minecraft:iron_block", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_solid_box_gold_block", new SolidBoxAction("minecraft:gold_block", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_solid_box_copper_block", new SolidBoxAction("minecraft:copper_block", 1)), 3);

        EventList.addEvent(new LuckyEvent("default", "default_solid_box_lapis_block", new SolidBoxAction("minecraft:lapis_block", 1)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_solid_box_redstone_block", new SolidBoxAction("minecraft:redstone_block", 1)), 1);

        EventList.addEvent(new LuckyEvent("default", "default_set_block_sculk_catalyst", new SetBlockAction("minecraft:sculk_catalyst", 0, false)), 1);



        EventList.addEvent(new LuckyEvent("default", "default_spawn_rain_lightning_bolt", new SpawnRainAction("minecraft:lightning_bolt", 5, 0, 3)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_spawn_creeper", new SpawnAction("minecraft:creeper", 1), new SpawnAction("minecraft:lightning_bolt", 1)), 5);

        //EventList.addEvent(new LuckyEvent(new CommandAction("/summon villager ~ ~5 ~")), 300);

        EventList.addEvent(new LuckyEvent("default", "default_feature_sculk_patch_ancient_city", new FeatureAction("minecraft:sculk_patch_ancient_city", 0), new LootChestAction("minecraft:chests/ancient_city")), 1);

        EventList.addEvent(new LuckyEvent("default", "default_feature_sculk_patch_ancient_city_2", new FeatureAction("minecraft:sculk_patch_ancient_city", 0)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_feature_sculk_patch_deep_dark", new FeatureAction("minecraft:sculk_patch_deep_dark", 0)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_set_block_torch", new SetBlockAction("minecraft:torch", 0, false), new FeatureAction("minecraft:bonus_chest", 0)), 5);
        EventList.addEvent(new LuckyEvent("default", "default_feature_mega_jungle_tree", new FeatureAction("minecraft:mega_jungle_tree", 0), new FeatureAction("minecraft:patch_melon", 0)), 1);
        //EventList.addEvent(new LuckyEvent(new FeatureAction("minecraft:amethyst_geode", 0)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_effect_levitation", new EffectAction("minecraft:levitation", 2, 20*15, true, 6D)), 2);
        EventList.addEvent(new LuckyEvent("default", "default_effect_darkness", new EffectAction("minecraft:darkness", 0, 20*20, true, 6D, "minecraft:player")), 2);
        EventList.addEvent(new LuckyEvent("default", "default_effect_wither", new EffectAction("minecraft:wither", 1, 20*10, true, 6D)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_effect_wither_2", new EffectAction("minecraft:wither", 0, 20*10, true, 6D), new EffectAction("minecraft:darkness", 0, 20*20, true, 6D, "minecraft:player")), 2);
        EventList.addEvent(new LuckyEvent("default", "default_effect_water_breathing", new EffectAction("minecraft:water_breathing", 0, 20*300, true, 6D, "minecraft:player"), new EncaseInBoxAction("minecraft:obsidian", 3), new SolidBoxAction("minecraft:water", 2), new SetBlockAction("minecraft:sea_lantern", 0, true)), 1);
        EventList.addEvent(new LuckyEvent("default", "default_tp_player_up_7", new TpPlayerUpAction(96), new EffectAction("minecraft:water_breathing", 0, 20*300, true, 6D, "minecraft:player"), new EncaseInBoxAction("minecraft:obsidian", 3), new SolidBoxAction("minecraft:water", 2), new SetBlockAction("minecraft:sea_lantern", 0, true)), 1);



        TemplePalettes.addPalette(new TemplePalette("minecraft:quartz_block", "minecraft:quartz_pillar", "minecraft:quartz_slab"), 20);
        TemplePalettes.addPalette(new TemplePalette("minecraft:stone_bricks", "minecraft:stone_bricks", "minecraft:stone_brick_slab"), 10);
        TemplePalettes.addPalette(new TemplePalette("minecraft:oak_planks", "minecraft:oak_log", "minecraft:oak_slab"), 2);
        TemplePalettes.addPalette(new TemplePalette("minecraft:oak_planks", "minecraft:oak_log", "minecraft:torch"), 2);
        
    }

    public static void addAlexCavesEvents() {
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_tremorzilla", new SpawnAction("alexscaves:tremorzilla", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_tp_player_up", new TpPlayerUpAction(20), new EncaseInBoxAction("alexscaves:depth_glass", 5), new SolidBoxAction("minecraft:water", 4), new SpawnNearPlayerAction("alexscaves:sea_pig", 5, 3), new SpawnNearPlayerAction("alexscaves:tripodfish", 3, 3), new SpawnNearPlayerAction("alexscaves:lanternfish", 10, 3)), 3);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_teletor", new SpawnRainAction("alexscaves:teletor", 3, 2, 4)), 3);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_nucleeper", new SpawnAction("alexscaves:nucleeper", 1), new SpawnRainAction("alexscaves:gammaroach", 5, 2, 3)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_arena_guanostone", new ArenaAction("alexscaves:guanostone", "alexscaves:thornwood_fence", "minecraft:air"), new SpawnNearPlayerAction("alexscaves:corrodent", 3, 2)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_arena_galena", new ArenaAction("alexscaves:galena", "alexscaves:metal_rebar", "alexscaves:metal_swarf"), new SpawnNearPlayerAction("alexscaves:ferrouslime", 3, 2)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_arena_limestone", new ArenaAction("alexscaves:limestone", "alexscaves:pewen_fence", "alexscaves:limestone_slab"), new SpawnNearPlayerAction("alexscaves:vallumraptor", 5, 3)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_gumbeeper", new SpawnRainAction("alexscaves:gumbeeper", 3, 0, 1)), 4);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_caniac", new SpawnRainAction("alexscaves:caniac", 3, 0, 1)), 4);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_vallumraptor", new SpawnRainAction("alexscaves:vallumraptor", 5, 1, 2), new SpawnRainAction("alexscaves:tremorsaurus", 1, 4, 4)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_nuclear_bomb", new SpawnRainAction("alexscaves:nuclear_bomb", 1, 256, 0), new MessageAction("RUN!!!")), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_feature_acid_lake", new FeatureAction("alexscaves:acid_lake", -1)), 1);
//        EventList.addEvent(new LuckyEvent(new FeatureAction("alexscaves:ancient_tree", 0)), 1);
//        EventList.addEvent(new LuckyEvent(new FeatureAction("alexscaves:caveman_house", 0)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_feature_scarlet_magnetic_node", new FeatureAction("alexscaves:scarlet_magnetic_node", 0)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_feature_azure_magnetic_node", new FeatureAction("alexscaves:azure_magnetic_node", 0)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_feature_scarlet_magnetic_node_2", new FeatureAction("alexscaves:scarlet_magnetic_node", 0), new EffectAction("alexscaves:magnetizing", 0, 20*30, true, 8D)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_feature_azure_magnetic_node_2", new FeatureAction("alexscaves:azure_magnetic_node", 0), new EffectAction("alexscaves:magnetizing", 0, 20*30, true, 8D)), 1);
//        EventList.addEvent(new LuckyEvent(new FeatureAction("alexscaves:tesla_bulb", 0)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_item_amber_curiosity", new ItemAction("alexscaves:amber_curiosity", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_item_tectonic_shard", new ItemAction("alexscaves:tectonic_shard", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_item_green_soylent", new ItemAction("alexscaves:green_soylent", 16), new MessageAction("I LOVE SOY!")), 5);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_subterranodon", new SpawnAction("alexscaves:subterranodon", 1), new ItemAction("alexscaves:trilocaris_tail", 5)), 3);

        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_vesper", new SpawnAction("alexscaves:vesper", 1)), 3);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_gloomoth", new SpawnRainAction("alexscaves:gloomoth", 3, 0, 1)), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_watcher", new SpawnAction("alexscaves:watcher", 1)), 1);

        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_gingerbread_man", new SpawnRainAction("alexscaves:gingerbread_man", 8, 0, 1)), 2);

        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_item_ortholance", new ItemAction("alexscaves:ortholance", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_item_magic_conch", new ItemAction("alexscaves:magic_conch", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_item_sea_staff", new ItemAction("alexscaves:sea_staff", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_tag_item_gummy_items", new TagItemAction("alexscaves:gummy_items", 1, 1)), 2);

        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_hole", new HoleAction(2, 20), new LavaRoofAction(2, 3, true, "alexscaves:acid")), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_tp_player_up_2", new TpPlayerUpAction(20), new EncaseInBoxAction("alexscaves:sugar_glass", 4), new SolidBoxAction("alexscaves:purple_soda", 3), new SpawnNearPlayerAction("alexscaves:sweetish_fish", 15, 2)), 2);

        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_explode", new ExplodeAction(0), new EffectAction("alexscaves:stunned", 0, 20*10, true, 6D)), 3);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_explode_2", new ExplodeAction(0), new EffectAction("alexscaves:stunned", 0, 20*10, true, 6D, "minecraft:player")), 2);
        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_effect_bubbled", new EffectAction("alexscaves:bubbled", 0, 20*10, true, 6D)), 5);

        EventList.addEvent(new LuckyEvent("alexcaves", "alexcaves_spawn_rain_cinder_brick", new SpawnRainAction("alexsmobs:cinder_brick", 24, 48, 5)), 3);

    }

    public static void addAlexMobsEvents() {
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_tp_player_up", new TpPlayerUpAction(20), new EncaseInBoxAction("alexsmobs:rainbow_glass", 3), new SolidBoxAction("minecraft:water", 2), new SpawnNearPlayerAction("alexsmobs:comb_jelly", 5, 2)), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_bunfungus", new SpawnAction("alexsmobs:bunfungus", 1)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_mungus", new SpawnAction("alexsmobs:mungus", 1)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_blue_jay", new SpawnRainAction("alexsmobs:blue_jay", 1, 1, 0, "Mordecai"), new SpawnAction("alexsmobs:raccoon", 1, "Rigby")), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_platypus", new SpawnAction("alexsmobs:platypus", 1, "Perry")), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_near_player_cosmic_cod", new SpawnNearPlayerAction("alexsmobs:cosmic_cod", 10, 3)), 3);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_murmur", new SpawnAction("alexsmobs:murmur", 1)), 5);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_guster", new SpawnAction("alexsmobs:guster", 1)), 8);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_warped_mosco", new SpawnRainAction("alexsmobs:warped_mosco", 1, 12, 0)), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_warped_mosco_2", new SpawnRainAction("alexsmobs:warped_mosco", 1, 48, 0, "Conquest"), new MessageAction("Stand ready for my arrival, worm!")), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_arena_dripstone_block", new ArenaAction("minecraft:dripstone_block", "minecraft:iron_bars", "minecraft:cobbled_deepslate_slab"), new SpawnNearPlayerAction("alexsmobs:rocky_roller", 3, 2)), 3);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_cockroach", new SpawnRainAction("alexsmobs:cockroach", 16, 0, 3)), 10);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_cachalot_whale", new SpawnRainAction("alexsmobs:cachalot_whale", 1, 256, 3)), 3);
        //EventList.addEvent(new LuckyEvent(new SetBlockAction("alexsmobs:sculk_boomer", -1, false), new LootChestAction("minecraft:chests/ancient_city", true)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_arena_packed_ice", new ArenaAction("minecraft:packed_ice", "minecraft:iron_bars", "minecraft:air"), new SpawnNearPlayerAction("alexsmobs:froststalker", 3, 2), new SpawnNearPlayerAction("alexsmobs:tusklin", 1, 2)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_banana_slug", new SpawnRainAction("alexsmobs:banana_slug", 5, 0, 1)), 5);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_gorilla", new SpawnAction("alexsmobs:gorilla", 1)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_stradpole", new SpawnAction("alexsmobs:stradpole", 5)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_jerboa", new SpawnRainAction("alexsmobs:jerboa", 5, 0, 1)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_anteater", new SpawnAction("alexsmobs:anteater", 1)), 2);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_item_banana", new ItemAction("alexsmobs:banana", 64), new MessageAction("Going bananas")), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_item_fish_oil", new ItemAction("alexsmobs:fish_oil", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_item_triops_eggs", new ItemAction("alexsmobs:triops_eggs", 5)), 3);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_item_strange_fish_finder", new ItemAction("alexsmobs:strange_fish_finder", 1)), 1);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_emu_egg", new SpawnRainAction("alexsmobs:emu_egg", 24, 72, 3)), 3);
        EventList.addEvent(new LuckyEvent("alexmobs", "alexmobs_spawn_rain_enderiophage_rocket", new SpawnRainAction("alexsmobs:enderiophage_rocket", 10, 0, 2)), 3);
    }

    public static void addOuterEndEvents() {
        EventList.addEvent(new LuckyEvent("outerend", "outerend_spawn_rain_sinker", new SpawnRainAction("outer_end:sinker", 5, 2, 3)), 1);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_spawn_rain_himmelite", new SpawnRainAction("outer_end:himmelite", 10, 0, 2)), 3);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_spawn_rain_purpur_golem", new SpawnRainAction("outer_end:purpur_golem", 1, 72, 0)), 1);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_spawn_rain_purpur_golem_2", new SpawnRainAction("outer_end:purpur_golem", 1, 72, 0, "Conquest"), new MessageAction("Stand ready for my arrival, worm!")), 1);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_spawn_shulker", new SpawnAction("minecraft:shulker", 1)), 2);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_solid_sphere_ominous_miasma", new SolidSphereAction("outer_end:ominous_miasma", 3, false), new EffectAction("minecraft:levitation", 1, 20*10, true, 5D)), 3);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_item_levitation_core", new ItemAction("outer_end:levitation_core", 1), new SpawnRainAction("minecraft:shulker", 3, 0, 2)), 1);
        EventList.addEvent(new LuckyEvent("outerend", "outerend_loot_chest_chests_catacomb_treasure", new LootChestAction("outer_end:chests/catacomb_treasure"), new SpawnRainAction("outer_end:entombed", 3, 0, 2)), 2);


    }

    public static void addJellyfishingEvents() {
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_tp_player_up", new TpPlayerUpAction(12), new EncaseInBoxAction(ModList.get().isLoaded("alexsmobs") ? "alexsmobs:rainbow_glass" : ModList.get().isLoaded("alexscaves") ? "alexscaves:depth_glass" : "minecraft:glass", 4), new SolidBoxAction("minecraft:water", 3), new SpawnNearPlayerAction("jellyfishing:jellyfish", 7, 3), new SpawnNearPlayerAction("jellyfishing:blue_jellyfish", 3, 3)), 1);
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_tp_player_up_2", new TpPlayerUpAction(12), new EncaseInBoxAction(ModList.get().isLoaded("alexsmobs") ? "alexsmobs:rainbow_glass" : ModList.get().isLoaded("alexscaves") ? "alexscaves:depth_glass" : "minecraft:glass", 4), new SolidBoxAction("minecraft:water", 3), new SpawnNearPlayerAction("jellyfishing:jellyfish", 4, 3), new SpawnNearPlayerAction("jellyfishing:blue_jellyfish", 1, 3), new SpawnNearPlayerAction("jellyfishing:cow_jellyfish", 1, 3), new SpawnNearPlayerAction("jellyfishing:two_fisted_jumper", 1, 3)), 1);
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_encase_in_box_jumper_jelly_block", new EncaseInBoxAction("jellyfishing:jumper_jelly_block", 3), new SolidBoxAction("minecraft:air", 2)), 2);


        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_spatula", new ItemAction("jellyfishing:spatula", 1)), 3);
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_golden_spatula", new ItemAction("jellyfishing:golden_spatula", 1)), 1);
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_jellyfish_net", new ItemAction("jellyfishing:jellyfish_net", 1)), 3);
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_jellyfish", new ItemAction("jellyfishing:net_of_jellyfish", 1)), 1);
        EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_blue_jellyfish", new ItemAction("jellyfishing:net_of_blue_jellyfish", 1)), 1);

        if (ModList.get().isLoaded("more_jellyfish")) {

            EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_diamond_jellyfish", new ItemAction("more_jellyfish:net_of_diamond_jellyfish", 1)), 1);
            EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_iron_jellyfish", new ItemAction("more_jellyfish:net_of_iron_jellyfish", 1)), 1);
            EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_gold_jellyfish", new ItemAction("more_jellyfish:net_of_gold_jellyfish", 1)), 1);
            EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_coal_jellyfish", new ItemAction("more_jellyfish:net_of_coal_jellyfish", 1)), 1);
            EventList.addEvent(new LuckyEvent("jellyfishing", "jellyfishing_item_net_of_emerald_jellyfish", new ItemAction("more_jellyfish:net_of_emerald_jellyfish", 1)), 1);
        }

        TemplePalettes.addPalette(new TemplePalette("jellyfishing:coralstone", "jellyfishing:coralstone", "jellyfishing:coralstone_slab"), 1);
        TemplePalettes.addPalette(new TemplePalette("jellyfishing:scrap_metal", "jellyfishing:scrap_metal", "jellyfishing:scrap_metal_slab"), 1);
        TemplePalettes.addPalette(new TemplePalette("jellyfishing:chrome_bricks", "jellyfishing:chrome_metal", "jellyfishing:chrome_metal_slab"), 2);

    }

    public static void addDustrialDecorEvents() {
        EventList.addEvent(new LuckyEvent("dustrialdecor", "dustrialdecor_cage_cast_iron_bricks", new CageAction("dustrial_decor:cast_iron_bricks", "dustrial_decor:cast_iron_balustrade", "dustrial_decor:cast_iron_brick_slab", false), new SpawnNearPlayerAction("minecraft:tnt", 5, 3)), 3);
        EventList.addEvent(new LuckyEvent("dustrialdecor", "dustrialdecor_cage_sheet_metal_treading", new CageAction("dustrial_decor:sheet_metal_treading", "minecraft:iron_bars", "minecraft:air", false), new SpawnRainAction("minecraft:tnt", 1, 10, 0)), 3);
        EventList.addEvent(new LuckyEvent("dustrialdecor", "dustrialdecor_arena_sheet_metal_treading", new ArenaAction("dustrial_decor:sheet_metal_treading", "minecraft:iron_bars", "dustrial_decor:sheet_metal_treading_slab"), new SpawnRainAction("minecraft:tnt", 10, 10, 4)), 1);
        EventList.addEvent(new LuckyEvent("dustrialdecor", "dustrialdecor_arena_cast_iron_bricks", new ArenaAction("dustrial_decor:cast_iron_bricks", "dustrial_decor:cast_iron_balustrade", "dustrial_decor:cast_iron_brick_slab"), new SpawnRainAction("minecraft:cave_spider", 10, 3, 2)), 2);

        EventList.addEvent(new LuckyEvent("dustrialdecor", "dustrialdecor_item_industrial_iron_billet", new ItemAction("dustrial_decor:industrial_iron_billet", 64)), 3);
        EventList.addEvent(new LuckyEvent("dustrialdecor", "dustrialdecor_item_cast_iron_billet", new ItemAction("dustrial_decor:cast_iron_billet", 64)), 3);

        TemplePalettes.addPalette(new TemplePalette("dustrial_decor:cast_iron_bricks", "dustrial_decor:cast_iron_pillar", "dustrial_decor:cast_iron_brick_slab"), 3);

    }

    public static void addBlightedBeastsEvents() {
        EventList.addEvent(new LuckyEvent("blightedbeasts", "blightedbeasts_spawn_rain_reaper", new SpawnRainAction("blighted_beasts:reaper", 5, 0, 2), new SpawnRainAction("blighted_beasts:reverb", 3, 0, 3), new SpawnRainAction("blighted_beasts:bloater", 2, 0, 3), new SpawnAction("blighted_beasts:seer", 1), new FeatureAction("minecraft:sculk_patch_ancient_city", 0)), 10);
        EventList.addEvent(new LuckyEvent("blightedbeasts", "blightedbeasts_spawn_rain_skitter", new SpawnRainAction("blighted_beasts:skitter", 3, 2, 3), new FeatureAction("minecraft:sculk_patch_deep_dark", 0)), 2);

        EventList.addEvent(new LuckyEvent("blightedbeasts", "blightedbeasts_spawn_rain_sculk_pearl", new SpawnRainAction("blighted_beasts:sculk_pearl", 1, 48, 0)), 3);
    }

    public static void addArtifactsEvents() {
        EventList.addEvent(new LuckyEvent("artifacts", "artifacts_tag_item_artifacts", new TagItemAction("artifacts:artifacts", 1, 1)), 1);
        EventList.addEvent(new LuckyEvent("artifacts", "artifacts_tag_item_artifacts_2", new TagItemAction("artifacts:artifacts", 1, 1), new HoleAction(3, 20)), 1);
        EventList.addEvent(new LuckyEvent("artifacts", "artifacts_spawn_mimic", new SpawnAction("artifacts:mimic", 1)), 1);
    }

    public static void addVouniernTurretsEvents() {
        EventList.addEvent(new LuckyEvent("vturrets", "vturrets_spawn_basic_turret_t3", new SpawnAction("v_turrets:basic_turret_t3", 1)), 3);
        EventList.addEvent(new LuckyEvent("vturrets", "vturrets_spawn_seed_turret_t3", new SpawnAction("v_turrets:seed_turret_t3", 1)), 3);
        EventList.addEvent(new LuckyEvent("vturrets", "vturrets_spawn_sniper_turret_t3", new SpawnAction("v_turrets:sniper_turret_t3", 1)), 3);
        EventList.addEvent(new LuckyEvent("vturrets", "vturrets_spawn_laser_turret_t3", new SpawnAction("v_turrets:laser_turret_t3", 1)), 1);
    }

    public static void addCompoundVEvents() {
        EventList.addEvent(new LuckyEvent("compoundv", "compoundv_item_compound_v", new ItemAction("compound_v:compound_v", 1)), 1);
        EventList.addEvent(new LuckyEvent("compoundv", "compoundv_item_temp_v", new ItemAction("compound_v:temp_v", 1)), 3);
        EventList.addEvent(new LuckyEvent("compoundv", "compoundv_effect_invincible", new EffectAction("compound_v:invincible", 0, 20*60*5, true, 8D, "minecraft:player"), new MessageAction("You're Invincible!")), 1);
        EventList.addEvent(new LuckyEvent("compoundv", "compoundv_effect_invincible_2", new EffectAction("compound_v:invincible", 0, 20*60*5, true, 5D)), 1);
    }

    public static void addJollyBoxesEvents() {
        EventList.addEvent(new LuckyEvent("jollyboxes", "jollyboxes_set_block_large_box", new SetBlockAction("jolly_boxes:large_box", 72, false)), 1);
        EventList.addEvent(new LuckyEvent("jollyboxes", "jollyboxes_set_block_medium_box", new SetBlockAction("jolly_boxes:medium_box", 72, false)), 2);
        EventList.addEvent(new LuckyEvent("jollyboxes", "jollyboxes_set_block_small_box", new SetBlockAction("jolly_boxes:small_box", 72, false)), 3);
       }

    public static void addCavernsAndChasmsEvents() {
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_spawn_mime", new SpawnAction("caverns_and_chasms:mime", 1)), 5);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_spawn_copper_golem", new SpawnAction("caverns_and_chasms:copper_golem", 1)), 3);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_spawn_rain_deeper", new SpawnRainAction("caverns_and_chasms:deeper", 3, 0, 1)), 5);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_spawn_rain_peeper", new SpawnRainAction("caverns_and_chasms:peeper", 3, 0, 1)), 5);

        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_silver_ingot", new ItemAction("caverns_and_chasms:silver_ingot", 16)), 3);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_tin_ingot", new ItemAction("caverns_and_chasms:tin_ingot", 16)), 3);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_spinel", new ItemAction("caverns_and_chasms:spinel", 16)), 2);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_zirconia", new ItemAction("caverns_and_chasms:zirconia", 8)), 2);

        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_necromium_nugget", new ItemAction("caverns_and_chasms:necromium_nugget", 1)), 3);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_netherite_nugget", new ItemAction("caverns_and_chasms:netherite_nugget", 1)), 3);
        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_item_necromium_ingot", new ItemAction("caverns_and_chasms:necromium_ingot", 1)), 1);

        EventList.addEvent(new LuckyEvent("cavernsandchasms", "cavernsandchasms_set_block_splurter", new SetBlockAction("caverns_and_chasms:splurter", 0)), 1);
    }

    public static void addCreateEvents() {
        EventList.addEvent(new LuckyEvent("create", "create_item_blaze_cake", new ItemAction("create:blaze_cake", 1)), 1);
        EventList.addEvent(new LuckyEvent("create", "create_item_brass_ingot", new ItemAction("create:brass_ingot", 32)), 3);
        EventList.addEvent(new LuckyEvent("create", "create_item_andesite_alloy", new ItemAction("create:andesite_alloy", 32)), 3);
        EventList.addEvent(new LuckyEvent("create", "create_item_zinc_ingot", new ItemAction("create:zinc_ingot", 32)), 3);
        EventList.addEvent(new LuckyEvent("create", "create_item_brass_ingot_2", new ItemAction("create:brass_ingot", 12), new ItemAction("create:zinc_ingot", 12), new ItemAction("create:andesite_alloy", 24)), 3);

        EventList.addEvent(new LuckyEvent("create", "create_cage_copper_shingles", new CageAction("create:copper_shingles", "create:copper_bars", "create:copper_shingle_slab", false), new SetBlockAction("minecraft:anvil", 16)), 1);
        EventList.addEvent(new LuckyEvent("create", "create_cage_andesite_alloy_block", new CageAction("create:andesite_alloy_block", "create:andesite_bars", "create:cut_andesite_slab", false), new SetBlockAction("minecraft:anvil", 16)), 1);

    }

    public static void addRottenCreaturesEvents() {
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_spawn_rain_frostbitten", new SpawnRainAction("rottencreatures:frostbitten", 5, 0, 1)), 3);
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_spawn_rain_burned", new SpawnRainAction("rottencreatures:burned", 5, 0, 1)), 3);
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_spawn_rain_swampy", new SpawnRainAction("rottencreatures:swampy", 5, 0, 1)), 3);
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_spawn_rain_swampy_2", new SpawnRainAction("rottencreatures:swampy", 5, 0, 1), new SpawnRainAction("minecraft:drowned", 5, 0, 1)), 3);
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_spawn_rain_undead_miner", new SpawnRainAction("rottencreatures:undead_miner", 5, 0, 1)), 3);
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_spawn_dead_beard", new SpawnAction("rottencreatures:dead_beard", 1)), 1);
        EventList.addEvent(new LuckyEvent("rottencreatures", "rottencreatures_item_treasure_chest", new ItemAction("rottencreatures:treasure_chest", 1)), 10);
    }

    public static void addDimDoorsEvents() {
        EventList.addEvent(new LuckyEvent("dimdoors", "dimdoors_encase_in_box_black_fabric", new EncaseInBoxAction("dimdoors:black_fabric", 4), new SolidBoxAction("minecraft:air", 3)), 1);
        EventList.addEvent(new LuckyEvent("dimdoors", "dimdoors_encase_in_box_white_fabric", new EncaseInBoxAction("dimdoors:white_fabric", 4), new SolidBoxAction("minecraft:air", 3)), 1);
        EventList.addEvent(new LuckyEvent("dimdoors", "dimdoors_tp_player_up", new TpPlayerUpAction(30), new EncaseInBoxAction("dimdoors:black_fabric", 4), new SolidBoxAction("minecraft:air", 3)), 1);
        EventList.addEvent(new LuckyEvent("dimdoors", "dimdoors_tp_player_up_2", new TpPlayerUpAction(30), new EncaseInBoxAction("dimdoors:white_fabric", 4), new SolidBoxAction("minecraft:air", 3)), 1);

    }

    public static void addInvincibleEvents() {
        EventList.addEvent(new LuckyEvent("invincible", "invincible_spawn_rain_viltrumite_male", new SpawnRainAction("invincible:viltrumite_male", 2, 0, 1), new SpawnRainAction("invincible:iltrumite_female", 1, 0, 1)), 1);
        EventList.addEvent(new LuckyEvent("invincible", "invincible_spawn_rain_mauler", new SpawnRainAction("invincible:mauler", 2, 0, 1)), 1);
        EventList.addEvent(new LuckyEvent("invincible", "invincible_spawn_invincible_mark", new SpawnAction("invincible:invincible_mark", 1)), 1);
    }

}

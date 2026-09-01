# Lucky Event IDs

Every outcome the mod can roll has a stable `id` and belongs to a `category`. Use the `id` values below in `safety.disabledEvents` (in the mod's config file) to turn off individual outcomes, or use the matching `events.enableXEvents` toggle to turn off an entire category at once.

This file is generated from `EventAdditions.java` - regenerate it with `scripts/gen_event_ids_doc.py` whenever events are added, removed, or reordered.

## Default (vanilla Minecraft) (`category: default`)

**264 events documented.**

| id | weight | effect |
|---|---|---|
| `default_spawn_rain_zombie` | 30 | `new SpawnRainAction("minecraft:zombie", 10, 0, 1), new SpawnAction("minecraft:creeper", 1)` |
| `default_spawn_rain_spider` | 20 | `new SpawnRainAction("minecraft:spider", 3, 0, 1), new SpawnRainAction("minecraft:skeleton", 5, 0, 1)` |
| `default_spawn_rain_cave_spider` | 15 | `new SpawnRainAction("minecraft:cave_spider", 5, 0, 1)` |
| `default_spawn_tnt` | 5 | `new SpawnAction("minecraft:tnt", 1)` |
| `default_spawn_slime` | 20 | `new SpawnAction("minecraft:slime", 3)` |
| `default_spawn_stack_creeper` | 20 | `new SpawnStackAction("minecraft:creeper", 5)` |
| `default_spawn_rain_wither_skeleton` | 5 | `new SpawnRainAction("minecraft:wither_skeleton", 5, 0, 1), new SpawnRainAction("minecraft:blaze", 1, 3, 2)` |
| `default_spawn_guardian` | 10 | `new SpawnAction("minecraft:guardian", 5)` |
| `default_spawn_jockey_chicken` | 5 | `new SpawnJockeyAction("minecraft:chicken", "minecraft:zombie", 1)` |
| `default_spawn_stack_chicken` | 8 | `new SpawnStackAction("minecraft:chicken", 24)` |
| `default_spawn_rain_chicken` | 1 | `new SpawnRainAction("minecraft:chicken", 20, 40, 5)` |
| `default_ride_player_chicken` | 5 | `new RidePlayerEvent("minecraft:chicken", false, "Player Jockey")` |
| `default_spawn_jockey_pig` | 5 | `new SpawnJockeyAction("minecraft:pig", "minecraft:zombie", 1, null, "Hog Rider")` |
| `default_spawn_villager` | 2 | `new SpawnAction("minecraft:villager", 1)` |
| `default_spawn_sniffer` | 1 | `new SpawnAction("minecraft:sniffer", 1)` |
| `default_fish_rain` | 5 | `new FishRainAction(32)` |
| `default_spawn_stack_cod` | 5 | `new SpawnStackAction("minecraft:cod", 10)` |
| `default_spawn_warden` | 5 | `new SpawnAction("minecraft:warden", 1)` |
| `default_spawn_pig` | 3 | `new SpawnAction("minecraft:pig", 1)` |
| `default_spawn_cow` | 3 | `new SpawnAction("minecraft:cow", 1)` |
| `default_spawn_sheep` | 3 | `new SpawnAction("minecraft:sheep", 1)` |
| `default_spawn_snow_golem` | 3 | `new SpawnAction("minecraft:snow_golem", 1)` |
| `default_spawn_iron_golem` | 2 | `new SpawnAction("minecraft:iron_golem", 1)` |
| `default_spawn_bat` | 3 | `new SpawnAction("minecraft:bat", 30)` |
| `default_spawn_allay` | 3 | `new SpawnAction("minecraft:allay", 1)` |
| `default_spawn_frog` | 2 | `new SpawnAction("minecraft:frog", 1)` |
| `default_spawn_frog_2` | 1 | `new SpawnAction("minecraft:frog", 3)` |
| `default_spawn_mooshroom` | 2 | `new SpawnAction("minecraft:mooshroom", 1)` |
| `default_set_block_beehive` | 2 | `new SetBlockAction("minecraft:beehive", 0), new SpawnRainAction("minecraft:bee", 3, 1, 1)` |
| `default_spawn_silverfish` | 2 | `new SpawnAction("minecraft:silverfish", 10)` |
| `default_spawn_zoglin` | 4 | `new SpawnAction("minecraft:zoglin", 1)` |
| `default_spawn_rain_iron_golem` | 5 | `new SpawnRainAction("minecraft:iron_golem", 5, 120, 5, "Royal Recruit")` |
| `default_spawn_rain_villager` | 3 | `new SpawnRainAction("minecraft:villager", 5, 72, 0), new SlimePadAction()` |
| `default_encase_in_box_obsidian` | 7 | `new EncaseInBoxAction("minecraft:obsidian", 3)` |
| `default_encase_in_box_tnt` | 4 | `new EncaseInBoxAction("minecraft:tnt", 4), new SpawnNearPlayerAction("minecraft:creeper", 1, 2)` |
| `default_encase_in_box_tnt_2` | 2 | `new EncaseInBoxAction("minecraft:tnt", 3), new SpawnNearPlayerAction("minecraft:creeper", 1, 1)` |
| `default_lava_roof` | 8 | `new LavaRoofAction(4, 5, false)` |
| `default_tp_player_up` | 5 | `new TpPlayerUpAction(10), new EncaseInBoxAction(ModList.get().isLoaded("alexscaves") ? "alexscaves:depth_glass" : "minecraft:glass", 4), new SolidBoxAction("minecraft:water", 3), new SpawnNearPlayerAction("minecraft:glow_squid", 4, 3), new SpawnNearPlayerAction(ModList.get().isLoaded("upgrade_aquatic") ? "upgrade_aquatic:thrasher" : "minecraft:guardian", 3, 3)` |
| `default_spawn_rain_tnt` | 8 | `new SpawnRainAction("minecraft:tnt", 10, 20, 5)` |
| `default_cage` | 5 | `new CageAction(false), new SetBlockAction("minecraft:anvil", 16)` |
| `default_cage_2` | 5 | `new CageAction(false), new LavaRoofAction(1, 4, true)` |
| `default_cage_3` | 5 | `new CageAction(true)` |
| `default_cage_obsidian` | 5 | `new CageAction("minecraft:obsidian", "minecraft:obsidian", "minecraft:obsidian", true)` |
| `default_set_block_water` | 5 | `new SetBlockAction("minecraft:water", 0), new TpPlayerUpAction(16), new SetBlockAction("minecraft:anvil", 8)` |
| `default_tp_player_up_2` | 1 | `new TpPlayerUpAction(-10), new SolidSphereAction("minecraft:infested_stone", 3, true), new SolidSphereAction("minecraft:air", 2, true), new SpawnNearPlayerAction("minecraft:silverfish", 1, 1)` |
| `default_tp_player_up_3` | 1 | `new TpPlayerUpAction(60), new SolidSphereAction("minecraft:diamond_ore", 2, true)` |
| `default_tp_player_up_4` | 1 | `new TpPlayerUpAction(60), new SolidSphereAction("minecraft:cobweb", 2, true)` |
| `default_tp_player_up_5` | 1 | `new TpPlayerUpAction(60), new SolidSphereAction("minecraft:gravel", 4, true)` |
| `default_arena` | 5 | `new ArenaAction(), new SpawnNearPlayerAction("minecraft:zombie", 5, 3), new SpawnNearPlayerAction("minecraft:skeleton", 5, 3)` |
| `default_arena_2` | 3 | `new ArenaAction(), new SpawnNearPlayerAction("minecraft:ravager", 1, 3)` |
| `default_explode` | 3 | `new ExplodeAction(5)` |
| `default_spawn_rain_wither` | 1 | `new SpawnRainAction("minecraft:wither", 1, -30, 0)` |
| `default_item_diamond` | 3 | `new ItemAction("minecraft:diamond", 1)` |
| `default_item_diamond_2` | 1 | `new ItemAction("minecraft:diamond", 5)` |
| `default_item_diamond_3` | 1 | `new ItemAction("minecraft:diamond", 8), new ItemAction("minecraft:gold_ingot", 16), new ItemAction("minecraft:iron_ingot", 16), new ItemAction("minecraft:copper_ingot", 32), new SpawnRainAction("minecraft:firework_rocket", 10, 0, 2)` |
| `default_tag_item_trim_materials` | 1 | `new TagItemAction("minecraft:trim_materials", 1, 64), new SpawnRainAction("minecraft:firework_rocket", 10, 0, 2)` |
| `default_tag_item_trim_materials_2` | 1 | `new TagItemAction("minecraft:trim_materials", 1, 16), new SpawnRainAction("minecraft:firework_rocket", 5, 0, 2)` |
| `default_item_netherite_scrap` | 1 | `new ItemAction("minecraft:netherite_scrap", 1)` |
| `default_item_gold_ingot` | 1 | `new ItemAction("minecraft:gold_ingot", 32)` |
| `default_item_iron_ingot` | 1 | `new ItemAction("minecraft:iron_ingot", 32)` |
| `default_item_copper_ingot` | 1 | `new ItemAction("minecraft:copper_ingot", 32)` |
| `default_item_iron_block` | 1 | `new ItemAction("minecraft:iron_block", 32), new ItemAction("minecraft:gold_block", 32), new ItemAction("minecraft:coal_block", 32), new SpawnAction("minecraft:firework_rocket", 1)` |
| `default_set_block_diamond_block` | 1 | `new SetBlockAction("minecraft:diamond_block", 0, false), new SpawnRainAction("minecraft:creeper", 10, 10, 4), new SpawnRainAction("minecraft:tnt", 1, 10, 0)` |
| `default_item_redstone` | 5 | `new ItemAction("minecraft:redstone", 32), new ItemAction("minecraft:redstone_torch", 8), new ItemAction("minecraft:repeater", 3), new ItemAction("minecraft:dispenser", 2), new ItemAction("minecraft:piston", 3), new ItemAction("minecraft:hopper", 3)` |
| `default_item_trident` | 1 | `new ItemAction("minecraft:trident", 1)` |
| `default_item_spyglass` | 5 | `new ItemAction("minecraft:spyglass", 1)` |
| `default_item_sponge` | 1 | `new ItemAction("minecraft:sponge", 1)` |
| `default_item_slime_block` | 1 | `new ItemAction("minecraft:slime_block", 1), new MessageAction("Slime Cube!")` |
| `default_set_block_bedrock` | 1 | `new SetBlockAction("minecraft:bedrock", 0, false), new MessageAction("That's unfortunate.")` |
| `default_explode_2` | 1 | `new ExplodeAction(2), new SetBlockAction("minecraft:ancient_debris", 0), new SolidBoxAction("minecraft:lava", 1, false)` |
| `default_item_enchanted_golden_apple` | 3 | `new ItemAction("minecraft:enchanted_golden_apple", 1), new SpawnAction("minecraft:firework_rocket", 1)` |
| `default_item_beacon` | 2 | `new ItemAction("minecraft:beacon", 1), new SpawnAction("minecraft:firework_rocket", 1)` |
| `default_tag_item_trim_templates` | 2 | `new TagItemAction("minecraft:trim_templates", 1, 1)` |
| `default_tag_item_music_discs` | 3 | `new TagItemAction("minecraft:music_discs", 1, 1)` |
| `default_tag_item_swords` | 10 | `new TagItemAction("minecraft:swords", 1, 1, true), new TagItemAction("minecraft:tools", 1, 1, true)` |
| `default_tag_item_trimmable_armor` | 5 | `new TagItemAction("minecraft:trimmable_armor", 1, 2)` |
| `default_tag_item_wool` | 5 | `new TagItemAction("minecraft:wool", 1, 64)` |
| `default_tag_item_small_flowers` | 5 | `new TagItemAction("minecraft:small_flowers", 1, 32), new MessageAction("Romantic, isn't it?")` |
| `default_tag_item_saplings` | 5 | `new TagItemAction("minecraft:saplings", 1, 3)` |
| `default_tag_item_arrows` | 1 | `new TagItemAction("minecraft:arrows", 8, 3, true), new ItemAction("minecraft:bow", 1)` |
| `default_tag_item_arrows_2` | 3 | `new TagItemAction("minecraft:arrows", 24, 1, true), new ItemAction("minecraft:bow", 1)` |
| `default_item_arrow` | 6 | `new ItemAction("minecraft:arrow", 32), new ItemAction("minecraft:bow", 1)` |
| `default_item_rotten_flesh` | 3 | `new ItemAction("minecraft:rotten_flesh", 1)` |
| `default_set_block_ender_chest` | 2 | `new SetBlockAction("minecraft:ender_chest", 0, false)` |
| `default_item_flint_and_steel` | 1 | `new ItemAction("minecraft:flint_and_steel", 1)` |
| `default_spawn_rain_egg` | 3 | `new SpawnRainAction("minecraft:egg", 32, 72, 5)` |
| `default_item_echo_shard` | 1 | `new ItemAction("minecraft:echo_shard", 1)` |
| `default_set_block_water_2` | 1 | `new SetBlockAction("minecraft:water", 0, false), new SpawnAction("minecraft:axolotl", 1)` |
| `default_set_block_water_3` | 1 | `new SetBlockAction("minecraft:water", 0, false), new SpawnAction("minecraft:turtle", 1)` |
| `default_hole` | 3 | `new HoleAction(2, 10), new LavaRoofAction(2, 3, true)` |
| `default_item_diamond_block` | 3 | `new ItemAction("minecraft:diamond_block", 1), new SpawnAction("minecraft:tnt", 1), new LavaRoofAction(2, 3, false)` |
| `default_set_block_diamond_block_2` | 2 | `new SetBlockAction("minecraft:diamond_block", 1, false), new SpawnRainAction("minecraft:tnt", 1, 5, 0)` |
| `default_set_block_diamond_block_3` | 1 | `new SetBlockAction("minecraft:diamond_block", 1, false)` |
| `default_tag_item_hoes` | 3 | `new TagItemAction("minecraft:hoes", 1, 3)` |
| `default_tag_item_hoes_2` | 1 | `new TagItemAction("minecraft:hoes", 1, 4), new MessageAction("Greetings, Huzz")` |
| `default_loot_chest_chests_buried_treasure` | 3 | `new LootChestAction("minecraft:chests/buried_treasure"), new SpawnRainAction("minecraft:tnt", 1, 3, 0), new SpawnRainAction("minecraft:tnt", 1, 5, 0)` |
| `default_loot_chest_chests_simple_dungeon` | 5 | `new LootChestAction("minecraft:chests/simple_dungeon")` |
| `default_loot_chest_chests_desert_pyramid` | 2 | `new LootChestAction("minecraft:chests/desert_pyramid", true), new SetBlockAction("minecraft:tnt", -1, false)` |
| `default_loot_chest_chests_bastion_bridge` | 1 | `new LootChestAction("minecraft:chests/bastion_bridge")` |
| `default_loot_chest_chests_bastion_other` | 1 | `new LootChestAction("minecraft:chests/bastion_other")` |
| `default_loot_chest_chests_woodland_mansion` | 2 | `new LootChestAction("minecraft:chests/woodland_mansion")` |
| `default_nether_reactor` | 3 | `new NetherReactorAction()` |
| `default_herobrine_totem` | 1 | `new HerobrineTotemAction(), new SpawnRainAction("minecraft:lightning_bolt", 5, 2, 0)` |
| `default_lucky_temple` | 3 | `new LuckyTempleAction(true, false)` |
| `default_lucky_temple_2` | 1 | `new LuckyTempleAction(true, true)` |
| `default_lucky_temple_3` | 1 | `new LuckyTempleAction(false, true)` |
| `default_tp_player_up_6` | 1 | `new TpPlayerUpAction(500)` |
| `default_hole_2` | 1 | `new HoleAction(2, 1000)` |
| `default_solid_box_coal_block` | 2 | `new SolidBoxAction("minecraft:coal_block", 1)` |
| `default_solid_box_iron_block` | 1 | `new SolidBoxAction("minecraft:iron_block", 1)` |
| `default_solid_box_gold_block` | 1 | `new SolidBoxAction("minecraft:gold_block", 1)` |
| `default_solid_box_copper_block` | 3 | `new SolidBoxAction("minecraft:copper_block", 1)` |
| `default_solid_box_lapis_block` | 1 | `new SolidBoxAction("minecraft:lapis_block", 1)` |
| `default_solid_box_redstone_block` | 1 | `new SolidBoxAction("minecraft:redstone_block", 1)` |
| `default_set_block_sculk_catalyst` | 1 | `new SetBlockAction("minecraft:sculk_catalyst", 0, false)` |
| `default_spawn_rain_lightning_bolt` | 5 | `new SpawnRainAction("minecraft:lightning_bolt", 5, 0, 3)` |
| `default_spawn_creeper` | 5 | `new SpawnAction("minecraft:creeper", 1), new SpawnAction("minecraft:lightning_bolt", 1)` |
| `default_feature_sculk_patch_ancient_city` | 1 | `new FeatureAction("minecraft:sculk_patch_ancient_city", 0), new LootChestAction("minecraft:chests/ancient_city")` |
| `default_feature_sculk_patch_ancient_city_2` | 1 | `new FeatureAction("minecraft:sculk_patch_ancient_city", 0)` |
| `default_feature_sculk_patch_deep_dark` | 1 | `new FeatureAction("minecraft:sculk_patch_deep_dark", 0)` |
| `default_set_block_torch` | 5 | `new SetBlockAction("minecraft:torch", 0, false), new FeatureAction("minecraft:bonus_chest", 0)` |
| `default_feature_mega_jungle_tree` | 1 | `new FeatureAction("minecraft:mega_jungle_tree", 0), new FeatureAction("minecraft:patch_melon", 0)` |
| `default_effect_levitation` | 2 | `new EffectAction("minecraft:levitation", 2, 20*15, true, 6D)` |
| `default_effect_darkness` | 2 | `new EffectAction("minecraft:darkness", 0, 20*20, true, 6D, "minecraft:player")` |
| `default_effect_wither` | 1 | `new EffectAction("minecraft:wither", 1, 20*10, true, 6D)` |
| `default_effect_wither_2` | 2 | `new EffectAction("minecraft:wither", 0, 20*10, true, 6D), new EffectAction("minecraft:darkness", 0, 20*20, true, 6D, "minecraft:player")` |
| `default_effect_water_breathing` | 1 | `new EffectAction("minecraft:water_breathing", 0, 20*300, true, 6D, "minecraft:player"), new EncaseInBoxAction("minecraft:obsidian", 3), new SolidBoxAction("minecraft:water", 2), new SetBlockAction("minecraft:sea_lantern", 0, true)` |
| `default_tp_player_up_7` | 1 | `new TpPlayerUpAction(96), new EffectAction("minecraft:water_breathing", 0, 20*300, true, 6D, "minecraft:player"), new EncaseInBoxAction("minecraft:obsidian", 3), new SolidBoxAction("minecraft:water", 2), new SetBlockAction("minecraft:sea_lantern", 0, true)` |

## Alex's Caves (`category: alexcaves`)

| id | weight | effect |
|---|---|---|
| `alexcaves_spawn_tremorzilla` | 1 | `new SpawnAction("alexscaves:tremorzilla", 1)` |
| `alexcaves_tp_player_up` | 3 | `new TpPlayerUpAction(20), new EncaseInBoxAction("alexscaves:depth_glass", 5), new SolidBoxAction("minecraft:water", 4), new SpawnNearPlayerAction("alexscaves:sea_pig", 5, 3), new SpawnNearPlayerAction("alexscaves:tripodfish", 3, 3), new SpawnNearPlayerAction("alexscaves:lanternfish", 10, 3)` |
| `alexcaves_spawn_rain_teletor` | 3 | `new SpawnRainAction("alexscaves:teletor", 3, 2, 4)` |
| `alexcaves_spawn_nucleeper` | 1 | `new SpawnAction("alexscaves:nucleeper", 1), new SpawnRainAction("alexscaves:gammaroach", 5, 2, 3)` |
| `alexcaves_arena_guanostone` | 2 | `new ArenaAction("alexscaves:guanostone", "alexscaves:thornwood_fence", "minecraft:air"), new SpawnNearPlayerAction("alexscaves:corrodent", 3, 2)` |
| `alexcaves_arena_galena` | 2 | `new ArenaAction("alexscaves:galena", "alexscaves:metal_rebar", "alexscaves:metal_swarf"), new SpawnNearPlayerAction("alexscaves:ferrouslime", 3, 2)` |
| `alexcaves_arena_limestone` | 2 | `new ArenaAction("alexscaves:limestone", "alexscaves:pewen_fence", "alexscaves:limestone_slab"), new SpawnNearPlayerAction("alexscaves:vallumraptor", 5, 3)` |
| `alexcaves_spawn_rain_gumbeeper` | 4 | `new SpawnRainAction("alexscaves:gumbeeper", 3, 0, 1)` |
| `alexcaves_spawn_rain_caniac` | 4 | `new SpawnRainAction("alexscaves:caniac", 3, 0, 1)` |
| `alexcaves_spawn_rain_vallumraptor` | 2 | `new SpawnRainAction("alexscaves:vallumraptor", 5, 1, 2), new SpawnRainAction("alexscaves:tremorsaurus", 1, 4, 4)` |
| `alexcaves_spawn_rain_nuclear_bomb` | 1 | `new SpawnRainAction("alexscaves:nuclear_bomb", 1, 256, 0), new MessageAction("RUN!!!")` |
| `alexcaves_feature_acid_lake` | 1 | `new FeatureAction("alexscaves:acid_lake", -1)` |
| `alexcaves_feature_scarlet_magnetic_node` | 1 | `new FeatureAction("alexscaves:scarlet_magnetic_node", 0)` |
| `alexcaves_feature_azure_magnetic_node` | 2 | `new FeatureAction("alexscaves:azure_magnetic_node", 0)` |
| `alexcaves_feature_scarlet_magnetic_node_2` | 2 | `new FeatureAction("alexscaves:scarlet_magnetic_node", 0), new EffectAction("alexscaves:magnetizing", 0, 20*30, true, 8D)` |
| `alexcaves_feature_azure_magnetic_node_2` | 1 | `new FeatureAction("alexscaves:azure_magnetic_node", 0), new EffectAction("alexscaves:magnetizing", 0, 20*30, true, 8D)` |
| `alexcaves_item_amber_curiosity` | 1 | `new ItemAction("alexscaves:amber_curiosity", 1)` |
| `alexcaves_item_tectonic_shard` | 1 | `new ItemAction("alexscaves:tectonic_shard", 1)` |
| `alexcaves_item_green_soylent` | 5 | `new ItemAction("alexscaves:green_soylent", 16), new MessageAction("I LOVE SOY!")` |
| `alexcaves_spawn_subterranodon` | 3 | `new SpawnAction("alexscaves:subterranodon", 1), new ItemAction("alexscaves:trilocaris_tail", 5)` |
| `alexcaves_spawn_vesper` | 3 | `new SpawnAction("alexscaves:vesper", 1)` |
| `alexcaves_spawn_rain_gloomoth` | 2 | `new SpawnRainAction("alexscaves:gloomoth", 3, 0, 1)` |
| `alexcaves_spawn_watcher` | 1 | `new SpawnAction("alexscaves:watcher", 1)` |
| `alexcaves_spawn_rain_gingerbread_man` | 2 | `new SpawnRainAction("alexscaves:gingerbread_man", 8, 0, 1)` |
| `alexcaves_item_ortholance` | 1 | `new ItemAction("alexscaves:ortholance", 1)` |
| `alexcaves_item_magic_conch` | 1 | `new ItemAction("alexscaves:magic_conch", 1)` |
| `alexcaves_item_sea_staff` | 1 | `new ItemAction("alexscaves:sea_staff", 1)` |
| `alexcaves_tag_item_gummy_items` | 2 | `new TagItemAction("alexscaves:gummy_items", 1, 1)` |
| `alexcaves_hole` | 2 | `new HoleAction(2, 20), new LavaRoofAction(2, 3, true, "alexscaves:acid")` |
| `alexcaves_tp_player_up_2` | 2 | `new TpPlayerUpAction(20), new EncaseInBoxAction("alexscaves:sugar_glass", 4), new SolidBoxAction("alexscaves:purple_soda", 3), new SpawnNearPlayerAction("alexscaves:sweetish_fish", 15, 2)` |
| `alexcaves_explode` | 3 | `new ExplodeAction(0), new EffectAction("alexscaves:stunned", 0, 20*10, true, 6D)` |
| `alexcaves_explode_2` | 2 | `new ExplodeAction(0), new EffectAction("alexscaves:stunned", 0, 20*10, true, 6D, "minecraft:player")` |
| `alexcaves_effect_bubbled` | 5 | `new EffectAction("alexscaves:bubbled", 0, 20*10, true, 6D)` |
| `alexcaves_spawn_rain_cinder_brick` | 3 | `new SpawnRainAction("alexsmobs:cinder_brick", 24, 48, 5)` |

## Alex's Mobs (`category: alexmobs`)

| id | weight | effect |
|---|---|---|
| `alexmobs_tp_player_up` | 1 | `new TpPlayerUpAction(20), new EncaseInBoxAction("alexsmobs:rainbow_glass", 3), new SolidBoxAction("minecraft:water", 2), new SpawnNearPlayerAction("alexsmobs:comb_jelly", 5, 2)` |
| `alexmobs_spawn_bunfungus` | 2 | `new SpawnAction("alexsmobs:bunfungus", 1)` |
| `alexmobs_spawn_mungus` | 2 | `new SpawnAction("alexsmobs:mungus", 1)` |
| `alexmobs_spawn_rain_blue_jay` | 1 | `new SpawnRainAction("alexsmobs:blue_jay", 1, 1, 0, "Mordecai"), new SpawnAction("alexsmobs:raccoon", 1, "Rigby")` |
| `alexmobs_spawn_platypus` | 1 | `new SpawnAction("alexsmobs:platypus", 1, "Perry")` |
| `alexmobs_spawn_near_player_cosmic_cod` | 3 | `new SpawnNearPlayerAction("alexsmobs:cosmic_cod", 10, 3)` |
| `alexmobs_spawn_murmur` | 5 | `new SpawnAction("alexsmobs:murmur", 1)` |
| `alexmobs_spawn_guster` | 8 | `new SpawnAction("alexsmobs:guster", 1)` |
| `alexmobs_spawn_rain_warped_mosco` | 1 | `new SpawnRainAction("alexsmobs:warped_mosco", 1, 12, 0)` |
| `alexmobs_spawn_rain_warped_mosco_2` | 1 | `new SpawnRainAction("alexsmobs:warped_mosco", 1, 48, 0, "Conquest"), new MessageAction("Stand ready for my arrival, worm!")` |
| `alexmobs_arena_dripstone_block` | 3 | `new ArenaAction("minecraft:dripstone_block", "minecraft:iron_bars", "minecraft:cobbled_deepslate_slab"), new SpawnNearPlayerAction("alexsmobs:rocky_roller", 3, 2)` |
| `alexmobs_spawn_rain_cockroach` | 10 | `new SpawnRainAction("alexsmobs:cockroach", 16, 0, 3)` |
| `alexmobs_spawn_rain_cachalot_whale` | 3 | `new SpawnRainAction("alexsmobs:cachalot_whale", 1, 256, 3)` |
| `alexmobs_arena_packed_ice` | 2 | `new ArenaAction("minecraft:packed_ice", "minecraft:iron_bars", "minecraft:air"), new SpawnNearPlayerAction("alexsmobs:froststalker", 3, 2), new SpawnNearPlayerAction("alexsmobs:tusklin", 1, 2)` |
| `alexmobs_spawn_rain_banana_slug` | 5 | `new SpawnRainAction("alexsmobs:banana_slug", 5, 0, 1)` |
| `alexmobs_spawn_gorilla` | 2 | `new SpawnAction("alexsmobs:gorilla", 1)` |
| `alexmobs_spawn_stradpole` | 2 | `new SpawnAction("alexsmobs:stradpole", 5)` |
| `alexmobs_spawn_rain_jerboa` | 2 | `new SpawnRainAction("alexsmobs:jerboa", 5, 0, 1)` |
| `alexmobs_spawn_anteater` | 2 | `new SpawnAction("alexsmobs:anteater", 1)` |
| `alexmobs_item_banana` | 1 | `new ItemAction("alexsmobs:banana", 64), new MessageAction("Going bananas")` |
| `alexmobs_item_fish_oil` | 1 | `new ItemAction("alexsmobs:fish_oil", 1)` |
| `alexmobs_item_triops_eggs` | 3 | `new ItemAction("alexsmobs:triops_eggs", 5)` |
| `alexmobs_item_strange_fish_finder` | 1 | `new ItemAction("alexsmobs:strange_fish_finder", 1)` |
| `alexmobs_spawn_rain_emu_egg` | 3 | `new SpawnRainAction("alexsmobs:emu_egg", 24, 72, 3)` |
| `alexmobs_spawn_rain_enderiophage_rocket` | 3 | `new SpawnRainAction("alexsmobs:enderiophage_rocket", 10, 0, 2)` |

## Outer End (`category: outerend`)

| id | weight | effect |
|---|---|---|
| `outerend_spawn_rain_sinker` | 1 | `new SpawnRainAction("outer_end:sinker", 5, 2, 3)` |
| `outerend_spawn_rain_himmelite` | 3 | `new SpawnRainAction("outer_end:himmelite", 10, 0, 2)` |
| `outerend_spawn_rain_purpur_golem` | 1 | `new SpawnRainAction("outer_end:purpur_golem", 1, 72, 0)` |
| `outerend_spawn_rain_purpur_golem_2` | 1 | `new SpawnRainAction("outer_end:purpur_golem", 1, 72, 0, "Conquest"), new MessageAction("Stand ready for my arrival, worm!")` |
| `outerend_spawn_shulker` | 2 | `new SpawnAction("minecraft:shulker", 1)` |
| `outerend_solid_sphere_ominous_miasma` | 3 | `new SolidSphereAction("outer_end:ominous_miasma", 3, false), new EffectAction("minecraft:levitation", 1, 20*10, true, 5D)` |
| `outerend_item_levitation_core` | 1 | `new ItemAction("outer_end:levitation_core", 1), new SpawnRainAction("minecraft:shulker", 3, 0, 2)` |
| `outerend_loot_chest_chests_catacomb_treasure` | 2 | `new LootChestAction("outer_end:chests/catacomb_treasure"), new SpawnRainAction("outer_end:entombed", 3, 0, 2)` |

## Jellyfishing (`category: jellyfishing`)

| id | weight | effect |
|---|---|---|
| `jellyfishing_tp_player_up` | 1 | `new TpPlayerUpAction(12), new EncaseInBoxAction(ModList.get().isLoaded("alexsmobs") ? "alexsmobs:rainbow_glass" : ModList.get().isLoaded("alexscaves") ? "alexscaves:depth_glass" : "minecraft:glass", 4), new SolidBoxAction("minecraft:water", 3), new SpawnNearPlayerAction("jellyfishing:jellyfish", 7, 3), new SpawnNearPlayerAction("jellyfishing:blue_jellyfish", 3, 3)` |
| `jellyfishing_tp_player_up_2` | 1 | `new TpPlayerUpAction(12), new EncaseInBoxAction(ModList.get().isLoaded("alexsmobs") ? "alexsmobs:rainbow_glass" : ModList.get().isLoaded("alexscaves") ? "alexscaves:depth_glass" : "minecraft:glass", 4), new SolidBoxAction("minecraft:water", 3), new SpawnNearPlayerAction("jellyfishing:jellyfish", 4, 3), new SpawnNearPlayerAction("jellyfishing:blue_jellyfish", 1, 3), new SpawnNearPlayerAction("jellyfishing:cow_jellyfish", 1, 3), new SpawnNearPlayerAction("jellyfishing:two_fisted_jumper", 1, 3)` |
| `jellyfishing_encase_in_box_jumper_jelly_block` | 2 | `new EncaseInBoxAction("jellyfishing:jumper_jelly_block", 3), new SolidBoxAction("minecraft:air", 2)` |
| `jellyfishing_item_spatula` | 3 | `new ItemAction("jellyfishing:spatula", 1)` |
| `jellyfishing_item_golden_spatula` | 1 | `new ItemAction("jellyfishing:golden_spatula", 1)` |
| `jellyfishing_item_jellyfish_net` | 3 | `new ItemAction("jellyfishing:jellyfish_net", 1)` |
| `jellyfishing_item_net_of_jellyfish` | 1 | `new ItemAction("jellyfishing:net_of_jellyfish", 1)` |
| `jellyfishing_item_net_of_blue_jellyfish` | 1 | `new ItemAction("jellyfishing:net_of_blue_jellyfish", 1)` |
| `jellyfishing_item_net_of_diamond_jellyfish` | 1 | `new ItemAction("more_jellyfish:net_of_diamond_jellyfish", 1)` |
| `jellyfishing_item_net_of_iron_jellyfish` | 1 | `new ItemAction("more_jellyfish:net_of_iron_jellyfish", 1)` |
| `jellyfishing_item_net_of_gold_jellyfish` | 1 | `new ItemAction("more_jellyfish:net_of_gold_jellyfish", 1)` |
| `jellyfishing_item_net_of_coal_jellyfish` | 1 | `new ItemAction("more_jellyfish:net_of_coal_jellyfish", 1)` |
| `jellyfishing_item_net_of_emerald_jellyfish` | 1 | `new ItemAction("more_jellyfish:net_of_emerald_jellyfish", 1)` |

## Dustrial Decor (`category: dustrialdecor`)

| id | weight | effect |
|---|---|---|
| `dustrialdecor_cage_cast_iron_bricks` | 3 | `new CageAction("dustrial_decor:cast_iron_bricks", "dustrial_decor:cast_iron_balustrade", "dustrial_decor:cast_iron_brick_slab", false), new SpawnNearPlayerAction("minecraft:tnt", 5, 3)` |
| `dustrialdecor_cage_sheet_metal_treading` | 3 | `new CageAction("dustrial_decor:sheet_metal_treading", "minecraft:iron_bars", "minecraft:air", false), new SpawnRainAction("minecraft:tnt", 1, 10, 0)` |
| `dustrialdecor_arena_sheet_metal_treading` | 1 | `new ArenaAction("dustrial_decor:sheet_metal_treading", "minecraft:iron_bars", "dustrial_decor:sheet_metal_treading_slab"), new SpawnRainAction("minecraft:tnt", 10, 10, 4)` |
| `dustrialdecor_arena_cast_iron_bricks` | 2 | `new ArenaAction("dustrial_decor:cast_iron_bricks", "dustrial_decor:cast_iron_balustrade", "dustrial_decor:cast_iron_brick_slab"), new SpawnRainAction("minecraft:cave_spider", 10, 3, 2)` |
| `dustrialdecor_item_industrial_iron_billet` | 3 | `new ItemAction("dustrial_decor:industrial_iron_billet", 64)` |
| `dustrialdecor_item_cast_iron_billet` | 3 | `new ItemAction("dustrial_decor:cast_iron_billet", 64)` |

## Blighted Beasts (`category: blightedbeasts`)

| id | weight | effect |
|---|---|---|
| `blightedbeasts_spawn_rain_reaper` | 10 | `new SpawnRainAction("blighted_beasts:reaper", 5, 0, 2), new SpawnRainAction("blighted_beasts:reverb", 3, 0, 3), new SpawnRainAction("blighted_beasts:bloater", 2, 0, 3), new SpawnAction("blighted_beasts:seer", 1), new FeatureAction("minecraft:sculk_patch_ancient_city", 0)` |
| `blightedbeasts_spawn_rain_skitter` | 2 | `new SpawnRainAction("blighted_beasts:skitter", 3, 2, 3), new FeatureAction("minecraft:sculk_patch_deep_dark", 0)` |
| `blightedbeasts_spawn_rain_sculk_pearl` | 3 | `new SpawnRainAction("blighted_beasts:sculk_pearl", 1, 48, 0)` |

## Artifacts (`category: artifacts`)

| id | weight | effect |
|---|---|---|
| `artifacts_tag_item_artifacts` | 1 | `new TagItemAction("artifacts:artifacts", 1, 1)` |
| `artifacts_tag_item_artifacts_2` | 1 | `new TagItemAction("artifacts:artifacts", 1, 1), new HoleAction(3, 20)` |
| `artifacts_spawn_mimic` | 1 | `new SpawnAction("artifacts:mimic", 1)` |

## Vounier Turrets (`category: vturrets`)

| id | weight | effect |
|---|---|---|
| `vturrets_spawn_basic_turret_t3` | 3 | `new SpawnAction("v_turrets:basic_turret_t3", 1)` |
| `vturrets_spawn_seed_turret_t3` | 3 | `new SpawnAction("v_turrets:seed_turret_t3", 1)` |
| `vturrets_spawn_sniper_turret_t3` | 3 | `new SpawnAction("v_turrets:sniper_turret_t3", 1)` |
| `vturrets_spawn_laser_turret_t3` | 1 | `new SpawnAction("v_turrets:laser_turret_t3", 1)` |

## Compound V (`category: compoundv`)

| id | weight | effect |
|---|---|---|
| `compoundv_item_compound_v` | 1 | `new ItemAction("compound_v:compound_v", 1)` |
| `compoundv_item_temp_v` | 3 | `new ItemAction("compound_v:temp_v", 1)` |
| `compoundv_effect_invincible` | 1 | `new EffectAction("compound_v:invincible", 0, 20*60*5, true, 8D, "minecraft:player"), new MessageAction("You're Invincible!")` |
| `compoundv_effect_invincible_2` | 1 | `new EffectAction("compound_v:invincible", 0, 20*60*5, true, 5D)` |

## Jolly Boxes (`category: jollyboxes`)

| id | weight | effect |
|---|---|---|
| `jollyboxes_set_block_large_box` | 1 | `new SetBlockAction("jolly_boxes:large_box", 72, false)` |
| `jollyboxes_set_block_medium_box` | 2 | `new SetBlockAction("jolly_boxes:medium_box", 72, false)` |
| `jollyboxes_set_block_small_box` | 3 | `new SetBlockAction("jolly_boxes:small_box", 72, false)` |

## Caverns & Chasms (`category: cavernsandchasms`)

| id | weight | effect |
|---|---|---|
| `cavernsandchasms_spawn_mime` | 5 | `new SpawnAction("caverns_and_chasms:mime", 1)` |
| `cavernsandchasms_spawn_copper_golem` | 3 | `new SpawnAction("caverns_and_chasms:copper_golem", 1)` |
| `cavernsandchasms_spawn_rain_deeper` | 5 | `new SpawnRainAction("caverns_and_chasms:deeper", 3, 0, 1)` |
| `cavernsandchasms_spawn_rain_peeper` | 5 | `new SpawnRainAction("caverns_and_chasms:peeper", 3, 0, 1)` |
| `cavernsandchasms_item_silver_ingot` | 3 | `new ItemAction("caverns_and_chasms:silver_ingot", 16)` |
| `cavernsandchasms_item_tin_ingot` | 3 | `new ItemAction("caverns_and_chasms:tin_ingot", 16)` |
| `cavernsandchasms_item_spinel` | 2 | `new ItemAction("caverns_and_chasms:spinel", 16)` |
| `cavernsandchasms_item_zirconia` | 2 | `new ItemAction("caverns_and_chasms:zirconia", 8)` |
| `cavernsandchasms_item_necromium_nugget` | 3 | `new ItemAction("caverns_and_chasms:necromium_nugget", 1)` |
| `cavernsandchasms_item_netherite_nugget` | 3 | `new ItemAction("caverns_and_chasms:netherite_nugget", 1)` |
| `cavernsandchasms_item_necromium_ingot` | 1 | `new ItemAction("caverns_and_chasms:necromium_ingot", 1)` |
| `cavernsandchasms_set_block_splurter` | 1 | `new SetBlockAction("caverns_and_chasms:splurter", 0)` |

## Create (`category: create`)

| id | weight | effect |
|---|---|---|
| `create_item_blaze_cake` | 1 | `new ItemAction("create:blaze_cake", 1)` |
| `create_item_brass_ingot` | 3 | `new ItemAction("create:brass_ingot", 32)` |
| `create_item_andesite_alloy` | 3 | `new ItemAction("create:andesite_alloy", 32)` |
| `create_item_zinc_ingot` | 3 | `new ItemAction("create:zinc_ingot", 32)` |
| `create_item_brass_ingot_2` | 3 | `new ItemAction("create:brass_ingot", 12), new ItemAction("create:zinc_ingot", 12), new ItemAction("create:andesite_alloy", 24)` |
| `create_cage_copper_shingles` | 1 | `new CageAction("create:copper_shingles", "create:copper_bars", "create:copper_shingle_slab", false), new SetBlockAction("minecraft:anvil", 16)` |
| `create_cage_andesite_alloy_block` | 1 | `new CageAction("create:andesite_alloy_block", "create:andesite_bars", "create:cut_andesite_slab", false), new SetBlockAction("minecraft:anvil", 16)` |

## Rotten Creatures (`category: rottencreatures`)

| id | weight | effect |
|---|---|---|
| `rottencreatures_spawn_rain_frostbitten` | 3 | `new SpawnRainAction("rottencreatures:frostbitten", 5, 0, 1)` |
| `rottencreatures_spawn_rain_burned` | 3 | `new SpawnRainAction("rottencreatures:burned", 5, 0, 1)` |
| `rottencreatures_spawn_rain_swampy` | 3 | `new SpawnRainAction("rottencreatures:swampy", 5, 0, 1)` |
| `rottencreatures_spawn_rain_swampy_2` | 3 | `new SpawnRainAction("rottencreatures:swampy", 5, 0, 1), new SpawnRainAction("minecraft:drowned", 5, 0, 1)` |
| `rottencreatures_spawn_rain_undead_miner` | 3 | `new SpawnRainAction("rottencreatures:undead_miner", 5, 0, 1)` |
| `rottencreatures_spawn_dead_beard` | 1 | `new SpawnAction("rottencreatures:dead_beard", 1)` |
| `rottencreatures_item_treasure_chest` | 10 | `new ItemAction("rottencreatures:treasure_chest", 1)` |

## Dimensional Doors (`category: dimdoors`)

| id | weight | effect |
|---|---|---|
| `dimdoors_encase_in_box_black_fabric` | 1 | `new EncaseInBoxAction("dimdoors:black_fabric", 4), new SolidBoxAction("minecraft:air", 3)` |
| `dimdoors_encase_in_box_white_fabric` | 1 | `new EncaseInBoxAction("dimdoors:white_fabric", 4), new SolidBoxAction("minecraft:air", 3)` |
| `dimdoors_tp_player_up` | 1 | `new TpPlayerUpAction(30), new EncaseInBoxAction("dimdoors:black_fabric", 4), new SolidBoxAction("minecraft:air", 3)` |
| `dimdoors_tp_player_up_2` | 1 | `new TpPlayerUpAction(30), new EncaseInBoxAction("dimdoors:white_fabric", 4), new SolidBoxAction("minecraft:air", 3)` |

## Invincible (`category: invincible`)

| id | weight | effect |
|---|---|---|
| `invincible_spawn_rain_viltrumite_male` | 1 | `new SpawnRainAction("invincible:viltrumite_male", 2, 0, 1), new SpawnRainAction("invincible:iltrumite_female", 1, 0, 1)` |
| `invincible_spawn_rain_mauler` | 1 | `new SpawnRainAction("invincible:mauler", 2, 0, 1)` |
| `invincible_spawn_invincible_mark` | 1 | `new SpawnAction("invincible:invincible_mark", 1)` |


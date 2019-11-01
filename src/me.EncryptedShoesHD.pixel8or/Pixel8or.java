package me.EncryptedShoesHD.pixel8or;

import me.EncryptedShoesHD.pixel8or.commands.PixelatorCommand;
import me.EncryptedShoesHD.pixel8or.util.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Pixel8or extends JavaPlugin {

    List<Listener> listeners = new ArrayList<>();
    List<PixelatorBlock> blocks = new ArrayList<>();
    ImageExaminer imgExaminer;
    BlockDataParser blockDataParser;
    Artist artist;

    @Override
    public void onEnable() {
        ConsoleCommandSender cmd = getServer().getConsoleSender();
        cmd.sendMessage("§7§lEnabling the Pixelator...");

        registerListeners();
        registerCommands();

        imgExaminer = new ImageExaminer(this);
        blockDataParser = new BlockDataParser(this);
        artist = new Artist(this);

        examineTextures();

        FileManager.createDirectories("plugins/Pixel8or/input");

        cmd.sendMessage("§a§lPixelator enabled!");
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender cmd = getServer().getConsoleSender();
        cmd.sendMessage("§7§lDisabling the Pixelator...");
    }

    private void registerListeners() {
        PluginManager pm = getServer().getPluginManager();

        for (Listener l : listeners) {
            pm.registerEvents(l, this);
        }
    }

    private void registerCommands() {
        getCommand("pixelator").setExecutor(new PixelatorCommand(this));
    }

    public ImageExaminer getImageExaminer() {
        return imgExaminer;
    }

    public BlockDataParser getBlockDataParser() { return blockDataParser; }

    public Artist getArtist() {
        return artist;
    }

    public List<PixelatorBlock> getBlocks() {
        return blocks;
    }

    private void examineTextures() {
        List<String> allowedBlocks = new ArrayList<>();
        allowedBlocks.add("acacia_log.png");
        allowedBlocks.add("acacia_log_top.png");
        allowedBlocks.add("acacia_planks.png");
        allowedBlocks.add("andesite.png");
        allowedBlocks.add("barrel_bottom.png");
        allowedBlocks.add("barrel_side.png");
        allowedBlocks.add("barrel_top.png");
        allowedBlocks.add("beacon.png");
        allowedBlocks.add("bedrock.png");
        allowedBlocks.add("birch_log.png");
        allowedBlocks.add("birch_log_top.png");
        allowedBlocks.add("birch_planks.png");
        allowedBlocks.add("black_concrete.png");
        allowedBlocks.add("black_concrete_powder.png");
        allowedBlocks.add("black_glazed_terracotta.png");
        allowedBlocks.add("black_shulker_box.png");
        allowedBlocks.add("black_stained_glass.png");
        allowedBlocks.add("black_terracotta.png");
        allowedBlocks.add("black_wool.png");
        allowedBlocks.add("blast_furnace_top.png");
        allowedBlocks.add("blue_concrete.png");
        allowedBlocks.add("blue_concrete_powder.png");
        allowedBlocks.add("blue_glazed_terracotta.png");
        allowedBlocks.add("blue_ice.png");
        allowedBlocks.add("blue_shulker_box.png");
        allowedBlocks.add("blue_stained_glass.png");
        allowedBlocks.add("blue_terracotta.png");
        allowedBlocks.add("blue_wool.png");
        allowedBlocks.add("bone_block_top.png");
        allowedBlocks.add("brain_coral_block.png");
        allowedBlocks.add("bricks.png");
        allowedBlocks.add("brown_concrete.png");
        allowedBlocks.add("brown_concrete_powder.png");
        allowedBlocks.add("brown_glazed_terracotta.png");
        allowedBlocks.add("brown_mushroom_block.png");
        allowedBlocks.add("brown_shulker_box.png");
        allowedBlocks.add("brown_stained_glass.png");
        allowedBlocks.add("brown_terracotta.png");
        allowedBlocks.add("brown_wool.png");
        allowedBlocks.add("bubble_coral_block.png");
        allowedBlocks.add("cartography_table_top.png");
        allowedBlocks.add("cauldron_top.png");
        allowedBlocks.add("chiseled_quartz_block_top.png");
        allowedBlocks.add("clay.png");
        allowedBlocks.add("coal_block.png");
        allowedBlocks.add("coal_ore.png");
        allowedBlocks.add("coarse_dirt.png");
        allowedBlocks.add("cobblestone.png");
        allowedBlocks.add("composter_compost.png");
        allowedBlocks.add("composter_ready.png");
        allowedBlocks.add("composter_top.png");
        allowedBlocks.add("cracked_stone_bricks.png");
        allowedBlocks.add("crafting_table_top.png");
        allowedBlocks.add("cyan_concrete.png");
        allowedBlocks.add("cyan_concrete_powder.png");
        allowedBlocks.add("cyan_glazed_terracotta.png");
        allowedBlocks.add("cyan_shulker_box.png");
        allowedBlocks.add("cyan_stained_glass.png");
        allowedBlocks.add("cyan_terracotta.png");
        allowedBlocks.add("cyan_wool.png");
        allowedBlocks.add("dark_oak_log.png");
        allowedBlocks.add("dark_oak_log_top.png");
        allowedBlocks.add("dark_oak_planks.png");
        allowedBlocks.add("dark_prismarine.png");
        allowedBlocks.add("dead_brain_coral_block.png");
        allowedBlocks.add("dead_bubble_coral_block.png");
        allowedBlocks.add("dead_fire_coral_block.png");
        allowedBlocks.add("dead_horn_coral_block.png");
        allowedBlocks.add("dead_tube_coral_block.png");
        allowedBlocks.add("diamond_block.png");
        allowedBlocks.add("diamond_ore.png");
        allowedBlocks.add("diorite.png");
        allowedBlocks.add("dirt.png");
        allowedBlocks.add("dispenser_front_vertical.png");
        allowedBlocks.add("dried_kelp_top.png");
        allowedBlocks.add("dropper_front_vertical.png");
        allowedBlocks.add("emerald_block.png");
        allowedBlocks.add("emerald_ore.png");
        allowedBlocks.add("enchanting_table_top.png");
        allowedBlocks.add("end_portal_frame_top.png");
        allowedBlocks.add("end_stone.png");
        allowedBlocks.add("end_stone_bricks.png");
        allowedBlocks.add("fire_coral_block.png");
        allowedBlocks.add("fletching_table_top.png");
        allowedBlocks.add("furnace_top.png");
        allowedBlocks.add("glass.png");
        allowedBlocks.add("glowstone.png");
        allowedBlocks.add("gold_block.png");
        allowedBlocks.add("gold_ore.png");
        allowedBlocks.add("granite.png");
        allowedBlocks.add("gravel.png");
        allowedBlocks.add("gray_concrete.png");
        allowedBlocks.add("gray_concrete_powder.png");
        allowedBlocks.add("gray_glazed_terracotta.png");
        allowedBlocks.add("gray_shulker_box.png");
        allowedBlocks.add("gray_stained_glass.png");
        allowedBlocks.add("gray_terracotta.png");
        allowedBlocks.add("gray_wool.png");
        allowedBlocks.add("green_concrete.png");
        allowedBlocks.add("green_concrete_powder.png");
        allowedBlocks.add("green_glazed_terracotta.png");
        allowedBlocks.add("green_shulker_box.png");
        allowedBlocks.add("green_stained_glass.png");
        allowedBlocks.add("green_terracotta.png");
        allowedBlocks.add("green_wool.png");
        allowedBlocks.add("hay_block_top.png");
        allowedBlocks.add("hopper_top.png");
        allowedBlocks.add("horn_coral_block.png");
        allowedBlocks.add("iron_block.png");
        allowedBlocks.add("iron_ore.png");
        allowedBlocks.add("jukebox_top.png");
        allowedBlocks.add("jungle_log.png");
        allowedBlocks.add("jungle_log_top.png");
        allowedBlocks.add("jungle_planks.png");
        allowedBlocks.add("lapis_block.png");
        allowedBlocks.add("lapis_ore.png");
        allowedBlocks.add("light_blue_concrete.png");
        allowedBlocks.add("light_blue_concrete_powder.png");
        allowedBlocks.add("light_blue_glazed_terracotta.png");
        allowedBlocks.add("light_blue_shulker_box.png");
        allowedBlocks.add("light_blue_concrete.png");
        allowedBlocks.add("light_blue_stained_glass.png");
        allowedBlocks.add("light_blue_terracotta.png");
        allowedBlocks.add("light_blue_wool.png");
        allowedBlocks.add("light_gray_concrete.png");
        allowedBlocks.add("light_gray_concrete_powder.png");
        allowedBlocks.add("light_gray_glazed_terracotta.png");
        allowedBlocks.add("light_gray_shulker_box.png");
        allowedBlocks.add("light_gray_stained_glass.png");
        allowedBlocks.add("light_gray_terracotta.png");
        allowedBlocks.add("light_gray_wool.png");
        allowedBlocks.add("lime_concrete.png");
        allowedBlocks.add("lime_concrete_powder.png");
        allowedBlocks.add("lime_glazed_terracotta.png");
        allowedBlocks.add("lime_shulker_box.png");
        allowedBlocks.add("lime_stained_glass.png");
        allowedBlocks.add("lime_terracotta.png");
        allowedBlocks.add("lime_wool.png");
        allowedBlocks.add("loom_top.png");
        allowedBlocks.add("magenta_concrete.png");
        allowedBlocks.add("magenta_concrete_powder.png");
        allowedBlocks.add("magenta_glazed_terracotta.png");
        allowedBlocks.add("magenta_shulker_box.png");
        allowedBlocks.add("magenta_stained_glass.png");
        allowedBlocks.add("magenta_terracotta.png");
        allowedBlocks.add("magenta_wool.png");
        allowedBlocks.add("melon_top.png");
        allowedBlocks.add("mossy_cobblestone.png");
        allowedBlocks.add("mossy_stone_bricks.png");
        allowedBlocks.add("mycelium_top.png");
        allowedBlocks.add("nether_bricks.png");
        allowedBlocks.add("nether_quartz_ore.png");
        allowedBlocks.add("nether_wart_block.png");
        allowedBlocks.add("netherrack.png");
        allowedBlocks.add("note_block.png");
        allowedBlocks.add("oak_log.png");
        allowedBlocks.add("oak_log_top.png");
        allowedBlocks.add("oak_planks.png");
        allowedBlocks.add("observer_back.png");
        allowedBlocks.add("observer_front.png");
        allowedBlocks.add("observer_top.png");
        allowedBlocks.add("obsidian.png");
        allowedBlocks.add("orange_concrete.png");
        allowedBlocks.add("orange_concrete_powder.png");
        allowedBlocks.add("orange_glazed_terracotta.png");
        allowedBlocks.add("orange_shulker_box.png");
        allowedBlocks.add("orange_stained_glass.png");
        allowedBlocks.add("orange_terracotta.png");
        allowedBlocks.add("orange_wool.png");
        allowedBlocks.add("packed_ice.png");
        allowedBlocks.add("pink_concrete.png");
        allowedBlocks.add("pink_concrete_powder.png");
        allowedBlocks.add("pink_glazed_terracotta.png");
        allowedBlocks.add("pink_shulker_box.png");
        allowedBlocks.add("pink_stained_glass.png");
        allowedBlocks.add("pink_terracotta.png");
        allowedBlocks.add("pink_wool.png");
        allowedBlocks.add("piston_bottom.png");
        allowedBlocks.add("piston_side.png");
        allowedBlocks.add("piston_top.png");
        allowedBlocks.add("piston_top_sticky.png");
        allowedBlocks.add("podzol_top.png");
        allowedBlocks.add("polished_andesite.png");
        allowedBlocks.add("polished_diorite.png");
        allowedBlocks.add("polished_granite.png");
        allowedBlocks.add("prismarine_bricks.png");
        allowedBlocks.add("pumpkin_top.png");
        allowedBlocks.add("purple_concrete.png");
        allowedBlocks.add("purple_concrete_powder.png");
        allowedBlocks.add("purple_glazed_terracotta.png");
        allowedBlocks.add("purple_shulker_box.png");
        allowedBlocks.add("purple_stained_glass.png");
        allowedBlocks.add("purple_terracotta.png");
        allowedBlocks.add("purple_wool.png");
        allowedBlocks.add("purpur_block.png");
        allowedBlocks.add("purpur_pillar.png");
        allowedBlocks.add("purpur_pillar_top.png");
        allowedBlocks.add("quartz_block_top.png");
        allowedBlocks.add("quartz_pillar.png");
        allowedBlocks.add("quartz_pillar_top.png");
        allowedBlocks.add("red_concrete.png");
        allowedBlocks.add("red_concrete_powder.png");
        allowedBlocks.add("red_glazed_terracotta.png");
        allowedBlocks.add("red_mushroom_block.png");
        allowedBlocks.add("red_nether_bricks.png");
        allowedBlocks.add("red_sand.png");
        allowedBlocks.add("red_sandstone_top.png");
        allowedBlocks.add("red_shulker_box.png");
        allowedBlocks.add("red_stained_glass.png");
        allowedBlocks.add("red_terracotta.png");
        allowedBlocks.add("red_wool.png");
        allowedBlocks.add("redstone_block.png");
        allowedBlocks.add("redstone_lamp.png");
        allowedBlocks.add("redstone_lamp_on.png");
        allowedBlocks.add("redstone_ore.png");
        allowedBlocks.add("sand.png");
        allowedBlocks.add("sandstone_top.png");
        allowedBlocks.add("scaffolding_top.png");
        allowedBlocks.add("shulker_box.png");
        allowedBlocks.add("slime_block.png");
        allowedBlocks.add("smithing_table_top.png");
        allowedBlocks.add("smoker_top.png");
        allowedBlocks.add("smooth_stone.png");
        allowedBlocks.add("snow.png");
        allowedBlocks.add("soul_sand.png");
        allowedBlocks.add("sponge.png");
        allowedBlocks.add("spruce_log.png");
        allowedBlocks.add("spruce_log_top.png");
        allowedBlocks.add("spruce_planks.png");
        allowedBlocks.add("stone.png");
        allowedBlocks.add("stone_bricks.png");
        allowedBlocks.add("stonecutter_top.png");
        allowedBlocks.add("stripped_acacia_log.png");
        allowedBlocks.add("stripped_acacia_log_top.png");
        allowedBlocks.add("stripped_birch_log.png");
        allowedBlocks.add("stripped_birch_log_top.png");
        allowedBlocks.add("stripped_dark_oak_log.png");
        allowedBlocks.add("stripped_dark_oak_log_top.png");
        allowedBlocks.add("stripped_jungle_log.png");
        allowedBlocks.add("stripped_jungle_log_top.png");
        allowedBlocks.add("stripped_oak_log.png");
        allowedBlocks.add("stripped_oak_log_top.png");
        allowedBlocks.add("stripped_spruce_log.png");
        allowedBlocks.add("stripped_spruce_log_top.png");
        allowedBlocks.add("terracotta.png");
        allowedBlocks.add("tnt_top.png");
        allowedBlocks.add("tube_coral_block.png");
        allowedBlocks.add("wet_sponge.png");
        allowedBlocks.add("white_concrete.png");
        allowedBlocks.add("white_concrete_powder.png");
        allowedBlocks.add("white_glazed_terracotta.png");
        allowedBlocks.add("white_shulker_box.png");
        allowedBlocks.add("white_stained_glass.png");
        allowedBlocks.add("white_terracotta.png");
        allowedBlocks.add("white_wool.png");
        allowedBlocks.add("yellow_concrete.png");
        allowedBlocks.add("yellow_concrete_powder.png");
        allowedBlocks.add("yellow_glazed_terracotta.png");
        allowedBlocks.add("yellow_stained_glass.png");
        allowedBlocks.add("yellow_terracotta.png");
        allowedBlocks.add("yellow_wool.png");

        for(int i = 0; i < allowedBlocks.size(); i++) {
            PixelatorBlock block = getImageExaminer().examineTexture(allowedBlocks.get(i));
            blocks.add(block);
        }
    }
}

package me.EncryptedShoesHD.pixel8or.util;

import me.EncryptedShoesHD.pixel8or.Pixel8or;
import org.bukkit.Location;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Artist {

    Pixel8or plugin;

    public Artist(Pixel8or plugin) {
        this.plugin = plugin;
    }

    public void draw(Location location, String fileName) {
        try{
            BufferedImage image = ImageIO.read(new File("plugins/Pixel8or/input", fileName));
            int width = image.getWidth();
            int height = image.getHeight();
            List<Integer> pixels = plugin.getImageExaminer().returnPixelList(image);
            for (int i = 0; i < pixels.size(); i++) {
                int red = (pixels.get(i) >> 16) & 0xff;
                int green = (pixels.get(i) >> 8) & 0xff;
                int blue = (pixels.get(i)) & 0xff;
                PixelatorBlock matchedBlock = findNearestMatch(new Color(red, green, blue));
                plugin.getServer().getConsoleSender().sendMessage("Found match for RGB(" + red + ", " + green + ", " + blue + "): " + matchedBlock.getBlockData().getMaterial());
                location.getBlock().setBlockData(matchedBlock.getBlockData());
                location.setX(location.getX() + 1);
                if((i + 1) % width == 0) {
                    location.setX(location.getX() - width);
                    location.setZ(location.getZ() + 1);
                }
            }
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public PixelatorBlock findNearestMatch(Color c) {
        double nearestMatch = 100000000.0d;
        PixelatorBlock matchedBlock = null;
        for(PixelatorBlock block : plugin.getBlocks()) {
            float diffR = Math.abs(c.getRed() - block.getRed());
            float diffG = Math.abs(c.getGreen() - block.getGreen());
            float diffB = Math.abs(c.getBlue() - block.getBlue());
            double difference = Math.sqrt(Math.pow(diffR, 2) + Math.pow(diffG, 2) + Math.pow(diffB, 2));
            if(difference < nearestMatch) {
                nearestMatch = difference;
                matchedBlock = block;
            }
        }
        return matchedBlock;
    }
}

package me.EncryptedShoesHD.pixel8or.util;

import me.EncryptedShoesHD.pixel8or.Pixel8or;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageExaminer {

    static Pixel8or plugin;

    public ImageExaminer(Pixel8or pixel8or) {
        plugin = pixel8or;
    }

    public PixelatorBlock examineTexture(String fileName) {
        try {
            BufferedImage texture = ImageIO.read(new File("plugins/Pixel8or/textures", fileName));
            int r = 0, g = 0, b = 0, size = texture.getWidth() * texture.getHeight();
            for(int i : returnPixelList(texture)) {
                int red = (i >> 16) & 0xff;
                int green = (i >> 8) & 0xff;
                int blue = (i) & 0xff;
                r += red;
                g += green;
                b += blue;
            }
            PixelatorBlock block = new PixelatorBlock();
            block.setRed(r / size);
            block.setGreen(g / size);
            block.setBlue(b / size);
            block.setFileName(fileName);
            plugin.getBlockDataParser().parseBlockData(block, fileName);
            return block;
        }catch(IOException ex) {
            plugin.getServer().getConsoleSender().sendMessage("Something went wrong while examining " + fileName + "!");
        }
        return null;
    }

    public List<Integer> returnPixelList(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        List<Integer> pixels = new ArrayList<>();

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                int pixel = image.getRGB(j, i);
                pixels.add(pixel);
            }
        }
        return pixels;
    }
}

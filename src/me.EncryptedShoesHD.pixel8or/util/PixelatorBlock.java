package me.EncryptedShoesHD.pixel8or.util;

import org.bukkit.block.data.BlockData;

public class PixelatorBlock {

    private float red, green, blue;
    private BlockData blockData;
    private String fileName;

    public PixelatorBlock() {
        this.red = 0f;
        this.green = 0f;
        this.blue = 0f;
        this.blockData = null;
        this.fileName = null;
    }

    public float getRed() {
        return red;
    }

    public void setRed(float red) {
        this.red = red;
    }

    public float getGreen() {
        return green;
    }

    public void setGreen(float green) {
        this.green = green;
    }

    public float getBlue() {
        return blue;
    }

    public void setBlue(float blue) {
        this.blue = blue;
    }

    public BlockData getBlockData() {
        return blockData;
    }

    public void setBlockData(BlockData blockData) {
        this.blockData = blockData;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "PixelatorBlock{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", blockData=" + blockData +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}

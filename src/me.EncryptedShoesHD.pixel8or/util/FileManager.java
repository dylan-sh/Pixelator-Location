package me.EncryptedShoesHD.pixel8or.util;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean fileExists(File f) {
        return !f.isDirectory() && f.exists();
    }

    public static void createFile(String path, String fileName) {
        createDirectories(path);

        File f = new File(path, fileName);
        if(!fileExists(f)) {
            try {
                f.createNewFile();
            }catch(IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void createDirectories(String path) {
        File pathf = new File(path);
        if(!fileExists(pathf)) pathf.mkdirs();
    }
}

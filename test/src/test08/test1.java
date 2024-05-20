package test08;

import java.io.File;

public class test1 {
    public static void main(String[] args) {
        CD();
    }

    public static void CD () {
        File[] files = File.listRoots();
        for (File file : files) {
            Find(file);
        }
    }
    public static void Find(File filename) {
        File[] files = filename.listFiles();
        if (files == null) return;
        for (File file : files) {
            if (file.isFile()) {
                String str = file.getPath();
                boolean b = str.endsWith(".mp3");
                if (b) {
                    System.out.println(str);
                }
            } else if (file.isDirectory()) {
                Find(file);
            }
        }

    }

}

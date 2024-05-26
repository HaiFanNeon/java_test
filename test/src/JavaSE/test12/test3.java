package test12;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class test3 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\Lenovo\\Desktop\\CarpetMod_V2.zip");
        File dest = new File("D:\\java_code\\java_test\\test\\src\\test12\\CarpetMod_V2.zip");

        unzip(src, dest);

    }
    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
//        ZipOutputStream zop = new ZipOutputStream(new FileOutputStream(dest));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();

            }
            zip.closeEntry();
        }
//        System.out.println(entry);
//        zop.close();
        zip.close();

    }
}

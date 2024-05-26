package test11;

import java.io.*;
import java.nio.Buffer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\java_code\\java_test\\test\\src\\test11\\txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\java_code\\java_test\\test\\src\\test11\\copy.txt"));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        bis.close();
    }
}

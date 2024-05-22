package test11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class test2 {
    public static void main(String[] args) throws IOException {
        // version -1
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy"), "UTF-8");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }
        isr.close();

        // version -2
        FileWriter fw = new FileWriter("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy", Charset.forName("UTF-8"));
        fw.write("你好");
        fw.close();
    }
}

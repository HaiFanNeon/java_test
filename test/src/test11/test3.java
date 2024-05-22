package test11;

import java.io.*;
import java.nio.charset.Charset;

public class test3 {
    public static void main(String[] args) throws IOException {
        // version 1
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy1"), "UTF-8");

        int len;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();

        // verison 2
        FileReader fr = new FileReader("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy", Charset.forName("UTF-8"));
        FileWriter fw = new FileWriter("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy2", Charset.forName("UTF-8"));

        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}

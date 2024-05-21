package test10;

import java.io.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException, InterruptedException {
        File fd = new File("D:\\java_code\\java_test\\test\\src\\test10\\text.txt");
//        FileInputStream readfd = new FileInputStream(fd);
//        int b;
//        while ((b = readfd.read()) != -1) {
//            System.out.println((char)b);
//        }
//        readfd.close();

//        String str = "你好";
//        byte[] bytes = str.getBytes();
//        System.out.println(Arrays.toString(bytes));
//
//        byte[] bytes1 = str.getBytes("GBK");
//        System.out.println(Arrays.toString(bytes1));
//
//
//        String s = new String(bytes1, "GBK");
//        System.out.println(s);


        FileWriter fw = new FileWriter(fd, true);
        fw.write("你好世界\r\n");
        fw.close();
        Thread.sleep(1000);
        FileReader fr = new FileReader(fd);
        int ch;
        char[] buffer = new char[1024];
        while ((ch = fr.read(buffer)) != -1) {
//            System.out.println(ch);
            buffer[ch] = '\n';
            System.out.println(new String(buffer, 0, ch + 1));
        }



        fr.close();
        fw.close();
    }
}

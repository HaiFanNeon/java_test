package test12;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\java_code\\java_test\\test\\src\\test12\\txt"), true);

        pw.println("hello world");

        pw.close();

    }
}

package test12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class test1 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("D:\\java_code\\java_test\\test\\src\\test12\\txt"), true, "UTF-8");
        ps.println(97);

        ps.print(true);
        ps.println();
        ps.printf("[%s:%s]", "hello", "word");
        ps.close();
    }
}

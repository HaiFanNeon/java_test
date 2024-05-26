package test08;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        File fd = new File("D:\\java_code\\java_test\\test\\src\\test08\\test");
        System.out.println(fd.delete());
    }
}

package test09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java_code\\java_test\\test\\src\\test09\\text.txt", true);
//        byte[] arr = new byte[]{97,98,99};
        String str = "adfsasdfads\r\n";
        fos.write(str.getBytes(), 0, str.length());

        fos.write("66666\r\n".getBytes());

        fos.close();

    }
}

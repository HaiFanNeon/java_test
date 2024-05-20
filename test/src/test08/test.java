package test08;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        String path = "D:\\java_code\\java_test\\test\\src\\test08";
        File fd = new File(path);
        if (!fd.exists()) {
            System.out.println(fd);
            System.exit(0);
        }

        File[] files = fd.listFiles();
        ArrayList<String> list = new ArrayList<>();
        for (File f : files) {
            String str = f.getName();
            if (str.endsWith(".mp3")) {
                list.add(str);
            }
        }
        list.forEach(System.out::println);

    }

}


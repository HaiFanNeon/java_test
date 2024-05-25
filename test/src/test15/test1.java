package test15;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\java_code\\java_test\\test\\src\\test15\\a.txt");
        Stu s = new Stu("a", 1);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        oos.writeObject(s);
        Stu o = (Stu)ois.readObject();
        System.out.println(o);
        ois.close();
        oos.close();

//        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
//        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(file));
//        byte[] bytes = new byte[1024];
//        int read = bi.read();
//        System.out.println(read);




//        boolean newFile = file.createNewFile();
//
//        System.out.println(newFile);
//
//        FileInputStream fd = new FileInputStream(file);
//        FileOutputStream fo = new FileOutputStream(file);
////        String str = "你好世界";
////        byte[] bytes = str.getBytes("UTF-8");
////        System.out.println(Arrays.toString(bytes));
////        fo.write(bytes);
////        fd.read(bytes);
////        System.out.println(new String(bytes, "UTF-8"));
////
////
//        FileWriter fw = new FileWriter(file, true);
//        String msg = "哈哈哈";
//        fw.write(msg);
//
//        FileReader fr = new FileReader(file);
//        char[] buffer = new char[1024];
//        fr.read(buffer);
//        System.out.println(Arrays.toString(buffer));
//
//        fd.close();
//        fo.close();
//        fr.close();
//        fw.close();


//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.exists());
//        System.out.println(file.length());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.delete());
//
//        File[] files = file.listFiles();
//        String[] list = file.list();
//        for (String l : list) {
//            System.out.println(l);
//        }
//        System.out.println("----------------");
//        String[] list1 = file.list();
//        for (String l : list1) {
//            System.out.println(l);
//        }

    }
}

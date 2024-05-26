package test11;

import java.io.*;

public class test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java_code\\java_test\\test\\src\\test11\\txt_copy2")));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        br.close();
        Student stu = new Student("a", 1);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\java_code\\java_test\\test\\src\\test11\\copy.txt"));


        oos.writeObject(stu);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\java_code\\java_test\\test\\src\\test11\\copy.txt"));
        Student o = (Student)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}

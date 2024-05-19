package test07;

import java.security.spec.ECField;

public class exception {
    public static void main(String[] argv) {
        Student[] stu = new Student[3];

        try {
            System.out.println(stu[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println(2);
    }
}

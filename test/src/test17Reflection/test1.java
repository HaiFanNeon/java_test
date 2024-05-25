package test17Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("test17Reflection.Stu");

        Class clazz1 = Stu.class;
        Stu s = new Stu();

        Class clazz2 = s.getClass();

        System.out.println(clazz == clazz1);
        System.out.println(clazz1 == clazz2);

        Constructor[] constructors = clazz.getConstructors();
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);
        for (var gg : constructors) {
            System.out.println(gg);
        }

        System.out.println("---------------");

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (var gg : declaredConstructors) {
            System.out.println(gg);
        }
        System.out.println("---------------");

        Field[] f = clazz.getDeclaredFields();
        for (var a : f) {
            System.out.println(a);
        }










    }
}

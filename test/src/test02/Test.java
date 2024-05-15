package test02;

public class Test {
    public static void main(String[] args) {
        Man m = new Man(1, "2", "3");

        Person p = new Person();

        Woman w = new Woman();

        func(m);
        func(p);
        func(w);
    }

    static void func(Person p) {
        p.show();
    }
}

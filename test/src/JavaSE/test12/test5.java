package test12;

public class test5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}

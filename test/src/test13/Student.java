package test13;

public class Student implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ">>" + i);
        }
    }
}
package test12;

public class MyThread extends Thread {
    static int i = 0;
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println(getName() + j);
        }
    }
}

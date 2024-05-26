package test13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class MyThread extends Thread{

    MyThread() {

    }

    MyThread(String name) {
        super(name);
    }

    static int ticket = 0;
    static Lock lock = new ReentrantLock();
//    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + ">>" + ticket);
                } else {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}

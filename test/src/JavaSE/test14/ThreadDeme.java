package test14;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDeme {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Cook c = new Cook(queue);
        c.setName("Cook");

        Foodie f = new Foodie(queue);
        f.setName("Foodie");

        c.start();
        f.start();
    }
}

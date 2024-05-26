package test13;

public class ThreadDemo {
    public static void main(String[] args) {
        P p = new P();
        V v = new V();

        p.setName("PPP");
        v.setName("VVV");

        v.start();
        p.start();

    }
}

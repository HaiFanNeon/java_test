package test13;
public class test1 {
    public static void main(String[] args) {
//        thread t  = new thread("飞机");
//        thread t1 = new thread("坦克");
//        t.setPriority(10);
//        t1.setPriority(1);
//        t.start();
//        t1.start();
//        thread t1 = new thread("AAA");
//        Student t2 = new Student("BBB");
//        t1.start();
//        t2.run();
//        thread t1 = new thread("AAA");
//        Student stu = new Student();
//        Thread t2 = new Thread(stu);
//        t2.setName("BBB");
//        t1.start();
//        t2.start();
//        t1.setDaemon(true);
//        Thread t = Thread.currentThread();
//        System.out.println(t.getPriority());
//        MyRunnable my = new MyRunnable();
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);
//
//        t1.setName("AAA");
//        t2.setName("BBB");
//
//        t1.start();
//        t2.start();

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();

    }
}

package test03;

public class Teacher extends Person implements show{

    @Override
    public void work() {
        System.out.println("Teacher's work()");
    }

    @Override
    public void show() {
        System.out.println("Teacher's show()");
    }
}

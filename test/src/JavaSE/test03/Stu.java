package test03;

public class Stu extends Person implements show{

    @Override
    public void work() {
        System.out.println("Student's word()");
    }

    @Override
    public void show() {
        System.out.println("Stu's show()");
    }
}

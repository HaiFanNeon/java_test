package test02;

public class Man extends Person{
    public Man() {
    }

    public Man(int _age, String _name, String _son) {
        super(_age, _name, _son);
    }
    public String show() {
        System.out.println("man");
        return null;
    }
}

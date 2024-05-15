package test03;

public class inclass {
    String _brand;
    String _price;
    String _color;

    Car c;

    private class Car {
        public String _engine;
        public String _engine_name;
        public void show() {
            System.out.println(_engine + " " + _engine_name);
            System.out.println(_brand);
        }
    }

    public Car getInstance() {
        return new Car();
    }

    static class Inner {
        public void show() {
            System.out.println("inner in show");
        }
    }
}

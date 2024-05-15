package test02;

public class Person {
    public int _age;
    public String _name;
    public String _son;


    public Person() {
    }

    public Person(int _age, String _name, String _son) {
        this._age = _age;
        this._name = _name;
        this._son = _son;
    }

    /**
     * 获取
     * @return _age
     */
    public int get_age() {
        return _age;
    }

    /**
     * 设置
     * @param _age
     */
    public void set_age(int _age) {
        this._age = _age;
    }

    /**
     * 获取
     * @return _name
     */
    public String get_name() {
        return _name;
    }

    /**
     * 设置
     * @param _name
     */
    public void set_name(String _name) {
        this._name = _name;
    }

    /**
     * 获取
     * @return _son
     */
    public String get_son() {
        return _son;
    }

    /**
     * 设置
     * @param _son
     */
    public void set_son(String _son) {
        this._son = _son;
    }

    public String show() {
        System.out.println("Person");
        return null;
    }
}

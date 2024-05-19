package test07;

public class Student {
    public String _name;
    public int _age;


    public Student() {
    }

    public Student(String _name, int _age) {
        this._name = _name;
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

    public String toString() {
        return "Student{_name = " + _name + ", _age = " + _age + "}";
    }
}

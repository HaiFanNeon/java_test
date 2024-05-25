package test15;

import java.io.Serial;
import java.io.Serializable;

public class Stu implements Serializable {

    @Serial
    private static final long serialVersionUID = -7485408862856210728L;

    public String name;
    public int age;


    public Stu() {
    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Stu{serialVersionUID = " + serialVersionUID + ", name = " + name + ", age = " + age + "}";
    }
}

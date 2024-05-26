package test05;

public class Template<T> {
    Object[] o = new Object[10];
    int size;

    public boolean add(T t) {
        o[size] = t;
        size++;
        return true;
    }

    public T get(int idx) {
        return (T)o[idx];
    }

}

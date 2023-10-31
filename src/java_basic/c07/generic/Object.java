package java_basic.c07.generic;

public class Object <T>{
    private T obj;

    public Object(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

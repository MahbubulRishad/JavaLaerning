package java_basic.c07.generic;

public class MainGenericTest {
    public static void main(String[] args) {

        Object<Integer> integerObject = new Object<>(25);
        System.out.println(integerObject.getObj());

        Object<Double> doubleObject = new Object<>(26.1);
        System.out.println(doubleObject.getObj());

        Object<Float> floatObject = new Object<>(24.1f);
        System.out.println(floatObject.getObj());

        Object<String> stringObject = new Object<>("Generic");
        System.out.println(stringObject.getObj());

        Object<Long> longObject = new Object<>(25554l);
        System.out.println(longObject.getObj());
    }
}

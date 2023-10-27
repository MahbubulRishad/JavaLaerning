package java_basic.c06.polymorphism.methodOverloading;

public class MainTest {
    public static void main(String[] args) {
        Summation summation = new Summation();
        summation.getSum(10,15,36,44);
        summation.getSum(10,15,36);
        summation.getSum(10,15);
        summation.getSum(10);
    }
}

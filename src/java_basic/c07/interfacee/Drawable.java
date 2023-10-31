package java_basic.c07.interfacee;

public interface Drawable {

    double SALARY = 5000.00;
    //    by default abstract
    void draw();

    //    static method
    static int cube(int x) {
        return x * x * x;
    }

    //    default method
    default void printSomething() {
        System.out.println("From Default Method");
        printPrivateMethod();
    }

    //    private method
    private void printPrivateMethod() {
        System.out.println("From Private Method");
    }


}

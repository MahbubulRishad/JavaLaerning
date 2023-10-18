package java_basic.c03.accessModifier.p1;

public class ProtectedModifier {
    //    accessible within the same package or subclasses in different packages.
    String name = "Ratin";
    protected double salary = 2500.50;

    public void printDetails() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }

}

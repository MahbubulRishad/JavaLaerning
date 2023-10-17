package java_basic.class03.accessModifier.p1;

public class DefaultModifier {
    // by default it is declared as default
//    it is accessible within the same package
    String name;
    int age;
    String address;

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

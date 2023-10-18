package java_basic.c03.accessModifier.p1;

public class PublicModifier {
    //    Accessible from everywhere
    public String name;
    public int age;

    public void printInfo() {
        System.out.println(name + ", " + age);
    }
}

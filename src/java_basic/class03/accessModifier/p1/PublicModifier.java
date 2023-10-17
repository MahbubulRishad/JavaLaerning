package java_basic.class03.accessModifier.p1;

import javax.accessibility.Accessible;

public class PublicModifier {
    //    Accessible from everywhere
    public String name;
    public int age;

    public void printInfo() {
        System.out.println(name + ", " + age);
    }
}

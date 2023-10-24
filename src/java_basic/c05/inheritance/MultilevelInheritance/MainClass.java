package java_basic.c05.inheritance.MultilevelInheritance;

public class MainClass {
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat();
        babyCat.eat(); // Inherited from Animal class
        babyCat.canMeow(); // Inherited from Cat class
        babyCat.weep();
    }
}

package java_basic.c05.inheritance.singleInheritance;

public class MainTest {
    public static void main(String[] args) {
        Man man = new Man();
        man.eat(); // inherited from parent class
        man.canSpeak();
    }
}

package java_basic.c05.inheritance.HierarchicalInheritance;

public class MainTest {
    public static void main(String[] args) {

        // Both Classes extends Animal class

        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.canJump();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.canHunt();
    }
}

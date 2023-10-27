package java_basic.c06.polymorphism.methodOverriding;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat can make Meow");
    }
}

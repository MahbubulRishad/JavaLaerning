package java_basic.c05.encapsulation;

import java_basic.c05.inheritance.singleInheritance.Animal;

public class Person extends Animal {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void canSpeak() {
        System.out.println("Person can speak");
    }
}

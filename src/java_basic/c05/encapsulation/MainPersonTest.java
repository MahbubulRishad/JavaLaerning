package java_basic.c05.encapsulation;

public class MainPersonTest {
    public static void main(String[] args) {
        Person person = new Person("RAFA", 25);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.eat();
        person.canSpeak();
    }
}

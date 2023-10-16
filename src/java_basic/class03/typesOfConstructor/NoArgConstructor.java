package java_basic.class03.typesOfConstructor;

public class NoArgConstructor {
    String name = "Asma";
    int age = 18;
    String address = "Dhaka, BD";

    public NoArgConstructor() {
        System.out.println("No Arg Constructor");
    }

    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}

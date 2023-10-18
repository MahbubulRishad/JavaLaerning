package java_basic.c03.TypesOfMethod;

public class ParameterizedMethod {
    String name;
    int age;

    public void printHeading(){
        System.out.println("Welcome to java world");
    }

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public int getAge(int age) {
        this.age = age;
        return age;
    }
}

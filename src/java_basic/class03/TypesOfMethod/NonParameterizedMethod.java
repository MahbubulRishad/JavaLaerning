package java_basic.class03.TypesOfMethod;

public class NonParameterizedMethod {
    String name;
    int age;

    public NonParameterizedMethod() {

    }

    public NonParameterizedMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}

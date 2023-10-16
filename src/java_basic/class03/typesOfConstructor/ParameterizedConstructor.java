package java_basic.class03.typesOfConstructor;

public class ParameterizedConstructor {
    private String name;
    private int age;

    public ParameterizedConstructor(String name) {
        System.out.println("Parameterized Constructor with one parameter");
        this.name = name;
    }

    public ParameterizedConstructor(String name, int age){
        System.out.println("Parameterized Constructor with two parameter");
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

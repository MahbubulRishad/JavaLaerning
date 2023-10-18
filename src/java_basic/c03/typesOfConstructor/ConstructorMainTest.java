package java_basic.c03.typesOfConstructor;

public class ConstructorMainTest {
    public static void main(String[] args) {

//        Default Constructor
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.id = 123456789;
        defaultConstructor.name = "Rafsan";
        defaultConstructor.address = "Dhaka";

        defaultConstructor.printInfo();

        System.out.println("-----------^----------");

//        No-Arg constructor
        NoArgConstructor noArgConstructor = new NoArgConstructor();
        noArgConstructor.printInfo();

        System.out.println("-----------^----------");

//        Parameterized Constructor
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor("Rajib");
        System.out.println(parameterizedConstructor.getName());
        ;

        ParameterizedConstructor parameterizedConstructor1 = new ParameterizedConstructor("Raka", 23);
        System.out.println(parameterizedConstructor1.getName() + ", " + parameterizedConstructor1.getAge());
    }
}

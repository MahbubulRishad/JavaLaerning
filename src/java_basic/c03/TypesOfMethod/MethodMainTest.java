package java_basic.c03.TypesOfMethod;

public class MethodMainTest {
    public static void main(String[] args) {
        NonParameterizedMethod nonParameterizedMethod = new NonParameterizedMethod();
        nonParameterizedMethod.name = "Foysal";
        nonParameterizedMethod.age = 20;
        nonParameterizedMethod.printInfo();

        NonParameterizedMethod nonParameterizedMethod1 =
                new NonParameterizedMethod("Rishad", 25);
        System.out.println(nonParameterizedMethod1.getName());
        System.out.println(nonParameterizedMethod1.getAge());

        System.out.println("------^--------");

        ParameterizedMethod parameterizedMethod = new ParameterizedMethod();
        parameterizedMethod.printHeading();
        System.out.println(parameterizedMethod.getName("Solil"));
        System.out.println(parameterizedMethod.getAge(26));
    }
}

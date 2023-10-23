package java_basic.c05.variable;

public class MainTest {
    public static void main(String[] args) {
        VariableTest variableTest = new VariableTest();
        variableTest.printNumber();
        System.out.println(variableTest.name);
        System.out.println(VariableTest.staticVariable);
    }
}

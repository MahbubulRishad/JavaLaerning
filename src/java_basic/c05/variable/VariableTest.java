package java_basic.c05.variable;

public class VariableTest {
//    Class variable. Area of this variable within the class
    String name = "Class Variable";

//    Static Variable. Without creating object it can be accessible
    public static String staticVariable = "Static Variable 01";

    public void printNumber(){
//        local variable. area of this variable within the method
        int num = 30;
        System.out.println("Local Variable");
    }

}

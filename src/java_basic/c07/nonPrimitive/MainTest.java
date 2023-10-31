package java_basic.c07.nonPrimitive;

public class MainTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest("String");
        System.out.println(stringTest.getString());

        DoubleTest doubleTest = new DoubleTest(25.5);
        System.out.println(doubleTest.getaDouble());

        FloatTest floatTest = new FloatTest(56.1f);
        System.out.println(floatTest.getaFloat());

        IntegerTest integerTest = new IntegerTest(21);
        System.out.println(integerTest.getAge());

        LongTest longTest = new LongTest(456489l);
        System.out.println(longTest.getaLong());
    }
}

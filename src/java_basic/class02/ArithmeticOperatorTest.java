package java_basic.class02;

public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        int n1 = 100, n2 = 10, n3;

        n3 = n1 - n2;
        System.out.println(n3); // n3=90

        n3 = n3 + n2;
        System.out.println(n3); // n3=90+10=100

        n3 = (n1 + n2) / n2; // n3=(100+10)/10=11
        System.out.println(n3);

        n2 = n3 * n2; // n2 = 11*10=110
        System.out.println(n2);

        n1 = n2 % n3; // n1=110%11=0
        System.out.println(n1);
    }
}

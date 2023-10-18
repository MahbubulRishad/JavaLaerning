package java_basic.c02;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        int a = 15, b = 5, c = 10;

        c = (a + b) > c && (b < c) ? b : c;
        System.out.println(c);

        c = ((a<b) || (b*c)<a)?b+a:c+b;
        System.out.println(c);
    }
}

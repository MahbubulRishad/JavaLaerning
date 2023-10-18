package java_basic.c02;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int a=15,b=5,c=10;

        System.out.println((a>b) && (b<c));
        System.out.println((a+b)>c && (b<c));
        System.out.println((a<b) && (b*c)>a);
        System.out.println((a<b) || (b*c)>a);
        System.out.println((a<b) || (b*c)<a);
    }
}

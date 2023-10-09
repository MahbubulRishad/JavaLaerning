package java_basic.class02;

public class AssignmentOperatorTest {
    public static void main(String[] args) {
        int a=15,b=5,c=10;

        c+=b;
        System.out.println(c);

        c-=a;
        System.out.println(c);

        c*=b;
        System.out.println(c);

        b+=c+a;
        System.out.println(b);

        b%=b;
        System.out.println(b);
    }
}

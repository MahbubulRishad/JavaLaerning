package java_basic.class02;

public class RelationalOperatorTest {
    //Relational operator returns true/false;
    public static void main(String[] args) {
        int a = 10, b = 5, c;
        System.out.println(a > b); // true

        System.out.println((15 + a) < (3 + b)); // false

        c = ((15 + a) + (3 + b)) / b;
        System.out.println(c > 500); // false

        int d = (a+a) / 4;
        System.out.println(d == b); //true

        System.out.println(d == b+1); //false

        System.out.println(d != b+1); //true
    }
}

package java_basic.c04.loopStatements;

public class DoWhileLoopTest {
    public static void main(String[] args) {
        int n = 0;

        do {
            System.out.println("loop " + n);
            n++;
        } while (n < 5);
    }
}

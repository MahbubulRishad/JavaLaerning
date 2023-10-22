package java_basic.c04.loopStatements;

public class ForLoopTest {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i += 2) {
            System.out.println("Incrementing Loop " + i);
        }

        for (j = 10; j >= 0; j--) {
            System.out.println("Decrementing Loop " + j);
        }
    }
}

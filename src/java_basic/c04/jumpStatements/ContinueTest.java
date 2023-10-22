package java_basic.c04.jumpStatements;

public class ContinueTest {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 15; i++) {
            if (i == 6)
                continue;
            System.out.println("Loop " + i);
        }
    }
}

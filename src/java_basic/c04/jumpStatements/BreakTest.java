package java_basic.c04.jumpStatements;

public class BreakTest {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 15; i++) {
            if (i == 6)
                break;
            System.out.println("Loop " + i);
        }
    }
}

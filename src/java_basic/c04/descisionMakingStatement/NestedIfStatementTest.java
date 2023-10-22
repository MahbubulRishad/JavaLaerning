package java_basic.c04.descisionMakingStatement;

public class NestedIfStatementTest {
    public static void main(String[] args) {
        int num = 7;

        if (num >= 18) {
            if (num > 23) {
                System.out.println("You might be a married person");
            }
            System.out.println("You are now an Adult");
        } else {
            System.out.println("Teenager");
            if (num < 10) {
                System.out.println("Baby");
            }
        }
    }
}

package java_basic.c04.descisionMakingStatement;

public class IfElseIfLadderTest {
    public static void main(String[] args) {
        int number = 75;

        if (number >= 80 && number <= 100) {
            System.out.println("A+");
        } else if (number >= 70 && number <= 79) {
            System.out.println("A");
        } else if (number >= 60 && number <= 69) {
            System.out.println("B");
        } else if (number >= 50 && number <= 59) {
            System.out.println("C");
        } else if (number >= 40 && number <= 49) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}

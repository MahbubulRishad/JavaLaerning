package java_basic.c04.loopStatements;

public class WhileLoopTest {
    public static void main(String[] args) {
        int i=0, j=21;

        while (i<10){
            System.out.println("While Loop "+i);
            i++;
        }

        while (j>5){
            System.out.println("Test While Loop "+ j);
            j--;
        }
    }
}

package java_basic.c06.abstraction;

public class MainTest {
    public static void main(String[] args) {
        BracBank bracBank = new BracBank();
        bracBank.printReserve();
        System.out.println(bracBank.getInterest());
        System.out.println(bracBank.getSavingInterest());
        System.out.println(bracBank.getSonaliBankExtraBonus());

        System.out.println("===========");

        SonaliBank sonaliBank = new BracBank();
        System.out.println(sonaliBank.getSonaliBankExtraBonus());
        System.out.println(sonaliBank.getSavingInterest());
    }
}

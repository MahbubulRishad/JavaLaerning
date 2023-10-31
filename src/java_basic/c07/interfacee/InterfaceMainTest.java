package java_basic.c07.interfacee;

public class InterfaceMainTest {
    public static void main(String[] args) {
        BangladeshBank bangladeshBank = new SonaliBank();
        System.out.println(bangladeshBank.getInterestRate());
        System.out.println(bangladeshBank.getLoan());

        SonaliBank sonaliBank = new SonaliBank();
        System.out.println(sonaliBank.getInterestRate());
        System.out.println(sonaliBank.getLoan());

        System.out.println("=================");

//        Calling Static method from interface
        System.out.println(Drawable.cube(4));

//        Calling Final variable from interface
        System.out.println(Drawable.SALARY);

        System.out.println("=================");

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.printSomething();
    }
}

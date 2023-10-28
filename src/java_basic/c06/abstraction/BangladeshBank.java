package java_basic.c06.abstraction;

public abstract class BangladeshBank {
    public void printReserve(){
        System.out.println("21.1 billion USD");
    }

    public abstract double getInterest();
    public abstract double getSavingInterest();

}

package java_basic.c06.abstraction;

public class BracBank extends SonaliBank{
    @Override
    public double getInterest() {
        return 5.5;
    }

    @Override
    public double getSavingInterest() {
        return 4;
    }

    @Override
    public double getSonaliBankExtraBonus() {
        return 2.5;
    }
}

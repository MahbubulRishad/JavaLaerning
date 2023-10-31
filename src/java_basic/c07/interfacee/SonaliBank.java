package java_basic.c07.interfacee;

public class SonaliBank implements BangladeshBank{
    @Override
    public double getInterestRate() {
        return 5;
    }

    @Override
    public long getLoan() {
        return 10000;
    }
}

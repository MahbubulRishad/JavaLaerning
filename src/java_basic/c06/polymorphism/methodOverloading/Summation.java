package java_basic.c06.polymorphism.methodOverloading;

public class Summation {
    int a, b, c, d, sum = 0;

//    public Summation() {
//    }
//
//    public Summation(int a) {
//        this.a = a;
//    }
//
//    public Summation(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public Summation(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    public Summation(int a, int b, int c, int d) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        this.d = d;
//    }

    public void getSum() {
        System.out.println("Provide at least one number");
    }

    public void getSum(int a) {
        sum = sum + a;
        System.out.println(sum);
    }

    public void getSum(int a, int b) {
        sum = a + b;
        System.out.println(sum);
    }

    public void getSum(int a, int b, int c) {
        sum = a + b + c;
        System.out.println(sum);
    }

    public void getSum(int a, int b, int c, int d) {
        sum = a + b + c + d;
        System.out.println(sum);
    }
}

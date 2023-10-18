package java_basic.c03.typesOfConstructor;

public class DefaultConstructor {
    int id;
    String name;
    String address;
//    Default Constructor will be created in Java Run time
    public void printInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}

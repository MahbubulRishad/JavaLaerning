package java_basic.c03.accessModifier.p1;

public class PrivateModifier {
//    private property only accessible only in class
    String name;
    private int id;
    int age;

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age);
    }
}

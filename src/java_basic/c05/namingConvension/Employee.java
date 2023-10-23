package java_basic.c05.namingConvension;

public class Employee {
    String name = "Asad";
    long id = 2015331000l;
    double salary = 5000.0;
    String address = "Dhaka";

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.printInfo();
    }
}

package java_basic.c03.simpleClass;

public class Employee {

    // properties
    String name;
    long id;
    String designation;
    int yearOfExperience;
    double salary;
    String address;

    //    constructor
    public Employee() {

    }

    //    method
    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Year of Experience: " + yearOfExperience);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }

}

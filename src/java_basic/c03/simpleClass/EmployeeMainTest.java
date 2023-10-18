package java_basic.c03.simpleClass;

public class EmployeeMainTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name ="Rishad";
        employee.id = 2015331065l;
        employee.designation = "SQAE";
        employee.yearOfExperience = 1;
        employee.salary = 500.00;
        employee.address = "Sherpur";

        employee.printEmployeeInfo();
    }
}

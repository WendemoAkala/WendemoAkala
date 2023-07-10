package EmployeeManagementSystem;

public class Employee {
    private   int id;
    private String fullName;
    private Department department; /*(Enum with 3 different departments at your choice)*/
    private double salary;
    public Employee(int id, String fullName, Department department, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        /*Print employee information*/
        System.out.println("Employee Information:");
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }


    public void getPayment() {
        /*Print employee payment*/
        System.out.println("The employee " + fullName + " got paid with salary: " + salary);
    }
}

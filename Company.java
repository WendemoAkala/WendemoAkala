package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private String companyName;
    private Address address;
    private ArrayList<Employee> employees;

    public Company(String companyName, Address address) {
        this.companyName = companyName;
        this.address = address;
        this.employees = new ArrayList<>();
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address)  {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee); /*Add an employee to the company*/
    }

    public void layoffEmployee(Employee employee)
    {
        employees.remove(employee);    /*Remove an employee from the company*/
    }

    public void printEmployees() {
        System.out.println("Employees in " + companyName + ":");
        for (Employee employee : employees) {
            employee.printEmployee();
        }
    }

    public double calculateExpenses() {
        double totalExpenses = 0;
        for (Employee employee : employees) {
            totalExpenses += employee.getSalary();
        }
        return totalExpenses; /*Calculate the expenses of the company*/
    }

    public ArrayList<Employee> sortEmployees() {
        ArrayList<Employee> sortedEmployees = new ArrayList<>(employees);
        Collections.sort(sortedEmployees, Comparator.comparingDouble(Employee::getSalary).reversed());
        return sortedEmployees; /*Sort employees by salary (highest to lowest)*/
    }
}

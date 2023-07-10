package EmployeeManagementSystem;

import java.util.ArrayList;

public class EmployeeManagementMain {
    public static void main(String[] args) {
    // Create address for the company
    Address companyAddress = new Address("Israel", "Kiryat Gat", " Street", "123");

    // Create employees
    Employee employee1 = new Employee(1, "Amir Aviv", Department.SECURITY, 15000);
    Employee employee2 = new Employee(2, "Shimon Levi", Department.IT, 24000);
    Employee employee3 = new Employee(3, "Hana Avraham", Department.FINANCE, 30000);

    // Create company and add employees
    Company company = new Company("Intel Company", companyAddress);
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        company.hireEmployee(employee3);

    // Print company information
        System.out.println("Company Information:");
        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Address: " + company.getAddress().getStreetNumber() + " " + company.getAddress().getStreet() +
            ", " + company.getAddress().getCity() + ", " + company.getAddress().getCountry());

    // Print all employees
        company.printEmployees();

    // Calculate expenses of the company
    double expenses = company.calculateExpenses();
        System.out.println("Total Expenses: " + expenses);

    // Sort employees by salary
    ArrayList<Employee> sortedEmployees = company.sortEmployees();
        System.out.println("\nSorted Employees by Salary (Highest to Lowest):");
        for (Employee employee : sortedEmployees) {
        employee.printEmployee();
    }

    // Layoff an employee
        company.layoffEmployee(employee2);
        System.out.println("\nAfter Layoff:");
        company.printEmployees();
}}

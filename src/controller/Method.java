package controller;

import models.Employee;

public class Method {
    public static void displayEmployee(Employee[] employee){
        for (Employee emp: employee) {
            System.out.println(emp);
        }
    }

    public static Employee[] addNewEmployee(Employee[] employee, Employee newEmployee){
        Employee[] employees = new Employee[employee.length+1];
        for (int i = 0; i < employees.length-1; i++){
            employees[i] = employee[i];
        }
        employees[employee.length] = newEmployee;
        return employees;
        }
    }


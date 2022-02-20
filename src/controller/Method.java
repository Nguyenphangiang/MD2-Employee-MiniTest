package controller;

import models.Employee;
import models.FulltimeEmployee;
import models.ParttimeEmployee;

import java.util.*;

public class Method {

    public static final int AVERAGE_WAGE = 10000;


    public static void displayEmployee(Employee[] employee){
        for (Employee emp: employee) {
            System.out.println(emp);
        }
    }

    public static void addNewEmployee(Employee[] employee, Employee newEmployee, int index){
        for (int i = index; i < employee.length; index++) {
            employee[index] = newEmployee;
            break;
        }
    }
    public static ArrayList averageWageEmployee(Employee[] employee, ArrayList arr){
        for (int i = 0; i < employee.length; i++) {
           if (employee[i] instanceof FulltimeEmployee){
               double netSalary = employee[i].getNetSalary();
               if (netSalary < AVERAGE_WAGE){
                   arr.add(employee[i]);
               }
           }
        } return arr;
    }
    public static void displayListEmployee(ArrayList arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    public static double getAllParttimeEmployeeSalary(Employee[] employee) {
        double salary = 0;
        double allSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof ParttimeEmployee) {
                salary = employee[i].getNetSalary();
            }
            allSalary += salary;
        }
        return allSalary;
    }
    public static List listFulltimeEmployee(Employee[] employee, List arr){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof FulltimeEmployee){
                arr.add(employee[i]);
            }
        }
        return arr;
    }
    public static void sortFulltimeEmployeeBySalary(List<Employee> fulltimeEmployeeSortBySalary) {
        Collections.sort(fulltimeEmployeeSortBySalary, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getNetSalary() > o2.getNetSalary() ? 1 : -1;
            }

        });for(Employee employee : fulltimeEmployeeSortBySalary){
            System.out.println(employee.toString());
        }
    }
}


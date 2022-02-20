package views;

import models.Employee;
import models.FulltimeEmployee;
import models.ParttimeEmployee;
import controller.Method;


import java.util.*;

public class Main {
    public static Employee[] employees;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employee: ");
        int numberOfEmployee = sc.nextInt();
        employees = new Employee[numberOfEmployee];
        int maxEmployee = 0;
        while (maxEmployee < numberOfEmployee){

            System.out.println("1. FullTime Employee." + "\n" + "2. PartTime Employee.");
            System.out.println("Enter type fo Employee: ");
            int typeOfEmployee = sc.nextInt();
            System.out.println("Enter Employee Infomation." + "Employee Number: " + (maxEmployee+1) + " Of " + numberOfEmployee );
            sc.nextLine();
            switch (typeOfEmployee){
                case 1 :
                    System.out.println("Enter Employee Code:");
                    String fulltimeEmployeeCode = sc.nextLine();
                    System.out.println("Enter Employee Name:");
                    String fulltimeEmployeeName = sc.nextLine();
                    System.out.println("Enter Employee Age:");
                    int fulltimeEmployeeAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Employee Phone:");
                    String fulltimeEmployeePhone = sc.nextLine();
                    System.out.println("Enter Employee Email:");
                    String fulltimeEmployeeEmail = sc.nextLine();
                    System.out.println("Enter Employee Bonus:");
                    double fulltimeEmployeeBonus = sc.nextDouble();
                    System.out.println("Enter Employee Fine:");
                    double fulltimeEmployeeFine = sc.nextDouble();
                    System.out.println("Enter Employee BaseSalary:");
                    double fulltimeEmployeeBaseSalary = sc.nextDouble();
                    FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(fulltimeEmployeeCode,fulltimeEmployeeName,
                            fulltimeEmployeeAge,fulltimeEmployeePhone,fulltimeEmployeeEmail
                            ,fulltimeEmployeeBonus,fulltimeEmployeeFine,fulltimeEmployeeBaseSalary);
                    Method.addNewEmployee(employees,fulltimeEmployee,maxEmployee);
                    maxEmployee++;

                    break;
                case 2 :
                    System.out.println("Enter Employee Code:");
                    String parttimeEmployeeCode = sc.nextLine();
                    System.out.println("Enter Employee Name:");
                    String parttimeEmployeeName = sc.nextLine();
                    System.out.println("Enter Employee Age:");
                    int parttimeEmployeeAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Employee Phone:");
                    String parttimeEmployeeePhone = sc.nextLine();
                    System.out.println("Enter Employee Email:");
                    String parttimeEmployeeEmail = sc.nextLine();
                    System.out.println("Enter Employee WorkHour:");
                    double parttimeEmployeeWorkHour = sc.nextDouble();
                    ParttimeEmployee parttimeEmployee = new ParttimeEmployee(parttimeEmployeeCode,parttimeEmployeeName,
                            parttimeEmployeeAge,parttimeEmployeeePhone,parttimeEmployeeEmail,parttimeEmployeeWorkHour);
                    Method.addNewEmployee(employees,parttimeEmployee,maxEmployee);
                    maxEmployee++;

                    break;
                default:
                    System.out.println("Pls choose type of employee.");
            }
        }
        Method.displayEmployee(employees);
        ArrayList lowNetSalaryEmployee = new ArrayList<>();
        Method.averageWageEmployee(employees,lowNetSalaryEmployee);
        System.out.println("Fulltime Employee has lower wage than average wage: ");
        Method.displayListEmployee(lowNetSalaryEmployee);
        System.out.println( "All Parttime Employee Salary : "+ Method.getAllParttimeEmployeeSalary(employees));
        List<Employee> fulltimeEmployeeSortBySalary = new ArrayList<Employee>();
        Method.listFulltimeEmployee(employees,fulltimeEmployeeSortBySalary);
        System.out.println("Fulltime Employee Sort By Salary : ");
        Method.sortFulltimeEmployeeBySalary(fulltimeEmployeeSortBySalary);
    }
}


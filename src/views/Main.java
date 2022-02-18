package views;

import models.Employee;
import models.FulltimeEmployee;
import models.ParttimeEmployee;


import java.util.Scanner;

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
            System.out.println("Enter Employee Infomation.");
            switch (typeOfEmployee){
                case 1 :
                    System.out.println("Enter Employee Code,Name,Age,Phone,Email,Bonus,Fine,BaseSalary: ");
                    String fulltimeEmployeeCode = sc.nextLine();
                    sc.nextLine();
                    String fulltimeEmployeeName = sc.nextLine();

                    int fulltimeEmployeeAge = sc.nextInt();
                    String fulltimeEmployeePhone = sc.nextLine();
                    sc.nextLine();
                    String fulltimeEmployeeEmail = sc.nextLine();

                    double fulltimeEmployeeBonus = sc.nextDouble();
                    double fulltimeEmployeeFine = sc.nextDouble();
                    double fulltimeEmployeeBaseSalary = sc.nextDouble();
                    Employee fulltimeEmployee = new FulltimeEmployee(fulltimeEmployeeCode,fulltimeEmployeeName,
                            fulltimeEmployeeAge,fulltimeEmployeePhone,fulltimeEmployeeEmail
                            ,fulltimeEmployeeBonus,fulltimeEmployeeFine,fulltimeEmployeeBaseSalary);
                    employees[maxEmployee] = fulltimeEmployee;
                    maxEmployee++;
                    break;
                case 2 :
                    System.out.println("Enter Employee Code,Name,Age,Phone,Email,WorkHour: ");
                    String parttimeEmployeeCode = sc.nextLine();
                    String parttimeEmployeeName = sc.nextLine();
                    sc.nextLine();
                    int parttimeEmployeeAge = sc.nextInt();
                    String parttimeEmployeeePhone = sc.nextLine();
                    String parttimeEmployeeEmail = sc.nextLine();
                    sc.nextLine();
                    double parttimeEmployeeWorkHour = sc.nextDouble();
                    Employee parttimeEmployee = new ParttimeEmployee(parttimeEmployeeCode,parttimeEmployeeName,
                            parttimeEmployeeAge,parttimeEmployeeePhone,parttimeEmployeeEmail,parttimeEmployeeWorkHour);
                    employees[maxEmployee] = parttimeEmployee;
                    maxEmployee++;
                    break;
                default:
                    System.out.println("Pls choose type of employee.");

            }
        }
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}

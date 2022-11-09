package com.bridgelabz.EmployeeWageComputation;

public class EmployeeWages {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;

        int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));

        if (employeeCheck == 2) {
            dailyWage = fullTimeHour * wagePerHour;
            System.out.println("Employee is a full time employee and his wages are " + dailyWage);
        } else if (employeeCheck == 1) {
            dailyWage = partTimeHour * wagePerHour;
            System.out.println("Employee is half time employee and his wages are " + dailyWage);
        } else {
            System.out.println("Employee is absent");
        }

    }


}

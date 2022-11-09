package com.bridgelabz.EmployeeWageComputation;

public class EmployeeWages {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int workingDays = 20;
        int FullTimeWage = 0;
        int PartTimewage = 0;
        int absent = 0;
        for (int day = 0; day < workingDays; day++) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));

            switch (employeeCheck) {
                case 2:
                    FullTimeWage = FullTimeWage + fullTimeHour * wagePerHour;

                    break;
                case 1:
                    PartTimewage = PartTimewage + partTimeHour * wagePerHour;

                    break;
                default:
                    absent++;
                    System.out.println("Employee is absent ");
            }

        }
        System.out.println("Employee is absent for " + absent);
        System.out.println("Employee full time Wages are: " + FullTimeWage);
        System.out.println("Employee Part time Wages are: " + PartTimewage);

        System.out.println("Employee total wage for a month is: " + (FullTimeWage + PartTimewage));
    }


}

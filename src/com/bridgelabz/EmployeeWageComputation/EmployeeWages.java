package com.bridgelabz.EmployeeWageComputation;

public class EmployeeWages {

    public static int fullTimeHour = 8;
    public static int partTimeHour = 4;

    public static int calcEmployeeWage(String Company, int numberOfDays, int wagePerHour, int workingHours) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWages = 0;
        int AbsentWage = 0;
        while (totalWorkingHours < workingHours && totalWorkingDays < numberOfDays) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            totalWorkingDays++;
            switch (employeeCheck) {
                case 2:
                    totalWorkingHours = totalWorkingHours + fullTimeHour;
                    totalWages = totalWages + fullTimeHour * wagePerHour;
                    System.out.println("Employee is present full time for the day : " + totalWorkingDays);
                    break;
                case 1:
                    totalWorkingHours = totalWorkingHours + partTimeHour;
                    totalWages = totalWages + partTimeHour * wagePerHour;
                    System.out.println("Employee is present Half time for the day : " + totalWorkingDays);

                    break;
                default:
                    System.out.println(
                            "Employee is absent on the day " + totalWorkingDays + " So his wages are " + AbsentWage);
            }

        }
        return totalWages;

    }


    public static void main(String[] args) {
        int numberOfDays, wagePerHour, workingHours;

        int totalEmpWage = calcEmployeeWage("Reliance", wagePerHour = 8, numberOfDays = 10, workingHours = 25);


        System.out.println("Employee total wage for Reliance Company is: " + totalEmpWage);
        int totalEmpWage1 = calcEmployeeWage("Tata", wagePerHour = 15, numberOfDays = 30, workingHours = 30);

        System.out.println("Employee total wage for tata Company is: " + totalEmpWage1);
    }


}

package com.bridgelabz.EmployeeWageComputation;

public class EmployeeWages {

    public static void main(String[] args) {

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (empCheck == 1) {
            System.out.println("Employee is present");
        } else
            System.out.println("Employee is absent");

    }
}

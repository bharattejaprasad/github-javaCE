package com.java.oops.inheritance;

public class StudentRunner {

    public static void main(String[] args) {



        Employee employee = new Employee("bharat", "Programmer Analyst");
        //employee.setName("bharat");
        employee.setEmail("bharat@gmail.com");
        employee.setPhoneNumber("923-456-7890");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.print(employee);

    }
}
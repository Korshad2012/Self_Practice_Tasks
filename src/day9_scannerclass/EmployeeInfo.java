package day9_scannerclass;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your gender: ");
        char gender = input.next().charAt(0);

        System.out.println("Enter your company name: ");
        input.nextLine();
        String companyName=input.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle=input.nextLine();

        System.out.println("Enter you salary: ");
        int salary = input.nextInt();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = $" + salary);

        input.close();


    }
}
/*
2. Create a class named EmployeeInfo and Ask the user to:
        2.1 Enter your full name
        2.2 Enter your age
        2.3 Enter your gender
        2.4 Enter your company name
        2.5 Enter your job title
        2.6 Enter your salary

        Display:
            Employee's name
            EMployee's age
            Employee's gender
            Company name
            Employee's job title
            Employee's salary
 */
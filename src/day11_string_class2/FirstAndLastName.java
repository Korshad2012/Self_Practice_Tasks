package day11_string_class2;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastName {
/*
7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Name");

        String firstName=input.next();

        System.out.println("Enter last Name");

        String lastName= input.next();

        String firstLetUp = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        String secondLetup = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

       System.out.println(firstLetUp + " " + secondLetup);

       input.close();


    }
}

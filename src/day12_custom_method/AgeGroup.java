package day12_custom_method;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        System.out.println("Enter the age:");

        int age = new Scanner(System.in).nextInt();

        ageGroup(age);

    }

    public static void ageGroup(int age) {

        String result = "";

        if (age > 0 && age <= 150) {
            if (age > 55) {
                result = "Senior";

            } else if (age >= 21) {
                result = "Adult";
            } else {
                result = "Teenager";
            }
        } else {
            System.out.println("Invalid Age");
        }
        System.out.println(result);


    }
}
/*
reate a method named ageGroup that can print the age group of the person

        age groups are:
                Teenager (< 21)
                Adult   (>=21 && <55 )
                Senior  ( > 55 )
 */
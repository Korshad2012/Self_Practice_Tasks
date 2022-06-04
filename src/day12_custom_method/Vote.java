package day12_custom_method;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        System.out.println("Enter your age:");

        int age = new Scanner(System.in).nextInt();

        System.out.println("Are you citizen? true/yes false is no");

        boolean isCitizen = new Scanner(System.in).nextBoolean();

        eligible(age, isCitizen);


    }

    // creat method here
    public static void eligible(int age, boolean isCitizen) {

        String result = "";

        if (age >= 21 && isCitizen) {
            result = "You are eligible to vote";
        } else {
            result = "you are not eligible to vote";
        }
        System.out.println(result);


    }

}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */
package day16_do_while_loop_nested_loop;

import java.util.Scanner;

public class Grade_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        double score = input.nextDouble();

        if (score > 100 || score < 0) {
            System.err.println("Invalid Entry");
            System.exit(1);
        }

        while (true) {

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }


            System.out.println("would you like to continue");
            String answer = input.next().toLowerCase();

            while (! (answer.equals("yes") || answer.equals("no"))) {

                System.out.println("invalid answer, try again");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("yes")) {
                System.out.println("Enter your score");
                score = input.nextDouble();

                if (score > 100 || score < 0) {
                    System.err.println("Invalid Entry");
                    System.exit(1);}


                } else {
                    System.out.println("Thank you for using Cydeo Grade Calculator APP");
                    return;
                }


            }


        }
    }
/*
 Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */
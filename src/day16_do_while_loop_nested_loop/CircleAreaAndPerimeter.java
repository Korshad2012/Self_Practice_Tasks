package day16_do_while_loop_nested_loop;

import java.util.Scanner;

public class CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");

        double radius = input.nextDouble();

        if (radius == 0 || radius < 0) {
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(1);
        }


        while (true){

            double diameter = radius * 2,
                    area = radius * radius * 3.14,
                    perimeter = 2 * radius * 3.14;
            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("Would you like to calculate another circle?");

            String answer = input.next().toLowerCase();


           while (! (answer.equals("yes") || answer.equals("no"))){

                System.out.println("Please re-enter valid answer");
                answer = input.next();}

               if(answer.equals("yes")){

                   System.out.println("Enter the radius of the circle:");
                   radius = input.nextDouble();
                   if(radius==0||radius<0){
                       System.err.println("Invalid Entry for the radius of the circle");
                       System.exit(1);
                   }

               }else {
                   System.out.println("Thank you for using Cydeo Circle Calculator APP");
                   return;
               }
            }


        }

    }

/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers,
                                 terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */
package day14_forloop_tasks;

import java.util.Scanner;

public class FindingMaximumNumber {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int max =-2147483648;// 10,


        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number:");
           int number = input.nextInt(); // 10, 5, 3, 20, 15
            if(number>max){
                max = number;
            }

        }// end of loop

        System.out.println("maximum number is: " + max);

    } // end of main method





}

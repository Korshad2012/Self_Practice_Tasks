package day15_while_loop_break_continue;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int n1 = input.nextInt();

        System.out.println("enter second number");
        int n2 = input.nextInt();

        int result = 0;

        while (n1 > 0 && n2 > 0) {

           // int s = n1 - n2;
            result += 1;
            n1 -= n2;
        }
        System.out.println(result);
        input.close();
    }

}
/*
 Create a class named DivideTwoNumbers and Write a program that can divide two
 positive numbers without using / (division) and * (multiplication) operators.


 */
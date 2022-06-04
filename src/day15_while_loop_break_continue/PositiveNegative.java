package day15_while_loop_break_continue;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int positiveNum = 0;
        int negativeNum = 0;

        for (int i = 0; i < 5; i++) {

            int num = input.nextInt();

            if (num > 0) {
                positiveNum ++;
            }
            if (num == 0) {
                continue;
            }
            if (num < 0) {
                negativeNum ++;
            }
        }
        System.out.println(positiveNum + " positive" + negativeNum + " negative");


    }
}


/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times,
 and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
package day9_scannerclass;

import java.util.Scanner;

public class CentsToDollar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many cents do you have?");

        int totalCents = input.nextInt();

        int dollars = totalCents/100;
        int cents = totalCents%100;

        System.out.println(totalCents + "cents equal to: " + dollars + " dollars and " + cents + "cents");

        input.close();



    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */
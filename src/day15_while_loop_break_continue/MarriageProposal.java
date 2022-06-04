package day15_while_loop_break_continue;

import java.util.Locale;
import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");

        String answer = input.next();


        while (!((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("no")))) {
            System.out.println("Invalid answer");
            answer = input.next();
        }

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Congrats");
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Goodbye");
        }


    }


}
/*
1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */
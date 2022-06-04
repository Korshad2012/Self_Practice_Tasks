package day11_string_class2;

import java.util.Scanner;

public class TwoWords {
    /*
    5. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
     */

    public static void main(String[] args) {

        System.out.println("Enter First Word");

        String input1 = new Scanner(System.in).next();

        System.out.println("Enter Second Word");

        String input2 = new Scanner(System.in).next();

        String output1 = input1.substring(1);
        String output2 = input2.substring(1);

        System.out.println(output1+output2);
    }
}

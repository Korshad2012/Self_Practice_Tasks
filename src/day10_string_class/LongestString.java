package day10_string_class;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings:");

        String string1 = input.next();
        String string2 = input.next();

        input.close();

        String result = "";

        if (string1.length() > string2.length()) {
            result = string1 + "is the longest string";
        } else if (string2.length() > string1.length()) {
            result = string2 + "is the longest string";
        } else {
            result = "equal";
        }

        System.out.println(result);



    }
}
/*
 1. Create a class named LongestString
            1.1 Ask the user to enter two strings
            1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"

 */
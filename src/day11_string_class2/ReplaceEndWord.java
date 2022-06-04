package day11_string_class2;

import java.util.Scanner;

public class ReplaceEndWord {

    /*
    4. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

     */

    public static void main(String[] args) {

        System.out.println("Enter a word:");


        String input = new Scanner(System.in).next();


        if(input.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }


    }
}

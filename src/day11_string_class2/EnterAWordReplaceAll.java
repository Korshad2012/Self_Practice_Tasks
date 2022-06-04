package day11_string_class2;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class EnterAWordReplaceAll {

    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea
         */
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
        String wordLowerCase = word.toLowerCase(Locale.ROOT);
        String newWord = wordLowerCase.replace("x","a");


        System.out.println(newWord);



    }
}

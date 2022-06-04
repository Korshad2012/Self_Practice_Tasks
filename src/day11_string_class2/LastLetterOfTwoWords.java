package day11_string_class2;

import java.util.Scanner;
/*
 Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
public class LastLetterOfTwoWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");

        String firstWord = input.next();

        System.out.println("Enter second word");

        String secondWord = input.next();

        char lastLetter1 = firstWord.charAt(firstWord.length()-1);
        char fistLetter2 = secondWord.charAt(0);

        String secondWordN2 = secondWord.substring(1);

        if(lastLetter1==fistLetter2){
            System.out.println(firstWord+secondWordN2);
        }

        input.close();





    }
}

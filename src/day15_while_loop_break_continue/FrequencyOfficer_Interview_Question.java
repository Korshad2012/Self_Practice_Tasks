package day15_while_loop_break_continue;

public class FrequencyOfficer_Interview_Question {

    public static void main(String[] args) {

        String str = "Java programming languagegg";
        char ch = 'g';

        int total = 0;

        for (int i = 0; i < str.length(); i++) {


            if (ch == str.charAt(i)) {

                total++;
            }
        }
        System.out.println(total);


    }
}
/*
Create a class named FrequencyOfChar and Write a program that asks user to enter string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
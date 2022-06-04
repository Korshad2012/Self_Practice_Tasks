package day11_string_class2;

import java.util.Scanner;

public class EnterAWordReplaceOneWord {

    public static void main(String[] args) {

        System.out.println("Enter a word");

        String word= new Scanner(System.in).next();
        String replace;

        if(word.startsWith("x")){
            replace = word.replace("x","a");
        }else{
            replace ="the word does not start with ex";
        }

        System.out.println(replace);
    }
}

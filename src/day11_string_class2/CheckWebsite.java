package day11_string_class2;

import java.util.Scanner;

public class CheckWebsite {
    public static void main(String[] args) {

        /*
        1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov

         */
        System.out.println("Enter website address");

        String website = new Scanner(System.in).nextLine();
        String result;

        if(website.startsWith("www.") && website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov"))
        {
            result = "Valid Website";
        }else{
            result = "invalid Website";
        }

        System.out.println(result);


        System.out.println("----------------------------------------------------------------------");


    }
}

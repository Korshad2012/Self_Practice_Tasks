package day11_string_class2;

import java.util.Scanner;
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address;");

        String email = input.next();


        int firstName = email.indexOf("_"); // first find of index of "_"
        int indexAT = email.indexOf("@"); // then find out index of "@"
        int domain = email.lastIndexOf("m");

        String firstName1 = email.substring(0, firstName);
        String lastName1 = email.substring(firstName + 1, indexAT);
        String domain1 = email.substring(indexAT, domain + 1);

        System.out.println(lastName1 + "_" + firstName1 + domain1);

        input.close();


    }
}

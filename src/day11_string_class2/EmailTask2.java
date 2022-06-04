package day11_string_class2;

import java.util.Locale;
import java.util.Scanner;
/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */
public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your email address: ");

        String email = input.next();

        int under_ = email.indexOf("_");
        int aT = email.indexOf("@");
        int dot = email.lastIndexOf(".");

        String firstName = email.substring(0,under_);
        String upperFirst = firstName.toUpperCase(Locale.ROOT).substring(0,1) + firstName.substring(1).toLowerCase(Locale.ROOT);
        String lastName = email.substring(under_+1,aT);
        String upperLast = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String domain = email.substring(aT+1,dot);

        System.out.println("firstName = " + upperFirst);
        System.out.println("lastName = " + upperLast);
        System.out.println("domain = " + domain);

        input.close();

    }
}

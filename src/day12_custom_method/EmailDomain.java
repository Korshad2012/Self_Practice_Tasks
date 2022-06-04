package day12_custom_method;

import java.util.Scanner;

public class EmailDomain {

    public static void main(String[] args) {
        System.out.println("Enter email address:");
        Scanner input = new Scanner(System.in);

        String email = input.next();

        emailDomain(email);

    }

    public static void emailDomain(String email){



        String domain = email.substring(email.indexOf("@")+1);

        System.out.println("Email domain is: " + domain);


    }




}
/*
 Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */
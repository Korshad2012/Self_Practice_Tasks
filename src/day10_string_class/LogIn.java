package day10_string_class;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter username and password");
        String userName = input.next();
        String passWord = input.next();

        String result = "";

        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")) {
            result = "you are now logged in";
        } else {
            result = "Incorrect username or password. Please try again";
        }

        System.out.println(result);

        input.close();


    }
}
/*
Create a class named LogIn
            2.1 Ask the user to enter the username & password
            2.2 print "You are not logged in" If user entered valid username and password
                otherwise print the error message "Incorrect username or password. Please try again"

            Note: Assume that the valid credentials are:
                        username: Cydeo
                        password: WoodenSpoon

 */
package day15_while_loop_break_continue;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "Cydeo";
        String password = "Cydeo123";
        System.out.println("Enter username");
        String givenUsername = input.next();

        System.out.println("Enter password");
        String givenPassword = input.next();


        if (!(username.equals(givenUsername) && password.equals(givenPassword))) {

            for (int i = 0; i < 3; i++) {
                System.err.println("Invalid entry! Try again");
                System.out.println("Enter your username again");
                givenUsername = input.next();

                System.out.println("Enter your password again");
                givenPassword = input.next();

            }
        }

        if (username.equals(givenUsername) && password.equals(givenPassword)) {
            System.out.println("logged in");
        } else {
            System.err.println("your account is locked");
        }

        input.close();








        }
    }



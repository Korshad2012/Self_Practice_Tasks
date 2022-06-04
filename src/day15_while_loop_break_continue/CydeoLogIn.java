package day15_while_loop_break_continue;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        String name = "john";
        String password = "123";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");

        String userName = input.next().toLowerCase();

        System.out.println("Enter your password");

        String userPassword = input.next();

        boolean correctCredentials = userName.equals(name) && userPassword.equals(password);

        if (correctCredentials) {

            System.out.println("Logged In!");

        } else {


            for (int i = 0; i < 3; i++) {

                System.out.println("Wrong credential try again!!!");
                System.out.println("Re-enter user name:");
                userName = input.next().toLowerCase();
                System.out.println("Re-enter password:");
                userPassword = input.next();

                if (userName.equals(name) && userPassword.equals(password)) {
                    System.out.println("This time logged in");
                    break;

                }
                if (i == 2) {
                    System.out.println("locked");

                }


            }
        }

        input.close();

    }

}




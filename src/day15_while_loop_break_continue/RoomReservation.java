package day15_while_loop_break_continue;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;

        String king = "king";
        String queen = "queen";
        String single = "single";


        System.out.println("Do you want to reserve a room");

        String yesOrNo = input.next().toLowerCase(); // answer from user

        if (yesOrNo.equals("no")) {

            System.out.println("Have nice day!");
            return;
        }
        if (yesOrNo.equals("yes")) {

            System.out.println("Please select room tye:\n1.King = 120$:\n2.Queen = 100&:\n3.Single : 80$");

            String selection = input.next().toLowerCase();


            while (!selection.equals("king") || !selection.equals("king") || selection.equals("single")) {

                System.out.println("Invalid selection, re-enter");

                selection = input.next().toLowerCase();
            }


            if (selection.equals("king")) {

                System.out.println("Total price of king room is: $" + kingBed);

            }
            if (selection.equals("queen")) {

                System.out.println(("Total price of queen rooms is: $" + queenBed));
            }
            if (selection.equals("single")) {

                System.out.println("Total price of single room is: $" + singleBed);
            }


        }
    }


}


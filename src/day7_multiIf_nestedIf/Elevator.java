package day7_multiIf_nestedIf;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 9;

        String result = "Invalid Number";

        if (floorNumber >= 1 && floorNumber <= 3) {

            result = "Floor 1 selected. Companies: ";

            if (floorNumber == 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                result += "Cybertek, NASA, Intelsat";
            } else {
                result += "Lyft, Bofa, Stake house";
            }
        }
        System.out.println(result);

    }
}
/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			 anything else: print "Invalid floor - 6"

 */

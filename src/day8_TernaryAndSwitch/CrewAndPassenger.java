package day8_TernaryAndSwitch;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int numOfPeople = 100;

        String result = "";

        switch (numOfPeople){

            case 50:
                result = "20 crew, 30 passenger";
                break;
            case 75:
                result = "25 crew, 50 passenger";
                break;
            case 100:
                result = "30 crew, 70 passenger";
                break;
            default:
                result = "Not Valid";
        }

        System.out.println(result);

        System.out.println("----------------------------------------------------------------------------------------");





    }
}
/*
1. Create a class named CrewAndPassangers1
        Given a number of people on the ship (int number)
        determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

        Solution1: Use ternary. Do not use more than one println()
        Solution2: Use switch statement. Do not use more than one println()
 */
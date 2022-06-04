package day8_TernaryAndSwitch;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygen = 50;

        String oxygenLevel =
                (oxygen > 90) ? "Your tank is full" : (oxygen > 80) ? "Still ok"
                        : (oxygen > 70) ? "Don't go too far" : (oxygen > 60) ? "Start to head back"
                        : "Be careful now you at at 50%";

        System.out.println(oxygenLevel);

        System.out.println("---------------------------------------------------------------");

        int oxg = 50;

        String result = "";

        switch (oxg) {

            case 90:
                result = "Your tank is full";
                break;

            case 80:
                result = "Still ok";
                break;

            case 70:
                result = "Don't go too far";
                break;

            case 60:
                result = "Start to head back";
                break;

            case 50:
                result = "Be careful now you at at 50%";
                break;

            default:
                result = "Invalid";
                break;

        }

        System.out.println(result);


    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
			Solution 2:	MUST use switch statement

 */
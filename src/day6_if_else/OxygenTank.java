package day6_if_else;
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
public class OxygenTank {

    public static void main(String[] args) {

        int level = 88;

        String currentLevel = "";

        if (level > 90) {
            currentLevel = "Your tanks is full";
        }
        if (level <= 90 && level > 80) {
            currentLevel = "Still ok";
        }
        if (level <= 80 && level > 70) {
            currentLevel = "Don't go too far";
        }
        if (level <= 70 && level > 60) {
            currentLevel = "Start to head back";
        }
        if (level >= 50 && level < 60) {
            currentLevel = "Be careful now you at at 50%";
        }
        System.out.println(currentLevel);
    }
}


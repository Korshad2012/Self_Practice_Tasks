package day9_scannerclass;

import java.util.Scanner;

public class HowManyPeopleLivingWith {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");

        int num = input.nextInt();

        String result ="";

        if(num>0&&num<3){result="Live with less than 3 people";}
        if(num>=3&&num<=6){result="live with 3-6 people";}
        if(num>6){result="Live with more than 6 people";}

        System.out.println(result);

        input.close();


    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
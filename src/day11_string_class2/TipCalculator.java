package day11_string_class2;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split?");
        String split = input.next();

        System.out.println("Enter number of people:");

        int numOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");

        int total=input.nextInt();

        System.out.println("How was the service\n" +
                "Excellent,Great,Good,Fair,Poor");

        if(split.equalsIgnoreCase("yes")){

        }
    }
}

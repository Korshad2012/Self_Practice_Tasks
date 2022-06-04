package day12_custom_method;

import java.util.Scanner;

public class NumToMonth {

    public static void main(String[] args) {

        System.out.println("Enter number:");


        int num= new Scanner(System.in).nextInt();

        monthName(num);






    }
    // write custom method here:
    public static void monthName(int num){

        String result;
        switch (num){
            case 1:
                result ="Jan";
                break;
            case 2:
                result ="Feb";
                break;
            case 3:
                result ="Mar";
                break;
            case 4:
                result ="Apr";
                break;
            case 5:
                result ="May";
                break;
            case 6:
                result ="Jun";
                break;
            case 7:
                result ="Jul";
                break;
            case 8:
                result ="Aug";
                break;
            case 9:
                result ="Sep";
                break;
            case 10:
                result ="Oct";
                break;
            case 11:
                result ="Nov";
                break;
            case 12:
                result ="Dec";
                break;
            default:
                result ="Invalid Number";

        }
        System.out.println(result);

    }
}
/*
Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */
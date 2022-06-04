package day12_custom_method;

import java.util.Scanner;

public class NumToDay {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num = new Scanner(System.in).nextInt();

        day(num);


    }



    // create method here

    public static void day(int num) {

        String result = "";
        switch (num) {
            case 1:
                result = "Mon";
                break;
            case 2:
                result = "Tue";
                break;
            case 3:
                result = "Wed";
                break;
            case 4:
                result = "Thur";
                break;
            case 5:
                result = "Fri";
                break;
            case 6:
                result = "Sat";
                break;
            case 7:
                result = "Sun";
                break;
            default:
                result = "Invalid Number";
        }
        System.out.println(result);
    }

}
/*
 Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */
package day5_tasks;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 0;

        boolean isPositiveNumber = number > 0, // if the number is greater than zero, then it's positive number
                isNegativeNumber = number <0,// if the number is less zero, then it's negative number
                isZero = number == 0; // isZero = !isPositiveNumber && !isNegativeNumber,
        // if the number is NOT negative and NOT positive

        System.out.println(number + " is positive number: " + isPositiveNumber);
        System.out.println(number + " is Negative number: " + isNegativeNumber);
        System.out.println(number + " is Zero:" + isZero);

        /*
        Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
         */
    }
}

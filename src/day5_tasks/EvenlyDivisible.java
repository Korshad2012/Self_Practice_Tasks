package day5_tasks;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;


        boolean isEvenlyDivisibleBy2 = number % 2 == 0,
                isEvenlyDivisibleBy3 = number % 3 == 0,
                isEvenlyDivisbleBy5 = number % 5 == 0;

        // if number is divisible by 2 and 3 then number is divisible by 6 , because 2*3=6


        System.out.println(number + " is divisible by 2: " + isEvenlyDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isEvenlyDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isEvenlyDivisbleBy5);
        /*
        Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
         */


    }
}

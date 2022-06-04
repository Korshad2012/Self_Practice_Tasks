package day5_tasks;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 2;

        boolean isEven = number%2 ==0,
                isOdd = !isEven;// if the number is not even then it is odd

        System.out.println(number + " is a even number: " + isEven);
        System.out.println(number + " is a odd number: " + isOdd);

/*1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
            Ex:
                number = 20

            output:
                20 is an even number: true
                20 is an odd number: false


        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */
    }
}

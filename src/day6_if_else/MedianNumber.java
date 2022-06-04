package day6_if_else;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 9, c = 7;

        if (b > a && b < c || b < a && b > c) {
            System.out.println(b + " is a median number");
        }
        if (a > b && a < c || a > c && a < b) {
            System.out.println(a + " is a median number");
        }
        if (c > b && c < a || c > a && c < b) {
            System.out.println(c + " is a median number");
        }
        /*
        1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
         */
    }
}
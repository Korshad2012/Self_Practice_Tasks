package day14_forloop_tasks;

public class FactorialOfAnyNumber {

    public static void main(String[] args) {

        int num=5;

        int factorial =1; /*
        The factorial of a number is the product of all the integers from 1 to that number. For example,
        the factorial of 6 is 1*2*3*4*5*6 = 720 .
         Factorial is not defined for negative numbers, and the factorial of zero is one, 0! = 1 .

        */

        for (int i = 1; i <=num ; i++) {
            factorial *=i;


        }
        System.out.println(factorial);

    }//end of main method
}

package day12_custom_method;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        System.out.println("Enter First Number:");

        double number1 = new Scanner(System.in).nextDouble(); // This is the argument will pass to parameters

        System.out.println("Enter Second");
        double number2 = new Scanner(System.in).nextDouble();

        System.out.println("Enter the Operator");
        char operator = new Scanner(System.in).next().charAt(0);

        calculator(number1,number2,operator);

    }

    public static void calculator(double num1,double num2, char mathOperator){
        double result = 0;
        switch (mathOperator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result =num1/num2;
                break;
            default:
                System.out.println("Invalid Operator!");
        }
        System.out.println(num1+""+mathOperator+num2+"=" +result);
    }
}
/*
Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
            calculate(10, 20, '+')

        output:
            10 + 20 = 30
 */
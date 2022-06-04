package day14_forloop_tasks;

import java.util.Scanner;

public class FindingMinimumNumber {

    public static void main(String[] args) {

        int min = 2147483647;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter number:");
            int num = new Scanner(System.in).nextInt();
            if(num<min){
                min = num;
            }

        }

        System.out.println("Minimum number is: " + min);

    }
}

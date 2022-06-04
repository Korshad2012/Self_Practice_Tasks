package day15_while_loop_break_continue;

import java.util.Scanner;

public class UntilNegative {


    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

        System.out.println("Enter number: ");

    int num = input.nextInt();

    int sum=0;

    while(num>0){

        sum+=num;

        System.out.println("Enter number; ");

        num=input.nextInt();

        if(num<0){
            System.out.println("total sum " +sum);
        }else {
            System.out.println("Invalid number");
        }

    }



    }
}




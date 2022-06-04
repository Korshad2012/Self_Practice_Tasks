package day9_scannerclass;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MileToKm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Miles");

        double miles = input.nextDouble();

        double km = miles*1.609;

        System.out.println(miles + " mile is " + km + " Kilometer.");

        input.close();




    }
}
/*
6. Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */
package day9_scannerclass;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("What is the radius of the circle?");

        double radius = input.nextDouble();

        double area = pi*(radius*radius);
        double perimeter = 2*pi*radius;

        System.out.println("area of the circle is: " + area);
        System.out.println("perimeter of the circle is: "+ perimeter);

        input.close();


    }

}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */
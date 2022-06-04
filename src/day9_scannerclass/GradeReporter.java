package day9_scannerclass;

import java.util.Scanner;

public class GradeReporter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your Score?");

        int score = input.nextInt();

        String grade ="";

        if(score>=0&&score<=100){

            grade = (score>90)?"A":(score>80)?"B":(score>70)?"C":(score>60)?"D":"F";

        }else {
            System.out.println("invalid score");
        }

        System.out.println(grade);

        input.close();

    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */
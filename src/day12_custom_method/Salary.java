package day12_custom_method;

public class Salary {

    public static void main(String[] args) {

        double hourlyRate = 45;
        int weeklyHours = 40;
        grossSalaryCal(hourlyRate,weeklyHours);

    }

    public static void grossSalaryCal(double weeklyHours, int hourlyRate){

        double salary = hourlyRate*weeklyHours*52;


        System.out.println("Your gross income is: $"+salary);
    }

}
/*
Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */
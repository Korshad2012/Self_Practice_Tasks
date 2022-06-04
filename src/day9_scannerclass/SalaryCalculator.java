package day9_scannerclass;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly wages: ");

        int hourlyWage = input.nextInt();



        System.out.println("How many hour do you work per week?: ");

        int hoursWeek = input.nextInt();

        System.out.println("Enter you state tax percentage: ");

        int stateTax = input.nextInt();

        System.out.println("Enter your federal tax percentage: ");

        int federalTax = input.nextInt();

        int salary = hourlyWage*hoursWeek*52;
        int totalStateTax = salary*stateTax/100;
        int totalFedTax = salary*federalTax/100;
        int totalTax = totalFedTax+totalStateTax;
        int netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("totalFedTax = " + totalFedTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        input.close();


    }


}
/*
10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
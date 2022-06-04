package day4_tasks;

public class SalarCalculator2 {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;

        double stateTaxRate = 6,
                federalTaxrate = 26;

        int grossPay = hourlyRate * weeklyHours * 52;

        double federalTax = grossPay * federalTaxrate/100,
                stateTax = grossPay * stateTaxRate/100,
                totalTax = stateTax+federalTax,
                netIncome = grossPay - totalTax;

        System.out.println("Gross pay is: " + "$" + grossPay);
        System.out.println("Federal tax is: " + "$" + (int) federalTax);
        System.out.println("State tax is: " + "$" + (int) stateTax);
        System.out.println("Total tax is: " + "$" + (int) totalTax);
        System.out.println(" Net income is: " + "$" + (int) netIncome);

    }
}

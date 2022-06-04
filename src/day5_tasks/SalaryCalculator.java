package day5_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTax = 6,
                federalTax = 26;
        int grossPay = hourlyRate * weeklyHours * 52;
        double netIncome = grossPay - (grossPay * stateTax/100 + grossPay * federalTax/100);

        System.out.println("Gross pay is: $" + grossPay);
        System.out.println("Federal tax is: $" + (int) (federalTax * grossPay));
        System.out.println("State tax is: $" + (int) (stateTax * grossPay));
        System.out.println("Total tax is: $" + (int) (stateTax * grossPay + federalTax * grossPay));
        System.out.println("Net income: $" + (int) netIncome);
    }
}

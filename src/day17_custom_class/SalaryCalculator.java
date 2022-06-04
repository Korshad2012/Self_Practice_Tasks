package day17_custom_class;

public class SalaryCalculator {

    public double hourlyRate;
    public double weeklyHours;
    public double federalTaxRate;
    public double stateTaxRate;

    public void setInfo(double hourlyRate, double weeklyHours, double federalTax, double stateTax) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.federalTaxRate = federalTax;
        this.stateTaxRate = stateTax;
    }

    public double salary(){

        return weeklyHours*hourlyRate*52;

    }

    public double federalTax(){

        return salary()*federalTaxRate/100;

    }

    public double stateTax(){

        return  salary()*stateTaxRate/100;

    }

    public double salaryAfterTax(){

        return salary()-(stateTax()+federalTax());

    }


    public String toString() {
        return "SalaryCalculator{" +
                "Salary=" + salary() +
                ", StateTax=" + stateTax() +
                ", federalTaxR=" + federalTax() +
                ",Salary after tax= " + salaryAfterTax()+
                '}';
    }
}
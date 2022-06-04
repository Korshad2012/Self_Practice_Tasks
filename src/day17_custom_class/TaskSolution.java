package day17_custom_class;

public class TaskSolution {

    public int hourlyRate;
    public int stateTaxRate;
    public int federalTaxRate;
    public int weeklyHours;

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return (salary() * stateTaxRate) / 100;
    }

    public double federalTax(){
        return (salary() * federalTaxRate) / 100;
    }

    public double salaryAfterTax(){
        return salary() - federalTax() - stateTax();
    }

    public void setInfo(int hourlyRate, int stateTaxRate, int federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", state tax=" + stateTax() +
                ", federal tax="+ federalTax() +
                ", salary after tax=" + salaryAfterTax() +
                '}';
    }



    }


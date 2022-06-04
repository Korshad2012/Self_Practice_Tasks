package day4_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        String name = "Joshua";
        int hourRate = 40,
                weeklyhours = 45,
                salary = hourRate * weeklyhours * 52;


        System.out.println("Hello " + name + ", " + "your salary is $" + salary);
    }
}

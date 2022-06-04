package day4_tasks;

public class ModulusFormula {

    public static void main(String[] args) {

        int numerator = 90,
                denominator = 7;
        int integerResult = (numerator / denominator),
                remainder = numerator - (denominator * integerResult);

        System.out.println(remainder);

    }
}

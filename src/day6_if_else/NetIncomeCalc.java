package day6_if_else;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 100000;

        boolean married = true;

        int netIncome130KorMor = salary - salary * 35 / 100,
                netIncome129kTo100K = salary - salary * 30 / 100,
                netIncome80kTo99K = salary - salary * 25 / 100,
                netIncome79KorLess = salary - salary * 20 / 100;


        int netIncome130KorMoreMarried = salary - salary * 25 / 100,
                netIncome129kTo100kMarried = salary - salary * 20 / 100,
                netIncome80kTo99KMarried = salary - salary * 15 / 100,
                netIncome79KorLessMarried = salary - salary * 10 / 100;

        String result = "";


        if (married && salary >= 130000) {
            result = "Net income: $" + netIncome130KorMoreMarried;
        }
        if (married && salary <= 129000 && salary >= 100000) {
            result = "Net income: $" + netIncome129kTo100kMarried;
        }
        if (married && salary <= 990000 && salary >= 80000) {
            result = "Net income: $" + netIncome80kTo99KMarried;
        }
        if (married && salary <= 79000) {
            result = "Net income: $" + netIncome79KorLessMarried;
        }
        if (!married && salary >= 130000) {
            result = "Net income: $" + netIncome130KorMor;
        }
        if (!married && salary <= 129000 && salary >= 100000) {
            result = "Net income: $" + netIncome129kTo100K;
        }
        if (!married && salary <= 990000 && salary >= 80000) {
            result = "Net income: $" + netIncome80kTo99K;
        }
        if (!married && salary <= 79000) {
            result = "Net income: $" + netIncome79KorLess;
        }
        System.out.println(result);


    }
}

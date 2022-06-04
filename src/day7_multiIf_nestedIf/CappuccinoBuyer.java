package day7_multiIf_nestedIf;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "grand";

        String result = "price is $";

        if (size == "tall" || size == "grande" || size == "venti") {
            if (size == "tall") {
                result += 3.69;
            } else if (size == "grande") {
                result += 3.99;
            } else if (size == "venti") {
                result += 4.29;
            }
        } else {
            System.out.println("Invalid Size");
        }

        System.out.println(result);
    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given,
write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if
 */

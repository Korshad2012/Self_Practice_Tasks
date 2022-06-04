package day17_custom_class;

public class Pizza {

    public char size; // instance  Variable
    public int numberOfCheeseTopping, getNumberOfPepperoniTopping;

    // calculate the total price of the pizza, returns as double
    public double calCost() {
        double totalPrice = 0;

        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid Entry");
        }


        return totalPrice;
    }

    public void setInfo(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", getNumberOfPepperoniTopping=" + getNumberOfPepperoniTopping +
                ", total price=" + calCost() +
                '}';
    }
}
/*
1. Create a class named Pizza:
            Attributes:
                1. size
                2. numberOfCheeseTopping
                3. numberOfPepperoniTopping

            Actions:
                calcCost(): returns the total cost of the pizza
                toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
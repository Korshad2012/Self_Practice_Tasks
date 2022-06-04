package Replit.string_method;

public class BurgerOrChicken {

    public static void main(String[] args) {

        String order="burger";
        double price1= 9.75;
        float price2= 12.50f;
        if(order.equalsIgnoreCase("chicken")){
            System.out.println("Your total is $"+price1);
        }else {
            System.out.println("Your total is $"+price2);
        }



    }// end of main method
}

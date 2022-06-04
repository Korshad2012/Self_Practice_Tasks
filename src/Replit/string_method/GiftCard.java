package Replit.string_method;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String item = input.nextLine();

        int giftCard = 100;


        int blanket = 60;
        int charger = 5;
        int hat = 25;
        int headPhones = 30;
        int lapTop = 200;
        int pants = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int usbCable = 10;

        String result = "";


        switch (item) {
            case "Blanket":
                if (blanket <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - blanket) + "$";
                }
                break;
            case "Charger":
                if (charger <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - charger) + "$";
                }
                break;
            case "Hat":
                if (hat <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - hat) + "$";
                }
                break;
            case "Headphones":
                if (headPhones <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - headPhones) + "$";
                }
                break;

            case "Laptop":
                if (lapTop > giftCard) {
                    result = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Pants":
                if (pants <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - pants) + "$";
                }
                break;
            case "Pillow":
                if (pillow <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - pillow) + "$";
                }
                break;
            case "Smartphone":
                if (smartphone > giftCard) {
                    result = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Socks":
                if (socks <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - socks) + "$";
                }
                break;

            case "USD cable":
                if (usbCable <= giftCard) {
                    result = "Thank you for your purchase!" + "\n"
                            + "Your current balance is: " + (giftCard - usbCable) + "$";}
                break;


                    default:
                        result = "Sorry, that is an invalid item";


                }

                System.out.println(result);


        }
    }

package Replit.string_method;

import java.util.Scanner;

public class AComputerBuilding {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.next();


        double screenPrice = 0;
        switch (screenSize) {
            case "13.3":
                screenPrice = 200;
                break;
            case "15.0":
                screenPrice = 300;
                break;
            case "17.3":
                screenPrice = 400;

        }

        System.out.println("Select CPU type:");
        String cpuSize = input.next();

        double cpuPrice = 0;

        switch (cpuSize) {
            case "i3":
                cpuPrice = 150;
                break;
            case "i5":
                cpuPrice = 250;
                break;
            case "i7":
                cpuPrice = 350;

        }


        System.out.println("Select RAM size:");

        double ramSize = input.nextInt();
        double totalRamPrice = 0;
        if (ramSize % 4 == 0) {
             totalRamPrice = (ramSize / 4) * 50;
        }

        System.out.println("Select storage type:");

        String storageType = input.next();

        System.out.println("Select storage size:");
        double amount = input.nextDouble();

        double totalStoragePrice = 0;
        if (storageType.equalsIgnoreCase("HDD")) {
            totalStoragePrice = (amount / 500) * 100;
        } else if (storageType.equalsIgnoreCase("SSD")) {
            totalStoragePrice = (amount / 500) * 200;
        }


        System.out.println("Select screen resolution:");
        String screenRes = input.next();
        double totalScreenPrice = 0;
        if (screenRes.equalsIgnoreCase("FULLHD")) {
            totalScreenPrice = 100;
        } else if (screenRes.equalsIgnoreCase("4K")) {
            totalScreenPrice = 200;
        }
        double totalPrice = screenPrice + cpuPrice + totalRamPrice + totalStoragePrice + totalScreenPrice;

        System.out.println("Final price is: $"+totalPrice);
    }
}

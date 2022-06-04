package day12_custom_method;

public class DaysInMonth {
    public static void main(String[] args) {

        String month = "Jan";
        daysInMonth(month);

    }

    public static void daysInMonth(String month) {

        String result = "";

        switch (month) {


            case "Jan":
            case "Mar":
            case "May":
            case "July":
            case "Aug":
            case "Oct":
            case "Dec":
                result = "31 days";
                break;
            case "Feb":
                result = "28 days";
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                result = "30days";
                break;


        }
        System.out.println(result);


    }

}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */


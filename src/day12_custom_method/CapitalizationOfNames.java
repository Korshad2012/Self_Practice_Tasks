package day12_custom_method;

public class CapitalizationOfNames {

    public static void main(String[] args) {

        String firstName = "cyDeO";
        String lastName = "sCHooL";

        capitalizationName(firstName,lastName);


    }

    public static void capitalizationName(String firstName, String lastName) {


        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


    }
}
/*
 Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")
 */
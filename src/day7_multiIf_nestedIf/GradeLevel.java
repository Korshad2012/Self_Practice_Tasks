package day7_multiIf_nestedIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 9;

        String result ="";



        if (number >= 1 && number <= 18) {



            if (number <= 5) {
                result = "Elementary School";
            } else if (number <= 8) {
                result = "Middle School";
            } else if (number <= 12) {
                result = "High School";
            } else if (number <= 16) {
                result = "College";
            } else if (number <= 18) {
                result = "Grad School";
            }

        } else {
            result = "Invalid grade level given";
        }
        System.out.println(result);
    }
}

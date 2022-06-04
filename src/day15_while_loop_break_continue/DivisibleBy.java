package day15_while_loop_break_continue;

public class DivisibleBy {

    public static void main(String[] args) {

        int num = 100;

        String result="";
        String result1="";
        String result2="";

        for (int i = 1; i < num; i++) {

            if (i % 15 == 0) {
                result+=i +" ";

            } else if (i % 5 == 0) {

                result1+=i +" ";

            } else if (i%3==0) {
                result2+=i +" ";
            }


        }
        System.out.println("divisible by 15: " +result);
        System.out.println("divisible by 5: "  +result1);
        System.out.println("divisible by 3: " +result2);

    }
}
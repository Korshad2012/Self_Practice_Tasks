package day14_forloop_tasks;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String input = "A1B2C35";

        int sum = 0;

        for(int i = 0; i < input.length(); i++){

            char ch = input.charAt(i);

            if(ch >= 48 && ch <= 58){
                sum += input.charAt(i) -48;
            }
        }
        System.out.println(sum);



    }
}

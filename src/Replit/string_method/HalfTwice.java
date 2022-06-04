package Replit.string_method;

public class HalfTwice {

    public static void main(String[] args) {

        String word="unity";
                  //0123
        // to find first half of the string we need to find total index of word then use substring method

        int total = word.length();

        String firstHalf = word.substring(0,(total)/2);

        System.out.println(firstHalf+firstHalf);

    }
}

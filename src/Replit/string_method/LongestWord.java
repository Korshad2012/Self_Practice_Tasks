package Replit.string_method;

public class LongestWord {

    public static void main(String[] args) {

        String word1="bill";
        String word2="check";

        // to find the longest word we use length method

        int length1 = word1.length();
        int length2 = word2.length();

        if(length1>length2){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }



    }
}

package Replit.string_method;

public class MergeWord {

    public static void main(String[] args) {

        String word1= "abc"; // user input
        String word2= "edf"; // user input

        String result=""; // empty String

        if(word1.length()==3&&word2.length()==3){ // only if two strings are same then merge else not merge
            result += result+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
        }else {
            result= "cannot merge";
        }
        System.out.println(result);



    }// end of main method
}

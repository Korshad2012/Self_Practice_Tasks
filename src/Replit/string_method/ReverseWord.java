package Replit.string_method;


public class ReverseWord {
    public static void main(String[] args) {

        String word = "abcde"; // word to be tested

        String result = "";

        if (word.length() > 5) { // test the length of word
            result="the word is too long";
        } else if (word.length()<5) {
            result = "word is too short";
        }else {
            for (int count = word.length()-1; count >=0 ; count--) {
                result += word.charAt(count);

            }
        }
        System.out.println(result);


    }// end of main method

} // end of class

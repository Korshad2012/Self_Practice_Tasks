package Replit.string_method;

public class WithOutX {

    public static void main(String[] args) {

        String word = "xUxL";

        String word1 = word.toLowerCase();

        if (word1.startsWith("x") && word1.endsWith("x")) {
            System.out.println(word.substring(1, word.length() - 1));
        } else if (word1.startsWith("x")){
            System.out.println(word.substring(1));
        }else if(word1.endsWith("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }


    }
}

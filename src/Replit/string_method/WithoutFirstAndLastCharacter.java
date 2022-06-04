package Replit.string_method;

public class WithoutFirstAndLastCharacter {

    public static void main(String[] args) {

        String word ="adobe";
        //            01234


        // without first character, we use substring method

        String withoutFirst = word.substring(1);

        // without last character, we use substring method

       String withoutLast = word.substring(0,word.length()-1);

        System.out.println("without first letter: "+withoutFirst);
       System.out.println("without last letter: "+withoutLast);


    }
}

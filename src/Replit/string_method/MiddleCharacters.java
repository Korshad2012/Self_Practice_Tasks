package Replit.string_method;

public class MiddleCharacters {

    public static void main(String[] args) {

        String word="apples";
                 //  0123
       int indexOfMiddle= (word.length()-1)/2;

        System.out.println(indexOfMiddle);

        String middleCharacterOdd = word.substring(indexOfMiddle,indexOfMiddle+1);
        String middleCharacterEven= word.substring(indexOfMiddle,indexOfMiddle+2);



        if(word.length()%2==0){
            System.out.println(middleCharacterEven);
        }else {
            System.out.println(middleCharacterOdd);
        }



    }
}

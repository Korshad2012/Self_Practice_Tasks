package day6_if_else;

/*
5. Create a class named CharacterIdentity, and
write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on "

 */

public class CharacterIdentify {

    public static void main(String[] args) {


        int ch = 'K';

        String result = "";


        if(ch >= 0 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <=96 || ch >=123 && ch <= 127){
            result = " Special Character!";
        }
        if(ch >= 48 && ch <= 57){
            result = "Digit!";
        }if(ch >=65 && ch <= 90 || ch >= 97 && ch <= 122){
            result = "Alphabet!";
        }
        System.out.println(result);





////
        String str = "korshad";

        int num = str.charAt('k');

        System.out.println();



//        String result = "";

//        for (int i = str.charAt(0) ; i <= 127; i++) {
//
//            if (i >= 0 && i <= 47 || i >= 58 && i <= 64 || i >= 91 && i <= 96 || i >= 123 && i <= 127) {
//                result = " Special Character!";
//            }
//            if (i >= 48 && i <= 57) {
//                result = "Digit!";
//            }
//            if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
//                result = "Alphabet!";
//
//                System.out.println(result);
//            }
//
//
//        } // end of method








    }
}

package day16_do_while_loop_nested_loop;

public class Alphabet {

    public static void main(String[] args) {



        for (char i = 'A'; i <= 'E' ; i++) {



            for (char j = 'a'; j < 'z' ; j++) {
                System.out.print(i +""+ j + " ");


            }

            System.out.println();

        }

    }
}
/*
  String str = "aabccdeef";
        String result = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1 && !result.contains("" + str.charAt(i))){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
 */
package day16_do_while_loop_nested_loop;

public class Unique {

    public static void main(String[] args) {



        String str = "aabccdeef";
        String result = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1 ){
                result += str.charAt(i);
            }
        }
        System.out.println(result);

    }
}

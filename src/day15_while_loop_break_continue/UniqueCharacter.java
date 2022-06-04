package day15_while_loop_break_continue;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "AABCCCD";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {

                result += str.charAt(i);
            }

        }

        System.out.println(result);
    }
}
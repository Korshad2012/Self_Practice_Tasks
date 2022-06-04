package day16_do_while_loop_nested_loop;

public class Frequency {

    public static void main(String[] args) {

        String str ="aabccdeef";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {

                if(ch==str.charAt(j)){
                    count+=1;
                }

            }
            if(result.contains(""+ch)){
                continue;
            }
            result += ch + "" + count;
        }

        System.out.println(result);






    }
}
/*
10. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 Hint: if you find out how to find the frequency of one character,
 then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique
p
 */
package day14_forloop_tasks;

public class Palindrome {

    public static void main(String[] args) {

        String str= "anna";

        String reverse="";
        // first reverse the string

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }

        if(reverse.equals(str)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}

package Replit.string_method;

public class HasJava {

    public static void main(String[] args) {



        String word="c#javaruby";

        String word1= word.toLowerCase();

        boolean hasJava = word1.contains("java");

        if(hasJava){
            if(word1.indexOf('j')==0 || word1.indexOf('j')==1){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else {
            System.out.println(false);
        }




    }
}

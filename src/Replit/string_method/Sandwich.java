package Replit.string_method;

public class Sandwich {

    public static void main(String[] args) {

        String str = "xxbreadapple";



        if(str.contains("bread")){

            String secondBread = str.substring(str.indexOf('d'));

            if(secondBread.contains("bread")){

                System.out.println(str.substring(str.indexOf('d')+1,str.lastIndexOf('b')));

            }else {
                System.out.println("nothing");
            }
        }else {
            System.out.println("nothing");
        }




    }
}

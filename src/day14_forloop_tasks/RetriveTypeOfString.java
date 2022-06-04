package day14_forloop_tasks;

public class RetriveTypeOfString {

    public static void main(String[] args) {

    String str = "mn@#123Ab!";

    String letters="";
    String digits="";
    String characters="";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch>=48&&ch<=57){

                digits +=str.charAt(i);
            }
            if(ch>=0&&ch<=47||ch>=58&&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=127){

                characters+=str.charAt(i);

            }if(ch>=65&&ch<=90||ch>=97&&ch<=122){

                letters +=str.charAt(i);
            }

        }

        System.out.println(digits);
        System.out.println(characters);
        System.out.println(letters);

    }


}


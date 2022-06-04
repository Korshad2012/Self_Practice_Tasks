package Replit.string_method;

public class Alejandro {

    public static void main(String[] args) {

        String email = "dear Alejandro.....a lot of text";

        String email1=email.toLowerCase();

        if(email1.contains("alejandro")&&email1.contains("project")){
            System.out.println("priority");
        } else if (email1.contains("alejandro")) {
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }


    }
}

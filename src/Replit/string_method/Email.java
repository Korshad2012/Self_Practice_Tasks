package Replit.string_method;

public class Email {

    public static void main(String[] args) {

        String email = "korshad_adil@gmail.com";

        int index_ = email.indexOf('_');

        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, index_);

        String lastName = email.substring(index_ + 1, email.indexOf('@'));

        String lastNameUpper = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));

        String domainUpper = domain.substring(0,1).toUpperCase() +domain.substring(1);


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastNameUpper);
        System.out.println("Domain: " +domainUpper);


    }
}

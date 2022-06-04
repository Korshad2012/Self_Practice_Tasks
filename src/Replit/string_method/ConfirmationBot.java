package Replit.string_method;

public class ConfirmationBot {

    public static void main(String[] args) {


        char responseValue = 'y';
        String result = "";
        switch (responseValue) {
            case 'y':
                result = "Your request is being processed";
                break;
            case 'n':
                result = "Thank you for your consideration";
                break;
            case 'h':
                result = "Sorry, no live agents are currently available";
                break;
            default:
                result = "Thank you for your consideration";
                break;


        }


    }
}

package Replit.string_method;

public class HttpProtocol {

    public static void main(String[] args) {

        int statusCode = 200;

        String result="";

        switch (statusCode){
            case 200:
                result ="ok";
                break;
            case 201:
                result ="Created";
                break;
            case 202:
                result ="Accepted";
                break;
            case 307:
                result ="Temporary Redirect";
                break;
            case 400:
                result ="Bad Request";
                break;
            case 401:
                result ="Unauthorized";
                break;
            case 403:
                result ="Forbidden";
                break;
            case 404:
                result ="Not Found";
                break;
            case 410:
                result ="Gone";
                break;
            case 500:
                result ="Internal Server Error";
                break;
            case 303:
                result ="Service Unavailable";
                break;
            default:
                result="Invalid status code";


        }
        System.out.println(result);

    }
}

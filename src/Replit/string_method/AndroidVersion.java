package Replit.string_method;

public class AndroidVersion {

    public static void main(String[] args) {

        String version = "1.5";
        String result = "";
        switch (version) {
            case "1.5":
                result = "Cupcake";
                break;
            case "1.6":
                result = "Donut";
                break;
            case "2.1":
                result = "Eclair";
                break;


            case "2.2":
                result = "Froyo";
                break;
            case "2.3":
                result = "Gingerbread";
                break;
            case "3.1":
                result = "Honeycomb";
                break;
            case "4.0":
                result = "Ice Cream Sandwich";
                break;
            case "4.1":
                result = "Jelly Bean";
                break;
            case "4.4":
                result = "KitKat";
                break;
            case "5.0":
                result = "Lollipop";
                break;

            case "8.0":
                result = "Oreo";
                break;
            case "9.0":
                result = "Pie";
                break;
            default:
                result = "Not a valid version";


        }
        System.out.println(result);


    }
}

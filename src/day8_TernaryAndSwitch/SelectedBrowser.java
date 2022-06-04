package day8_TernaryAndSwitch;

public class SelectedBrowser {

    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

        switch (browserName){

            case "chrome":
                result = "browser chrome";
                break;

            case "firefox":
                result = "browser firefox";
                break;

            case "opera":
                result = "browser opera";
                break;

            case "safari":
                result = "browser safari";
                break;

            case "edge":
                result = "browser edge";
                break;

            default:
                result = "Not valid";
                break;


        }

        System.out.println(result);

    }
}

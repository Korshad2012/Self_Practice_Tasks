package day7_multiIf_nestedIf;

public class Browser {

    public static void main(String[] args) {

        String browserName = "safari";

        String result = "";

        if (browserName == "chrome" || browserName == " firefox" || browserName == "opera" || browserName == "safari" || browserName == " edge") {

            if (browserName == "chrome") {
                result = browserName + " Browser is selected";
            } else if (browserName == "firefox") {
                result = browserName + " Browser is selected";
            } else if (browserName == "opera") {
                result = browserName + " Browser is selected";
            } else if (browserName == "safari") {
                result = browserName + " Browser is selected";
            } else if (browserName == "ede") {
                result = browserName + " Browser is selected";
            }
        } else {
            System.err.println("Invalid Browser Name");
        }
        System.out.println(result);


    }
}
/*
2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */

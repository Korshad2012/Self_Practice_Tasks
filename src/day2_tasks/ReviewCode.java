package day2_tasks;
/* reviewing first week Java coding class
    1. what is the difference between println & print statement
    2. how to write single line and multiline comments on java
    3. how to print error statement, shortcut is serr
    4. how to create new line \n, quote in the statement \" new tab new paragraph \t \\ for \
    5. shortcut for main method is main
    6. there is no shortcut for print
 */
public class ReviewCode {
    public static void main(String[] args) {
        System.out.println("What is the difference between \"println\" & \"print\" ");
        System.out.print("\tWhat is the difference between \"println\" & \"print\"");
        System.out.print("\\print doesnt start new line\\");
        // check out the consul line two, third sentence in line two
        System.err.println("\nError prints out in red color");
    }
}

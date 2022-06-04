package day4_tasks;

public class SwapVariables2 {

    public static void main(String[] args) {

        int x = 10,
                y = 15;
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

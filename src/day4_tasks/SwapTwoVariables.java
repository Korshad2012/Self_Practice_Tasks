package day4_tasks;

public class SwapTwoVariables {

    public static void main(String[] args) {
        int x = 10,
                y = 15,
                z = x;
        x = y;
        y = z;



        System.out.println(x);
        System.out.println(y);
    }
}

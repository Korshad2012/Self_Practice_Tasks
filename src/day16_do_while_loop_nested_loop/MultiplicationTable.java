package day16_do_while_loop_nested_loop;

public class MultiplicationTable {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.print(i);

            for (int j = 2; j <= 10; j++) {

                System.out.print("\t\t" + (i * j));

            }

            System.out.println();

        }
    }

}
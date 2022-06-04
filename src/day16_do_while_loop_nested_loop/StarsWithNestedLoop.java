package day16_do_while_loop_nested_loop;

public class StarsWithNestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

           System.out.println();

            for (int j = 0; j < 10 ; j++) {

                if( i >= j ) {
                    System.out.print("* ");
                }
            }

        }

    }


}












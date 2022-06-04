package Replit_Task.Loops;

public class EvenAndOddFrom0To20 {

    public static void main(String[] args) {

        String result1="";

        for (int i = 1; i <= 20; i++) {
        if (i % 2 == 0) {
            if(i<20) {
                System.out.print(i + " ");
            }
            if(i==20){
                System.out.print(i);
            }
        }

    }

        System.out.println();

        for (int i = 1; i <=20 ; i++) {
        if(i%2!=0){
            if(i<11){
                System.out.print(i+" ");
            }
            if(i>=11){
                System.out.print(" "+i);
            }

        }
    }

    }
}

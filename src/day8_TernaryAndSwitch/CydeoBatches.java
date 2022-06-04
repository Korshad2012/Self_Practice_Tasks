package day8_TernaryAndSwitch;

public class CydeoBatches {

    public static void main(String[] args) {


        String batchType = "preatoria";

        String result = "";



        if(batchType=="US morning"){
            result = "10-5 EST. M, T, Th, F.";
        } else if (batchType=="Class times are US evening") {
            result = "Class times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batchType=="EU") {
            result = "Class times are  10-5 EST. M, T, W, Th, F.";
        } else {
            result = "Invalid Time";
        }
        System.out.println(result);
    }
}

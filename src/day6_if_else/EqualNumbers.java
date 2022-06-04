package day6_if_else;
/*
Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */


public class EqualNumbers {

    public static void main(String[] args) {

        int n1 =13,
                n2=13,
                n3=13;

        boolean allEqual = n1 == n2 && n2 == n3,
                onlyN1AndN2Equal = n1 == n2 && n1 != n3,
                onlyN2AndN3Equal = n2 == n3 && n2 != n1,
                onlyN3AndN1Equal = n3 == n1 && n3 != n2,
                noneOfThemEqual = n3 != n1 && n3 != n2 && n2 != n1;

        String result = "";

        if(allEqual){
            result = "all equal";
        }
        if(onlyN1AndN2Equal){
            result = "n1&n2 are equal";
        }
        if(onlyN2AndN3Equal){
            result = "n2&n3 are equal";
        }
        if(onlyN3AndN1Equal){
            result = "n3&n1 are equal";
        }
        if(noneOfThemEqual){
            result = "none of them equal";
        }

        System.out.println(result);



    }


}

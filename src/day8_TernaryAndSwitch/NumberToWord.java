package day8_TernaryAndSwitch;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 0;

        String numToWord = (number==0)?"zero":(number==2)?"two"
                :(number==3)?"three":(number==4)?"four":(number==5)?"five"
                :(number==6)?"six":(number==7)?"seven":(number==8)?"eight":"nine";

        System.out.println(numToWord);

/*
. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */








    }
}

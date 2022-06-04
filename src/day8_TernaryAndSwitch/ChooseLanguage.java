package day8_TernaryAndSwitch;

public class ChooseLanguage {

    public static void main(String[] args) {

        int num=5;

        String language =
                (num==1)?"Hello, Thank for you call":(num==2)?"Hola, gracias para llmar":(num==3)?"Merhaba, aradiginiz tesekkurler"
                        :(num==4)?"Piver, spasibo za vash zvonok":"Merci, pour votre appel";

        System.out.println(language);

        System.out.println("---------------------------------------------------------------------------------------------------");

        int num1=1;

        String result="";


        switch (num1){

            case 1:
                result = "Hello, Thank for you call";
                break;
            case 2:
                result = "Hola, gracias para llmar";
                break;
            case 3:
                result = "Merhaba, aradiginiz tesekkurler";
                break;
            case 4:
                result = "Piver, spasibo za vash zvonok";
                break;
            case 5:
                result = "Merci, pour votre appel";
                break;

        }

        System.out.println(result);


    }
}
/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */
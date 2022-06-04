package day6_if_else;

/*
Creata a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5,

Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */

public class ChooseLanguage {

    public static void main(String[] args) {

        int num =5;

        String reply ="";

        if(num ==1){
            reply = "Hello, thank for your call";
        }
        if(num ==2){
            reply = "Hola, gracias para llamar";
        }
        if(num==3){
            reply = "Merhaba, aradiginiz icin tesekkurler";
        }
        if(num==4){
            reply = "Privet, spasibo za vash zvonok";
        }
        if(num==5){
            reply = "Merci ,pour votre appel";
        }
        System.out.println(reply);
    }
}

package ejercicio9;

import java.util.Scanner;

public class ChangingLetters {

    String phrase ="La sonrisa sera la mejor arma contra la tristeza";


    public String askPhrase(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter phrase");
        String userPhrase = enter.nextLine();

        return userPhrase;
    }

    public String phrese() {
        String newPhrase = phrase.replace("a","e");

        return newPhrase;
    }

    public static void main(String[] args) {
        ChangingLetters concatenate = new ChangingLetters();
        //String userPhrase = concatenate.askPhrase();
        System.out.println(concatenate.phrese()+" "+concatenate.askPhrase());
    }
}

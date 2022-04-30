package ejercicio11;

import java.lang.reflect.Array;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;


public class LengthPhrase {


    public String askPhrase(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a phrase");
        String userPhrase = enter.nextLine();


        return userPhrase;
    }

    public Integer lengthPhrase(){
        Integer lengthPhrase = askPhrase().length();
        System.out.println(lengthPhrase);   //por qué no lo imprime
        return lengthPhrase;
    }

    public void countingVowels(){
        String[] vowels = {"a","e","i","o","u"};
        String phrase =askPhrase();

        long a = phrase.chars().filter(ch -> ch == 'a').count();
        long e = phrase.chars().filter(ch -> ch == 'e').count();
        long i = phrase.chars().filter(ch -> ch == 'i').count();
        long o = phrase.chars().filter(ch -> ch == 'o').count();
        long u = phrase.chars().filter(ch -> ch == 'u').count();

        System.out.println("The number of occurrences for each vowel is: ");
        System.out.println("a: "+ a);
        System.out.println("e: "+ e);
        System.out.println("i: "+ i);
        System.out.println("o: "+ o);
        System.out.println("u: "+ u);
    }

    public static void main(String[] args) {
        LengthPhrase objectPhrase = new LengthPhrase();
        objectPhrase.countingVowels();
        //System.out.println("The phrase length is:" + objectPhrase.lengthPhrase());
        //puedo obtener un valor de retorno sin llamar la funcion?
    }
}

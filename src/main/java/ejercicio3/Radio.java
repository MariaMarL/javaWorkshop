package ejercicio3;

import java.util.Scanner;
import static java.lang.Math.*;
//import static java.lang.Math.PI;

public class Radio {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("input radio");
        Double radio = entry.nextDouble();


        Double circleRadio = Math.pow(radio,2)*PI;
        System.out.println("El area del circulo es: " +circleRadio);

    }

}
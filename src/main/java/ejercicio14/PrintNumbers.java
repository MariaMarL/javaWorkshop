package ejercicio14;

import java.io.PrintWriter;
import java.util.Scanner;

public class PrintNumbers {

    public Integer askNumber(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Input a number");
        Integer number = enter.nextInt();
        return number;
    }

    public void showNumber(){
        Integer start=askNumber();

        for (Integer i = start; i <1001; i+=2 ){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNumbers objects = new PrintNumbers();
        objects.showNumber();
    }

}

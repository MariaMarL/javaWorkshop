package ejercicio2;

import javax.swing.*;

public class AskCompare {

    static Integer number1 = Integer.parseInt(JOptionPane.showInputDialog("input number1"));
    static Integer number2 = Integer.parseInt(JOptionPane.showInputDialog("input number2"));

    public static void main(String[] args) {
        if (number1>number2){
            System.out.println("Number1 is greater than Number2");
        }else if (number1==number2){
            System.out.println("Both are equal");
        }else{
            System.out.println("Number2 is greater than Number1");
        }
    }
}
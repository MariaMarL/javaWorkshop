package ejercicio7;

import javax.swing.*;

public class GreaterThanCero {
    public static void main(String[] args) {

        Float number;
        do {
            number = Float.parseFloat(JOptionPane.showInputDialog("Input a number"));
        } while (number < 0);

        System.out.println("The number entered was: "+number);

    }
}

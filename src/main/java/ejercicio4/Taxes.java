package ejercicio4;

import javax.swing.*;

public class Taxes {
    static Double price;
    static final Double tax = 0.21;

    public static void main(String[] args) {
        price = Double.parseDouble(JOptionPane.showInputDialog("Input price"));
        Double finalPrice = price * tax + price;
        JOptionPane.showMessageDialog(null, "The final price with taxes is " + finalPrice);
    }
}



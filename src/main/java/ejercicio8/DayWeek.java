package ejercicio8;

import javax.swing.*;

public class DayWeek {

    public String askDay() {
        String day = JOptionPane.showInputDialog("Input a Day");
        return day;
    }

    public String toUpperCase() {
        String upperDay = askDay().toUpperCase();
        //System.out.println(upperDay);
        return upperDay;
    }

    public void findDay() {
        switch (toUpperCase()) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                System.out.println("Laboral Day");
                break;

            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Day Off");
                break;
            default:
                System.out.println("not a valid day");
                break;

        }
    }



    public static void main(String[] args) {
        DayWeek dayWeek = new DayWeek();
        dayWeek.findDay();
    }
}

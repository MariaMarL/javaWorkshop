package ejercicio12;

import java.util.Scanner;
import  java.util.*;

public class CompareStrings {

    Scanner enter= new Scanner(System.in);
    public String first;
    public String second;
    public Boolean dif;
    public String differences;

    public CompareStrings() {
        System.out.println("Input the first word ");
        first = enter.nextLine();
        System.out.println("Input the second word ");
        second= enter.nextLine();
    }

    public String greather(){
        String greather;
        if(first.length()>second.length()){
            greather = first;
        }else{
            greather = second;
        }
        return greather;
    }

    public String less(){
        String less;
        if(first.length()<second.length()){
            less = first;
        }else{
            less = second;
        }
        return less;
    }

    public Integer lessLength(){
        Integer length = less().length();
        return length;
    }


    public String compare() {
        if (first.equals(second)) {
            System.out.println("Are equal");
        } else {
            System.out.println("are different");
            Boolean dif = false;
            Integer i = 0;

            do {
                if (greather().charAt(i) != less().charAt(i)) {
                    dif = true;
                } else {
                    differences = greather().substring(greather().length() - (greather().length()-i-1));
                    i++;

                }
            }
            while ((i < lessLength()) && dif == false);

        }
        return differences;
    }


    public static void main(String[] args) {
        CompareStrings objects = new CompareStrings();
        String differences1 = objects.compare();
        System.out.println("the difference is " +differences1);
    }


}

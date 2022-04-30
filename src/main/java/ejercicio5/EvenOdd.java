package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

    public static void main(String[] args) {
        Integer i = 1;

        //Integer[] evenList=new Integer[50];
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();

        while (i < 100) {

            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
            i++;

        }
        System.out.println("Even Array: ");
        System.out.println(evenList);

        System.out.println("odd Array");
        System.out.println(oddList);


    }
}

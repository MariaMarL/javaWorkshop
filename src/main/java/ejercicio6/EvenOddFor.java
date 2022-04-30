package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class EvenOddFor {
    public static void main(String[] args) {

        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();

        for (int i=1 ;i<101; i++) {
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }
        System.out.println("Even List");
        System.out.println(evenList);
        System.out.println("Odd List");
        System.out.println(oddList);
    }
}

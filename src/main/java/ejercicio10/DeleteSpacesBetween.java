package ejercicio10;

import java.util.Scanner;

public class DeleteSpacesBetween {

    public String askPhrase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase");
        String userPhrase = input.nextLine();

        return userPhrase;
    }

    public String deleteSpacesBetween(){
        String newPhrase = askPhrase().replace(" ","");

        return newPhrase;
    }

    public static void main(String[] args) {

        DeleteSpacesBetween object = new DeleteSpacesBetween();
        String deleteSpacesBetween = object.deleteSpacesBetween();
        System.out.println(deleteSpacesBetween);
    }
}

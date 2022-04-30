package ejercicio1;

public class Compare {
    static Integer number1=100;
    static Integer number2=100;

    //string resultA = (number1>number2) ? "number1":'number2";
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

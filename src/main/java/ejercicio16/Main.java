package ejercicio16;

import java.util.Scanner;

public class Main {

    public String askName(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String name = enter.nextLine();
        return name;
    }

    public Integer askEdad(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        Integer edad = enter.nextInt();
        return edad;
    }

    public Double askPeso(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese su peso: ");
        Double peso = enter.nextDouble();
        return peso;
    }

    public Double askAltura(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese su altura en metros (Ej: 1,5): ");
        Double altura = enter.nextDouble();
        return altura;
    }

    public Character askSexo(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese H para hombre, M para mujer: ");
        Character sexo = enter.next().charAt(0);
        return sexo;
    }

    public void setValues(String nombre, Double peso, Double altura, Character sexo, Integer edad){
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setPeso(peso);
        persona.setAltura(altura);
        persona.setSexo(sexo);
        persona.setEdad(edad);

    }

    public static void main(String[] args) {

        Main obj = new Main();
        String nombre = obj.askName();
        Double peso = obj.askPeso();
        Double altura = obj.askAltura();
        Character sexo = obj.askSexo();
        Integer edad = obj.askEdad();


        obj.setValues(nombre,peso,altura, sexo, edad);
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        System.out.println("El IMC de la persona 1 indica que: "+persona1.calcularIMC());
        System.out.println("El IMC de la persona 2 indica que: "+persona2.calcularIMC());
        System.out.println("El IMC de la persona 3 indica que: "+persona3.calcularIMC());
        System.out.println("");
        System.out.println("La persona 1 es mayor de edad: "+ persona1.esMayorDeEdad());
        System.out.println("La persona 2 es mayor de edad: "+ persona2.esMayorDeEdad());
        System.out.println("La persona 3 es mayor de edad: "+ persona3.esMayorDeEdad());
        System.out.println("");
        System.out.println("La informacion introducida para la persona 1 es "+persona1.toString());
        System.out.println("La informacion introducida para la persona 2 es "+persona2.toString());
        System.out.println("La informacion introducida para la persona 3 es "+persona3.toString());

    }
}

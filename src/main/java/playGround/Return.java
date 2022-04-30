/*

package playGround;
import static java.lang.Math.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import ejercicio16.Persona;

import java.util.Random;

public class Return {

    private String nombre ="";
    private Integer edad = 0;
    private String DNI;
    private char sexo = 'H';
    private Double peso = 0D;
    private Double altura = 0D;


    public Long myRandomNumber= 0L;

    public Persona(String nombre) {
        this.nombre = nombre;
        //this.myRandomNumber = numberDNI();
    }

    public Persona(String nombre, Integer edad, String DNI, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer calcularIMC() {
        Double IMC = getPeso()/Math.pow(getAltura(),2);
        final Integer IMCResult;
        if (IMC<20){
            IMCResult = -1;
        }else if(IMC>25){
            IMCResult =1;
        }else{
            IMCResult=0;
        }
        return IMCResult;
    }

    public Boolean esMayorDeEdad(){
        Boolean esMayor= (getEdad()>18) ? true : false;
        return esMayor;
    }

    public char comprobarSexo(){
        char sex = this.getSexo();
        char isCorrect = (getSexo()=='F'||getSexo()=='H'? sex: 'H');
        return isCorrect;

    }

    public Long  numberDNI(){
        //Random rand = new Random();
        Double rand_int1 = Math.random()*100000000;
        Long randomNumber = Math.round(rand_int1);
        // this.myRandomNumber = randomNumber;
        return randomNumber;
    }

    public char charDNI(){
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'A');
        return randomChar;
    }

    public String generaDNI() {
        String  DNI = numberDNI()+""+charDNI();
        return DNI;
    }

   /* public  void toString(){

            System.out.println("IMC"+ calcularIMC());
            System.out.println("Es mayor"+ esMayorDeEdad());
            System.out.println("Sexo" + comprobarSexo());
            System.out.println(generaDNI());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ",IMC= "+ calcularIMC()+
                '}';
    }

    public static void main(String[] args) {
        ejercicio16.Persona user = new ejercicio16.Persona("Laura");
        System.out.println(user.myRandomNumber);



    }



}
*/
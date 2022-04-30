package ejercicio16;

import java.util.Random;

public class Persona {

    private String nombre ="";
    private Integer edad =0;
    private String DNI;
    private char sexo='H';
    private Double peso =0D;
    private Double altura = 0D;
    private Long numberDNI;
    private char charDNI;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor con nombre, edad y sexo
    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, Integer edad, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //constructor con todos los atributos
    public Persona(String nombre, Integer edad, String DNI, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    //Calcula IMC
    public String calcularIMC(){
        Double imc=  getPeso()/Math.pow(getAltura(),2);
        Integer imcResult;
        String imcMessage;
        if(imc<20){
            imcResult = -1;
            imcMessage = "Esta por debajo de su peso ideal";
        }else if(imc>25){
            imcResult = 1;
            imcMessage = "Esta por encima de su peso ideal";
        }else{
            imcResult = 0;
            imcMessage = "Esta en su peso ideal";
        }
        return imcMessage;
    }


    //Mayor de edad
    public Boolean esMayorDeEdad(){
        Boolean esMayor = (this.edad>18)? true: false;
        return  esMayor;
    }
    //Comprueba el sexo
    public char comprobarSexo(){

        char getSexo = this.getSexo();
        char sexo = (this.sexo == 'H'|| this.sexo == 'M')? getSexo:'H';
        return sexo;
    }

    //to String
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void randomNumber(){
        Random rand = new Random(); //instance of random class
        Double doubleRandom = rand.nextDouble()*100000000;
        Long numberDNI = Math.round(doubleRandom);
        this.numberDNI = numberDNI;
    }

    public void randomChar(){
        Random random = new Random();
        char randomChar = (char) (random.nextInt(25) + 'A');
    }

    //genera DNI
    public void generaDNI(){
        this.DNI = this.numberDNI+""+this.charDNI;
    }


}

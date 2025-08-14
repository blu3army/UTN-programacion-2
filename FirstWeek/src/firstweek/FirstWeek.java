/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstweek;
import java.util.Scanner;

/**
 *
 * @author nikolai
 */
public class FirstWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloJava();
        Valores();
        NameAndAge();
        Operations(20, 30);
        SpecialChars();
        Castings(25, 12);
        DesktopTest();
    }
    
    static void HelloJava(){
        System.out.println("Hola Java!");
    }
    
    static void Valores(){
        String nombre = "Nikolai";
        int edad = 39;
        double altura = 1.93;
        boolean estudiante = true;
        
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
    }
    
    static void NameAndAge(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");        
        String name = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        String edad = input.nextLine();
        
        System.err.println("Su nombre es " + name + ", su edad es: " + edad);
        
    }
    
    
    static void Operations(int a, int b){
        
        int suma = a + b;
        int resta = a - b;
        int multi = a * b;
        double div = a / (double) b;
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(String.format("%.2f", div));
        
    }
    
    static void SpecialChars(){
    
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }
    
    static void Castings(int x, int z){
        System.out.println(x / z);
        
        System.out.println(x / (double) z);
        
    }
    
    
    static void DesktopTest(){
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
    
}

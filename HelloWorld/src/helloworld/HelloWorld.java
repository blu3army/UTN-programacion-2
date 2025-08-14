/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.*;

/**
 *
 * @author nikolai
 */
public class HelloWorld {

    
    final static double WORK_DAYS = 5.5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Say your age: "); // Instrucción
        
        // 2 + 4; // Expresión
        
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Say your name: ");
        
        String name = scanner.nextLine();
        
        System.out.print("Say your fav letter: ");
        
        char letter = scanner.nextLine().charAt(0);
        
        System.out.println("Hello world! I'm " + name + ", your letter is: " + letter + ", your age is " + age );
        
        
        System.out.println("Ingrese su sueldo diario");
        double sueldoDiario = Double.parseDouble( scanner.nextLine() );
        
        System.out.println("Sueldo semanal $" + SueldoSemanal(sueldoDiario));
        
    }
    
    
    static double SueldoSemanal(double sueldoDiario){
    
        return sueldoDiario * WORK_DAYS;
    }
    
    
    static void PrimitiveCastings(){
        //Por ensanchamiento
        int aNumber = 10;
        double aDouble = 10; // Hace automaticamente (double) 10
        
        int anotherNumber = (int) aDouble; // No es automatico, debemos explicitamente hacer el casting
        
    }
    
    // Desarrollar un algo, que permita ingresar un monto en usd, (int). Debe mostrar como pagar con la menor cantidad de billetes posibles
    static void PayInNotes(int amount){
        
    }
    
}

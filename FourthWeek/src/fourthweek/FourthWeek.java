/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fourthweek;
/**
 *
 * @author nikolai
 */


public class FourthWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado(1, "Carlos", "Gutierrez", 1500.00);
        Empleado empleado2 = new Empleado("Erik", "Camarena");
        Empleado empleado3 = new Empleado(3, "Monica", "Belucci", 2000);
        Empleado empleado4 = new Empleado("José", "Hernandéz");
        
        empleado1.actualizarSalario(10.5);
        empleado2.actualizarSalario(300);
        empleado3.actualizarSalario(7.5);
        empleado4.actualizarSalario(500);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        
        System.out.println("El total de empleados es: " + Empleado.getTotalEmpleados());
    }
    
}

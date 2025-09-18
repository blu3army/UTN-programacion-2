/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fourthweek;

import java.util.UUID;

/**
 *
 * @author nikolai
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this( totalEmpleados + 1 , nombre, puesto, 1400.00);
    }

    public void actualizarSalario(double porcentaje){
        this.salario = this.salario * (1 + porcentaje/100);
    }

    public void actualizarSalario(int sumaFija){
        this.salario = this.salario + sumaFija;
    }
    
    
    @Override
    public String toString(){
       return this.getClass().getSimpleName() + " { id = " + id + ", nombre = " + nombre + ", puesto = " + puesto + ", salario = " + salario + "}" ;
    }
    
    static public int getTotalEmpleados(){
        return Empleado.totalEmpleados;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    
}

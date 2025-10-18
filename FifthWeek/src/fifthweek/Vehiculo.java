/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;

/**
 *
 * @author nikolai
 */

/*
    Vehículo - Motor - Conductor
    a. Agregación: Vehículo → Motor
    b. Asociación bidireccional: Vehículo ↔ Conductor
    Clases y atributos:
    i. Vehículo: patente, modelo
    ii. Motor: tipo, numeroSerie
    iii. Conductor: nombre, licencia

*/

class Motor {
    private String numeroSerie;
    private String tipo;

    public Motor(String numeroSerie, String tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}

class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        
        if(vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    
    
}

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
   
    
    public void mostrar(){
        System.out.println(String.format("Vehiculo %s patente %s --- Motor %s --- Conductor %s", this.modelo, this.patente, this.motor.getTipo(), this.conductor.getNombre()));
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;

/**
 *
 * @author nikolai
 */

class Bateria {
    private String modelo;
    private double capacidad;

    public Bateria(String modelo, double capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }
    
    
    
}

class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    
    
}

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    
    }

    public Usuario getUsuario() {
       
        return usuario;
        
    }
    
    public void mostrar(){
        System.out.println(String.format("Celular %s %s, batería: %.2f, usuario: %s", this.marca, this.modelo, this.bateria.getCapacidad(), this.usuario.getNombre()));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;

import java.time.LocalDate;
/**
 *
 * @author nikolai
 */

class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
    
}

class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
        
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
    
}

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);        
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    
    public void mostrar(){
    
        System.out.println( String.format("Pasaporte %s, Titular: %s, Foto: %s.%s", this.numero, this.titular.getNombre(), this.foto.getImagen(), this.foto.getFormato()));
    
    }
    
    
    
}

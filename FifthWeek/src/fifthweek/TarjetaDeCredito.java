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

class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    
    
    
}

class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
    
            
}


public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaDeVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, LocalDate fechaDeVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
        if(cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
        
    }
    
    
    public void mostrar(){
    
        System.out.println(String.format("Tarjeta numero: %s, pertenece a %s, emitida por %s", this.numero, this.cliente.getNombre(), this.banco.getNombre()));
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;

/**
 *
 * @author nikolai
 */

class ClienteMesa {
    private String nombre;
    private String telefono;

    public ClienteMesa(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
            
}

class Mesa {
    private String numero;
    private int capacidad;

    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    
    
}

public class Reserva {
    private String fecha;
    private String hora;
    private ClienteMesa cliente;
    private Mesa mesa;
    
    
    /*    
        Reserva - ClienteMesa - Mesa
        a. Asociación unidireccional: Reserva → ClienteMesa
        b. Agregación: Reserva → Mesa
    */

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(ClienteMesa cliente) {
        this.cliente = cliente;
    }
    
    public void mostrar(){
        System.out.println(String.format("Reserva para el %s a las %s, Mesa n %s para %d personas, Cliente: %s", this.fecha, this.hora, this.mesa.getNumero(), this.mesa.getCapacidad(), this.cliente.getNombre()));
    }
    
}

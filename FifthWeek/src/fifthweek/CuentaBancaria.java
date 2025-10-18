/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author nikolai
 */

/*
     CuentaBancaria - ClaveSeguridad - Titular
        a. Composición: CuentaBancaria → ClaveSeguridad
        b. Asociación bidireccional: CuentaBancaria ↔ Titular
    Clases y atributos:
        i. CuentaBancaria: cbu, saldo
        ii. ClaveSeguridad: codigo, ultimaModificacion
        iii. Titular: nombre, dni.

*/

class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu", Locale.ENGLISH);
        
        return this.ultimaModificacion.format(formatter);
    }
    
    
        
}


class TitularCuenta {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public TitularCuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        
        if(cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    
    
}

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private TitularCuenta titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, String codigo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, LocalDate.now());    
    }

    public TitularCuenta getTitular() {
        return titular;
    }

    public void setTitular(TitularCuenta titular) {
        this.titular = titular;
        
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }
    
    
    public void mostrar(){
        System.out.println(String.format(
                "Cuenta con cbu %s, perteneciente a %s --- Clave: %s. Ultima modificación: %s ---- Saldo: $%,.2f",
                this.cbu, this.titular.getNombre(), this.claveSeguridad.getCodigo(), this.claveSeguridad.getUltimaModificacion(), this.saldo
        ));
    }
    
    
}

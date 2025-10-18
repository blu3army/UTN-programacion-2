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
    
 Impuesto - Contribuyente - Calculadora
    a. Asociación unidireccional: Impuesto → Contribuyente
    b. Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
    i. Impuesto: monto.
    ii. Contribuyente: nombre, cuil.
    iii. Calculadora->método: void calcular(Impuesto impuesto)

*/

class Calculadora {
    public void calcular(Impuesto impuesto){
        double total = impuesto.getMonto() * impuesto.getAlicuota();
        System.out.println(String.format("🧮 Impuesto %s, monto: $%,.2f alicuota: %,.2f, total a pagar: %,.2f. Contribuyente: %s, CUIL: %s",
                impuesto.getNombre(), impuesto.getMonto(), impuesto.getAlicuota(), total, impuesto.getContribuyente().getNombre(), impuesto.getContribuyente().getCuil()));        
    }
}


class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }
    
    
    
    
}


public class Impuesto {
    private String nombre;
    private double monto;
    private double alicuota;
    private Contribuyente contribuyente;

    public Impuesto(String nombre, double monto, double alicuota) {
        this.nombre = nombre;
        this.alicuota = alicuota;
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    public double getAlicuota() {
        return alicuota;
    }
    
    
    
}

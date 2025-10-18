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

Documento - FirmaDigital - Usuario
    a. Composición: Documento → FirmaDigital
    b. Agregación: FirmaDigital → Usuario
    Clases y atributos:
    i. Documento: titulo, contenido
    ii. FirmaDigital: codigoHash, fecha
    iii. Usuario: nombre, email

*/

class FirmaDigital {
    private String codigoHash;
    private String fecha;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
}

class UsuarioDocumento {
    private String nombre;
    private String email;

    public UsuarioDocumento(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    private UsuarioDocumento usuario;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, UsuarioDocumento usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
        this.usuario = usuario;
    }
    
    public void mostrar(){
        System.out.println(String.format("Documento %s, Firma digital: %s - %s, Usuario: %s", this.titulo, this.firmaDigital.getCodigoHash(), this.firmaDigital.getFecha(), this.usuario.getNombre()));
    }
    
}

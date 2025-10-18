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
    GeneradorQR - Usuario - CódigoQR
        a. Asociación unidireccional: CódigoQR → Usuario
        b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
    Clases y atributos:
        i. CodigoQR: valor.
        ii. Usuario: nombre, email.
        iii. GeneradorQR->método: void generar(String valor, Usuario usuario)

*/

class UsuarioQR {
    private String nombre;
    private String email;

    public UsuarioQR(String nombre, String email) {
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

class CodigoQR {
    private String valor;
    private UsuarioQR usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public UsuarioQR getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioQR usuario) {
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }
    
    
    
}

public class GeneradorQR {
    public void generar(String valor, UsuarioQR usuario){
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        
        System.out.println(String.format("🧬 Codigo QR: %s, email: %s", codigo.getValor(), codigo.getUsuario().getEmail()));
    }
}

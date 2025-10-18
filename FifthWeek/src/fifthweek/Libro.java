/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;

/**
 *
 * @author nikolai
 */

class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
    
}


class Editorial {
    private String nombre;
    private String ciudad;

    public Editorial(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    
}

public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }    
    
    public void mostrar(){
    
        System.out.println(String.format("Libro %s, Autor: %s, Editorial: %s - Ciudad: %s", this.titulo, this.autor.getNombre(), this.editorial.getNombre(), this.editorial.getCiudad()));
    }
    
}

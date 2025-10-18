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
    Reproductor - Canción - Artista
        a. Asociación unidireccional: Canción → Artista
        b. Dependencia de uso: Reproductor.reproducir(Cancion)
    Clases y atributos:
        i. Canción: titulo.
        ii. Artista: nombre, genero.
        iii. Reproductor->método: void reproducir(Cancion cancion)
    
*/

class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }
      

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}

class Artista{
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    
    
    
}

public class Reproductor {
    
    public void reproducir(Cancion cancion){
        System.out.println(String.format("💿 Reproduciendo: %s, by %s. 🎶 Genero %s", cancion.getTitulo(), cancion.getArtista().getNombre(), cancion.getArtista().getGenero()));
    }
    
}

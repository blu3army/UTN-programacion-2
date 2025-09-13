package thirdweek;

/**
 *
 * @author nikolai
 */

class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo(){
        System.out.println(String.format("%s %s curso: %s, calificación: %d", nombre, apellido, curso, calificacion));
    }
    
    void subirCalificacion(int puntos){
        calificacion += puntos;
    }
    
    void bajarCalificacion(int puntos){
        calificacion -= puntos;
    }
}

class Mascota {
    String nombre, especie; 
    int edad;
    
    void mostrarInfo(){
        System.out.println(String.format("%s - %s, edad: %d", nombre, especie, edad));
    }
    
    void cumplirAnio(){
        edad += 1;
    }
}

class Libro {
    String titulo, autor;
    int anioPublicacion;
    
    String getTitulo(){
        return titulo;
    }
    
    String getAutor(){
        return autor;
    }
    
    int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    void setAnioPublicacion(int anio){
    
        if(anio >= 0){
            anioPublicacion = anio;
        }
        
    }
    
}


class Gallina {
    int idGallina, edad, huevosPuestos;
    
    void ponerHuevo(){
        huevosPuestos += 1;
    } 
    void envejecer(){
        edad += 1;
    }
    void mostrarEstado(){
        System.out.println(String.format("🐔 id: %d edad: %d, 🥚 puestos: %d", idGallina, edad, huevosPuestos));
    }
}


class NaveEspacial {
    final int LIMITE_CARGA = 1000;
    String nombre;
    int combustible;
    
    void despegar(){
        System.out.println(nombre + " despegando 🚀");
    }
    
    void avanzar(int distancia){
        if(combustible >= 100){
            System.out.println("Ha avanzado " + distancia + " años luz 🚀");
            combustible -= (distancia * 10);
        } else {
            System.out.println("Necesita al menos 100 unidades de combustible");
        }
        
    }
    
    void recargarCombustible(int cantidad){
        if(cantidad + combustible < LIMITE_CARGA){
            combustible += cantidad;
        } else {
            System.out.println("⛽️ Está cargando más de lo que permite el tanque");
        }
        
    }
    
    void mostrarEstado(){
        System.out.println(String.format("Bienvenido a bordo de %s, posee %d uds. de combustible", nombre, combustible));
    }
    
}

public class ThirdWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Carlos";
        estudiante.apellido = "Pereyra";
        estudiante.curso = "Matematicas";
        estudiante.calificacion = 6;
        
        estudiante.subirCalificacion(3);
        estudiante.bajarCalificacion(2);
        estudiante.mostrarInfo();
        
        
        // 2
        Mascota mascota = new Mascota();
        mascota.nombre = "Canela";
        mascota.especie = "Caniche";
        mascota.edad = 6;
        mascota.mostrarInfo();
        mascota.cumplirAnio();
        mascota.cumplirAnio();
        mascota.mostrarInfo();
        
        // 3 
        Libro libro = new Libro();
        libro.autor = "George R R Martin";
        libro.titulo = "La danza de los dragones";
        libro.setAnioPublicacion(1980);
        System.out.println(libro.getAnioPublicacion());
        libro.setAnioPublicacion(-150);
        System.out.println(libro.getAnioPublicacion());
        libro.setAnioPublicacion(1985);
        System.out.println(libro.getAnioPublicacion());
        
        // 4
        Gallina gallinaUno = new Gallina();
        gallinaUno.idGallina = 1;
        gallinaUno.edad = 3;
        gallinaUno.huevosPuestos = 10;
        
        gallinaUno.ponerHuevo();
        gallinaUno.ponerHuevo();
        gallinaUno.envejecer();
        
        gallinaUno.mostrarEstado();
        
        Gallina gallinaDos = new Gallina();
        gallinaDos.idGallina = 2;
        gallinaDos.edad = 4;
        gallinaDos.huevosPuestos = 14;
        
        gallinaDos.ponerHuevo();
        gallinaDos.envejecer();
        
        gallinaDos.mostrarEstado();
        
        
        // 5
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Prometeus";
        nave.combustible = 50;
        
        nave.despegar();
        nave.avanzar(10);
        nave.recargarCombustible(800);
        nave.avanzar(10);
        
        nave.mostrarEstado();
                
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthweek;

/**
 *
 * @author nikolai
 
 * 
 /*
    EditorVideo - Proyecto - Render
        a. Asociación unidireccional: Render → Proyecto
        b. Dependencia de creación: EditorVideo.exportar(String, Proyecto)
    c. Clases y atributos:
        i. Render: formato.
        ii. Proyecto: nombre, duracionMin.
        iii. EditorVideo->método: void exportar(String formato, Proyecto proyecto)
 */

class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }
    
    
    
}

class Proyecto {
    private String nombre;
    private double duracionMin;

    public Proyecto(String nombre, double duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionMin() {
        return duracionMin;
    }
    
    
    
}

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        
        System.out.println(String.format("💾 Exportando proyecto %s, en formato: %s. 🕰️ Duracion: %.2f mins.", render.getProyecto().getNombre(), formato, render.getProyecto().getDuracionMin()));
       
    }
}

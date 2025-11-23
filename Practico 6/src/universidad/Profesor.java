package universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c){

        if (!cursos.contains(c)){
            cursos.add(c);
        }

        if (c.getProfesor() != this){
            c.setProfesor(this);
        }

    }

    public void eliminarCurso(Curso c){
        cursos.remove(c);
        if(c.getProfesor() == this){
            c.setProfesor(null);
        }
    }


    public void listarCursos(){
        System.out.println("\nLista de cursos del profesor " + nombre);

        for (Curso curso: cursos){
            System.out.println(curso.toString());
        }
    }

    public List<Curso> getCursos(){
        return cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}

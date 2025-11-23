package universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    List<Profesor> profesores;
    List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p){
        if (profesores.contains(p)){
            System.out.println("Profesor " + p.getNombre() + " ya se encuentra en la lista" );
        } else {
            profesores.add(p);
            System.out.println("Profesor " + p.getNombre() + " agregado correctamente" );
        }
    }

    public void agregarCurso(Curso c){
        if (cursos.contains(c)){
            System.out.println("Curso " + c.getNombre() + " ya se encuentra en la lista" );
        } else {
            cursos.add(c);
            System.out.println("Profesor " + c.getNombre() + " agregado correctamente" );
        }
    }


    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor p = buscarProfesorPorId(idProfesor);
        Curso c = buscarCursoPorCodigo(codigoCurso);

        if (p != null){
            if (c != null){
                p.agregarCurso(c);
                System.out.println("Profesor " + p.getNombre() + " asignado a " + c.getNombre());
            }
            else {
                System.out.println("Curso con ese codigo no existe");
            }
        }
        else {
            System.out.println("Profesor con ese id no existe");
        }
    }

    public Profesor buscarProfesorPorId(String id){
        for (Profesor p: profesores){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso c: cursos){
            if (c.getCodigo().equals(codigo)){
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo){
        Curso c = buscarCursoPorCodigo(codigo);

        if (c != null){
            c.setProfesor(null);
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id){
        Profesor p = buscarProfesorPorId(id);

        if (p != null){
            for (Curso c: p.getCursos()){
                c.setProfesor(null);
            }

            profesores.remove(p);
        }

    }

    public void listarCursos(){
        for (Curso c: cursos){
            System.out.println(c.toString());
        }
    }

    public void listarProfesores(){
        for (Profesor p: profesores){
            System.out.println(p.toString());
        }
    }
}

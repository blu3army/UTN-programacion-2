import universidad.Curso;
import universidad.Profesor;
import universidad.Universidad;

public class Caso3 {
    static void main(String[] args) {

        Profesor profesor = new Profesor("1", "Eriko", "Mecánica");
        Profesor profesor2 = new Profesor("2", "Daniel", "Ingeniería");
        Profesor profesor3 = new Profesor("3", "Karina", "Electrónica");

        Curso curso1 = new Curso("1", "Motores");
        Curso curso2 = new Curso("2", "Resistencia de materiales");
        Curso curso3 = new Curso("3", "Calculo y estructuras");
        Curso curso4 = new Curso("4", "Física II");
        Curso curso5 = new Curso("5", "Química II");

        Universidad universidad = new Universidad("UNaM");

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        universidad.agregarProfesor(profesor);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);

        System.out.println("\nAsignación de profesores a cursos\n");

        universidad.asignarProfesorACurso("1", "1");
        universidad.asignarProfesorACurso("2", "2");
        universidad.asignarProfesorACurso("3", "2");
        universidad.asignarProfesorACurso("4", "1");
        universidad.asignarProfesorACurso("5", "3");

        System.out.println("\nListado de cursos con sus profesores\n");

        universidad.listarCursos();

        universidad.eliminarProfesor("3");



    }
}

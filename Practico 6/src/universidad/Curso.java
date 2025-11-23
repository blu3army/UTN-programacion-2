package universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor p){

        if (this.profesor != null && this.profesor != p) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        this.profesor = p;

        if (p != null) {
            boolean exist = false;

            for (Curso c : p.getCursos()) {
                if (c == this) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                p.agregarCurso(this);
            }
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}

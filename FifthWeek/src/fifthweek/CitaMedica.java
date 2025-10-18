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
    CitaMédica - Paciente - Profesional
    a. b. Asociación unidireccional: CitaMédica → Paciente,
    Asociación unidirecciona: CitaMédica → Profesional
    Clases y atributos:
    i. CitaMédica: fecha, hora
    ii. Paciente: nombre, obraSocial
    iii. Profesional: nombre, especialidad
*/

class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
}

class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    
    
    
}


public class CitaMedica {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;
    
    public CitaMedica(String fecha, String hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    public void mostrar(){
        System.out.println(String.format(
                "Fecha: %s Hora: %s --- Paciente: %s, Obra Social %s --- Profesional: %s Especialidad: %s",
                this.fecha, this.hora, this.paciente.getNombre(), this.paciente.getObraSocial(), this.profesional.getNombre(), this.profesional.getEspecialidad()
        ));
    }
    
}

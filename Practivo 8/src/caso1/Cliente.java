package caso1;

public class Cliente {
    public String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("[NOTIFICACION a Cliente " + this.nombre + "]: " + mensaje);
    }
    
}

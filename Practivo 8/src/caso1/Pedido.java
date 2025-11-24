package caso1;

import java.util.ArrayList;

public class Pedido implements Pagable , Notificable {
    private ArrayList<Producto> productos;
    private Cliente cliente;
    private String estado;
    
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "CREADO";
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambio(nuevoEstado); 
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); 
        }
        return total;
    }
    @Override
    public void notificarCambio(String mensaje) {
        // En un caso real, notificaría a todos los observadores. 
        // Aquí notificamos al Cliente asociado.
        this.cliente.recibirNotificacion("El estado de su pedido ha cambiado a: " + mensaje);
    }

    
}

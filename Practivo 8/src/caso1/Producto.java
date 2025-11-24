package caso1;

public class Producto implements Pagable  {
        private String nombre;
        private double precio;
        
        public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        }

        public Producto() {}

    @Override
    public double calcularTotal() {
        return this.precio;
    }
}

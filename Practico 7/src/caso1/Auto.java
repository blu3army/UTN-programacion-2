package caso1;

public class Auto extends Vehiculo {
    private String cantidadPuertas;

    public Auto(String marca, String modelo, String cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto -> Marca: " + marca + " - Modelo: " + modelo + " - Cant. puertas: " + cantidadPuertas );
    }
}

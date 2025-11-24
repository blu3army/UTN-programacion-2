package caso1;

public class TarjetaCredito implements PagoConDesc, Pago {
    @Override
    public double aplicarDescuento(double montoBase) {
        if (montoBase > 500) {
            System.out.println("Aplicando 10% de descuento por tarjeta de credito.");
            return montoBase * 0.90; 
        }
        return montoBase;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de credito procesado. Monto: $" + monto);
    }
    
}

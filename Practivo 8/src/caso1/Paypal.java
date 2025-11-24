package caso1;

public class Paypal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado. Monto: $" + monto);
    }
    
}

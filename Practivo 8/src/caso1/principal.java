package caso1;

public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Erika Lopez");
        System.out.println("Pedido de: " + cliente.nombre);

        Producto p1 = new Producto("Notebook Dell", 1350000.00);
        Producto p2 = new Producto("Mouse", 5500.00);
        Producto p3 = new Producto("Teclado", 13500.00);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);
        
        System.out.println("");
        System.out.println("Calculo del total");
        double subtotal = pedido.calcularTotal();
        System.out.println("Subtotal del pedido: $" + subtotal);
        
        System.out.println("");
        System.out.println("Pago");

        Pago pagoPayPal = new Paypal();
        System.out.println("Pagando con Paypal");
        pagoPayPal.procesarPago(subtotal);
        
        System.out.println("");
        TarjetaCredito pagoTarjeta = new TarjetaCredito();
        double totalConDescuento = pagoTarjeta.aplicarDescuento(subtotal);
        
        System.out.println("Total con descuento: $" + totalConDescuento);
        pagoTarjeta.procesarPago(totalConDescuento);
        
        System.out.println("");
        System.out.println("Notificacion");

        System.out.println("Cambiando el estado del pedido");
        pedido.cambiarEstado("PAGADO"); 

        pedido.cambiarEstado("ENVIADO"); 
    }
    }
    

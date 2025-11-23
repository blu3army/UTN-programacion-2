import inventario.CategoriaProducto;
import inventario.Inventario;
import inventario.Producto;

import java.util.ArrayList;

public class Caso1 {

    static void main(String[] args) {

        Producto p1 = new Producto("1", "Remera", 20.5, 10, CategoriaProducto.ROPA);
        Producto p2 = new Producto("2", "Jean", 40.2, 8, CategoriaProducto.ROPA);
        Producto p3 = new Producto("3", "Laptop Asus", 650, 5, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("4", "iPhone 14", 750, 7, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("5", "Sofá cama", 120, 4, CategoriaProducto.HOGAR);
        Producto p6 = new Producto("6", "Pollo congelado el kg", 6.5, 20, CategoriaProducto.ALIMENTOS);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);

        System.out.println("\nBuscar producto por Id");
        Producto productoPorId = inventario.buscarProductoPorId("4");
        System.out.println(productoPorId.mostrarInfo());

        System.out.println("\nListar todos los productos");
        ArrayList<Producto> productosPorCat = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p: productosPorCat){
            System.out.println(p.mostrarInfo());
        }



        System.out.println("\nEliminar y mostrar productos");
        inventario.eliminarProducto("3");
        inventario.listarProductos();

        System.out.println("\nActualizar stock");
        inventario.actualizarProducto("2", 17);
        inventario.listarProductos();

        System.out.println("\nMostrar total stock");
        System.out.println("Total stock: " + inventario.obtenerTotalStock());

        System.out.println("\ninventario.Producto con mayor stock");
        Producto pMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println(pMayorStock.mostrarInfo());

        System.out.println("\nFiltrar productos por precio");
        inventario.filtrarProductosPorPrecio(10, 250).listarProductos();


        System.out.println("\nCategorias disponibles");
        inventario.mostrarCategoriasDisponibles();
    }

}

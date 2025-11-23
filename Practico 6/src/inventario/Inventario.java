package inventario;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void listarProductos(){
        for (Producto p: productos){
            System.out.println(p.mostrarInfo());
        }
    }

    public Producto buscarProductoPorId(String id){
        for (Producto p: productos){
            if (p.getId().equals(id)){
                return p;
            }
        }

        return null;
    }

    public String eliminarProducto(String id){
        Iterator<Producto> it = productos.iterator();

        while (it.hasNext()){
            Producto p = it.next();

            if (p.getId().equals(id)){
                it.remove();
                return id;
            }
        }

        return null;
    }


    public Producto actualizarProducto(String id, int nuevaCantidad){
        for (Producto p: productos){
            if (p.getId().equals(id)){
                p.setCantidad(nuevaCantidad);
                return p;
            }
        }

        return null;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto p: productos){
            if (p.getCategoria() == categoria){
                productosFiltrados.add(p);
            }
        }

        return productosFiltrados;
    }

    public int obtenerTotalStock(){
        int totalStock = 0;

        for (Producto p: productos){
            totalStock += p.getCantidad();
        }

        return totalStock;
    }

    public Producto obtenerProductoConMayorStock(){
        Producto productoConMayorStock = null;

        for (Producto p: productos){
            if (productoConMayorStock == null){
                productoConMayorStock = p;
            } else {
                if (p.getCantidad() > productoConMayorStock.getCantidad()){
                    productoConMayorStock = p;
                }
            }
        }

        return productoConMayorStock;

    }

    public Inventario filtrarProductosPorPrecio(double min, double max){
        Inventario productosFiltradosPorPrecio = new Inventario();

        for (Producto p: productos){
            if (p.getPrecio() >= min && p.getPrecio() <= max){
                productosFiltradosPorPrecio.agregarProducto(p);
            }
        }

        return productosFiltradosPorPrecio;
    }

    public void mostrarCategoriasDisponibles(){

        for (CategoriaProducto cat: CategoriaProducto.values()){
            System.out.println(cat + " - " + cat.getDescription());
        }

    }


}

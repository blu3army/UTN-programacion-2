package inventario;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas para vestir"),
    HOGAR("Artículos para el hogar");

    private final String description;

    CategoriaProducto(String s) {
        this.description = s;
    }

    public String getDescription(){
        return description;
    }
}

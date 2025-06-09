package ejercicio4;

public abstract class Combo implements Comida {
    protected float precio;
    private String descripcion;

    public Combo(float precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
}

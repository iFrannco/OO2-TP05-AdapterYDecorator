package ejercicio4;

public abstract class Comida {
    protected float precio;
    private String descripcion;

    public Comida(float precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public abstract float calcularCosto();
}

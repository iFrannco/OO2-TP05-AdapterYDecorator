package ejercicio4;

public class ComboFamiliar extends Combo {
    public ComboFamiliar(float precio, String descripcion) {
        super(precio, descripcion);
    }

    @Override
    public float calcularCosto() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return "Combo Familiar";
    }
}

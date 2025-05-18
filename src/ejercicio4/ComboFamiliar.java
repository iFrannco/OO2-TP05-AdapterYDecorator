package ejercicio4;

public class ComboFamiliar extends Comida{
    public ComboFamiliar(float precio, String descripcion) {
        super(precio, descripcion);
    }

    @Override
    public float calcularCosto() {
        return precio;
    }
}

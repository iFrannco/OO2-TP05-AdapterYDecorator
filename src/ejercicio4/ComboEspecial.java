package ejercicio4;

public class ComboEspecial extends Comida{
    public ComboEspecial(float precio, String descripcion) {
        super(precio, descripcion);
    }

    @Override
    public float calcularCosto() {
        return precio;
    }
}

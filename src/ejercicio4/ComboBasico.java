package ejercicio4;

public class ComboBasico extends Comida{

    public ComboBasico(float precio, String descripcion) {
        super(precio, descripcion);
    }

    @Override
    public float calcularCosto() {
        return precio;
    }
}

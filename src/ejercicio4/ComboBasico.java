package ejercicio4;

public class ComboBasico extends Combo {

    public ComboBasico(float precio, String descripcion) {
        super(precio, descripcion);
    }

    @Override
    public float calcularCosto() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return "Combo basico";
    }
}

package ejercicio4;

public class ComboEspecial extends Combo {
    public ComboEspecial(float precio, String descripcion) {
        super(precio, descripcion);
    }

    @Override
    public float calcularCosto() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return "Combo Especial";
    }
}

package ejercicio4;

public class ConQueso extends Decorador {
    private static final float precioQueso = 10;

    public ConQueso(Comida comida) {
        super(comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precioQueso;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + "\n + Queso";
    }
}

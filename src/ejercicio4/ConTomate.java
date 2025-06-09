package ejercicio4;

public class ConTomate extends Decorador {
    private static final float precioTomate = 40;

    public ConTomate(Comida comida) {
        super(comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precioTomate;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + "\n + Tomate";
    }
}

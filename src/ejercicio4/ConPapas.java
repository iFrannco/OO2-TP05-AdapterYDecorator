package ejercicio4;

public class ConPapas extends Decorador {
    private static final float precioPapas = 20;

    public ConPapas(Comida comida) {
        super(comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precioPapas;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + "\n + Papas";
    }

}

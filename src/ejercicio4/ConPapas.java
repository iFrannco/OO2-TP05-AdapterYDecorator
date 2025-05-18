package ejercicio4;

public class ConPapas extends Decorador{
    private static final float precioPapas = 20;
    public ConPapas(Comida comida) {
        super(precioPapas, comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precio;
    }
}

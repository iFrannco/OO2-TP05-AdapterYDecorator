package ejercicio4;

public class ConCarne extends Decorador{
    private static final float precioCarne = 60;

    public ConCarne(Comida comida) {
        super(precioCarne, comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precio;
    }
}

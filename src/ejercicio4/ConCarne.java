package ejercicio4;

public class ConCarne extends Decorador {
    private static final float precioCarne = 60;
    private static final String DESCRIPCION = "+ carne ";

    public ConCarne(Comida comida) {
        super(comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precioCarne;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + "\n + carne";
    }
}

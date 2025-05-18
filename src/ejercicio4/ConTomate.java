package ejercicio4;

public class ConTomate extends Decorador{
    private static final float precioTomate = 40;

    public ConTomate(Comida comida) {
        super(precioTomate, comida);
    }

    @Override
    public float calcularCosto() {
        return super.calcularCosto() + precio;
    }
}

package ejercicio4;

public abstract class Decorador extends Comida{
    private Comida comida;

    public Decorador(float precio, Comida comida) {
        super(precio, "");
        this.comida = comida;
    }

    @Override
    public float calcularCosto() {
        return comida.calcularCosto();
    }
}

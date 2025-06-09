package ejercicio4;

public abstract class Decorador implements Comida {
    private Comida comida;

    public Decorador(Comida comida) {
        this.comida = comida;
    }

    @Override
    public float calcularCosto() {
        return comida.calcularCosto();
    }

    @Override
    public String obtenerDescripcion() {
        return comida.obtenerDescripcion();
    }

}

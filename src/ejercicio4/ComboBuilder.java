package ejercicio4;

public class ComboBuilder {
    private Comida comida;

    // agregar mapa
    public ComboBuilder(Comida comida) {
        this.comida = comida;
    }

    public ComboBuilder agregarTomate() {
        this.comida = new ConTomate(this.comida);
        return this;
    }

    public ComboBuilder agregarPapas() {
        this.comida = new ConPapas(this.comida);
        return this;
    }

    public ComboBuilder agregarCarne() {
        this.comida = new ConCarne(this.comida);
        return this;
    }

    public ComboBuilder agregarQueso() {
        this.comida = new ConQueso(this.comida);
        return this;
    }

    public Comida build() {
        return this.comida;
    }

}

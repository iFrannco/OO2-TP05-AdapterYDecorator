package ejercicio4;

public class ComboBuilder {
    private Comida combo;

    // agregar mapa
    public ComboBuilder(Comida combo) {
        this.combo = combo;
    }

    public ComboBuilder agregarTomate() {
        this.combo = new ConTomate(this.combo);
        return this;
    }

    public ComboBuilder agregarPapas() {
        this.combo = new ConPapas(this.combo);
        return this;
    }

    public ComboBuilder agregarCarne() {
        this.combo = new ConCarne(this.combo);
        return this;
    }

    public ComboBuilder agregarQueso() {
        this.combo = new ConQueso(this.combo);
        return this;
    }

    public Comida build() {
        return this.combo;
    }

}

package ejercicio2;

class Texto implements Figura {
    private final Coordenada coordenada;
    private String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.texto = texto;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.pintarTexto(texto, coordenada);
        // g2d.drawString(texto, coordenada.x(), coordenada.y());
    }
}

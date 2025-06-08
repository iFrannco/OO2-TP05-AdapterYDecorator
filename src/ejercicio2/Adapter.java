package ejercicio2;

import java.awt.*;

public class Adapter implements Panel {
    private Graphics2D g2d;

    public Adapter(Graphics2D g2d) {
        this.g2d = g2d;
    }


    @Override
    public void pintarLinea(Coordenada coordenada, int longitud) {
        g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());

    }

    @Override
    public void pintarCirculo(Coordenada coordenada, int radio) {
        g2d.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }

    @Override
    public void pintarTexto(String texto, Coordenada coordenada) {
        g2d.drawString(texto, coordenada.x(), coordenada.y());
    }


}

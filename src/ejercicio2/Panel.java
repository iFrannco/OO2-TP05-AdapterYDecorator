package ejercicio2;

public interface Panel {

    void pintarLinea(Coordenada coordenada, int longitud);

    void pintarCirculo(Coordenada coordenada, int radio);

    void pintarTexto(String texto, Coordenada coordenada);
}

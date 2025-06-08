package ejercicio3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var reporteDecorado = new ReporteSinSobreescritura(new ReporteBase("contenido"));
        reporteDecorado.exportar(new File("/home/franco/reporte_decorado.txt"));
    }
}

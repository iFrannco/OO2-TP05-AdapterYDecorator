package ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class ReporteBase implements Exportador {
    private String reporte;
    public ReporteBase(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo", e);
        }
    }
}

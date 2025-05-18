package ejercicio3;

import java.io.File;

public class ReporteSinSobreescritura implements Exportador{
    private Exportador exportador;

    public ReporteSinSobreescritura(Exportador exportador) {
        this.exportador = exportador;
    }

    @Override
    public void exportar(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        exportador.exportar(file);
    }
}

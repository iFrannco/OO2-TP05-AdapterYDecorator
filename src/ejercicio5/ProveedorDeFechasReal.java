package ejercicio5;

import java.time.LocalDate;

public class ProveedorDeFechasReal implements ProveedorDeFechas {
    @Override
    public LocalDate obtenerFecha() {
        return LocalDate.now();
    }
}

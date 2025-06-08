package ejercicio5;

import java.time.LocalDate;

public interface Registrador {
    void registrar(LocalDate fecha, int idConcurso, int idParticipante);
}

package ejercicio5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Registrador registrador = new RegistradorEnArchivo("/home/franco/registro_concurso.txt");
        Notificador notificador = new NotificadorEmail("fcabeza91@gmail.com");
        ProveedorDeFechas proveedorFechas = new ProveedorDeFechasReal();
        var concursoBase = new ConcursoBase(2, "otra rifa", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 9), registrador, proveedorFechas);
        var concursoQueNotifica = new InscribirYNotificar(concursoBase, notificador);
        var participante = new Participante(2, "matias", "matias@gmail.com");

        concursoQueNotifica.inscribirParticipante(participante);
    }
}

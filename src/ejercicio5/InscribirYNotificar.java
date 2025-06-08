package ejercicio5;

public class InscribirYNotificar implements Concurso {
    private Concurso concurso;
    private Notificador notificador;

    public InscribirYNotificar(Concurso concurso, Notificador notificador) {
        this.concurso = concurso;
        this.notificador = notificador;
    }

    @Override
    public void inscribirParticipante(Participante participante) {
        concurso.inscribirParticipante(participante);
        notificador.notificar(participante.obtenerCorreo());
    }
}

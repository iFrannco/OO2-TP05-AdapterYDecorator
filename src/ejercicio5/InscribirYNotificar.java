package ejercicio5;

public class InscribirYNotificar implements Concurso {
    private Concurso concurso;
    private Notificador notificador;

    public InscribirYNotificar(Concurso concurso) {
        this.concurso = concurso;
    }

    @Override
    public void inscribirParticipante(Participante participante) {
        concurso.inscribirParticipante(participante);
        notificador.notificar("Se registro la participacion de " + participante.obtenerNombre() + " en el concurso");
    }
}

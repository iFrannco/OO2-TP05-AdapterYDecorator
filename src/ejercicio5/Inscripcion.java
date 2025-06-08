package ejercicio5;

import java.time.LocalDate;

class Inscripcion {
    private Participante participante;
    private ConcursoBase concursoBase;
    private LocalDate fecha;

    public Inscripcion(Participante participante, ConcursoBase concursoBase, LocalDate fecha) {
        this.participante = participante;
        this.concursoBase = concursoBase;
        this.fecha = fecha;
    }

    public boolean perteneceA(Participante participante) {
        return this.participante.equals(participante);
    }
}

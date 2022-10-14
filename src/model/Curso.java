package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Disciplina> disciplinas = new ArrayList<>();
    private Coordenador cordenador;

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Coordenador getCordenador() {
        return cordenador;
    }

    public void setCordenador(Coordenador cordenador) {
        this.cordenador = cordenador;
    }
}

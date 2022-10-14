package model;

public class Coordenador  extends funcionario implements PessoaFisica,Diretoria {

    public Fila<Professor> getProfessorFila() {
        return professorFila;
    }

    public void setProfessorFila(Fila<Professor> professorFila) {
        this.professorFila = professorFila;
    }

    public Fila<Aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<Aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }

    Fila<Professor>professorFila = new Fila<>();
    Fila<Aluno>alunoFila = new Fila<>();


    
}

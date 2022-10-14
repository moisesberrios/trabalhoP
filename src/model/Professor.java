package model;

public class Professor   extends funcionario implements PessoaFisica{

private Fila<Aluno> alunoFila = new Fila();

    public Fila<Aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<Aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }
}

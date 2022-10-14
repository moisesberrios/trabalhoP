package model;

public class SecAcademica  extends funcionario implements PessoaFisica,Secretaria{


    private Fila<Aluno> alunoFila = new Fila();

    public Fila<Aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<Aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }
}

package model;

public class SecFinanceira  extends funcionario implements PessoaFisica,Secretaria {


    private Fila<PessoaFisica> pessoaFisicaFila = new Fila();

    public Fila<PessoaFisica> getPessoaFisicaFila() {
        return pessoaFisicaFila;
    }

    public void setPessoaFisicaFila(Fila<PessoaFisica> pessoaFisicaFila) {
        this.pessoaFisicaFila = pessoaFisicaFila;
    }
}

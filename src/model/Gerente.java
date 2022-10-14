package model;

public class Gerente implements PessoaFisica {

    private Fila<Pessoa> pessoaFila = new Fila();

     private String salario;

    public Fila<Pessoa> getPessoaFila() {
        return pessoaFila;
    }

    public void setPessoaFila(Fila<Pessoa> pessoaFila) {
        this.pessoaFila = pessoaFila;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}

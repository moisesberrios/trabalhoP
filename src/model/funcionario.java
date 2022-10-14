package model;

public abstract class funcionario extends Pessoa{

    private String Salario;

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }
}

package model;

public class Banco implements PessoaJuridica {

    public double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDepositos() {
        return depositos;
    }

    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public double depositos;
    public double divida;


    }



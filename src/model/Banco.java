package model;

public class Banco {

    public double valor;
    public double depositos;
    public double divida;

    public Banco( double valor, double depositos, Double divida){
    this.valor = valor;
    this.depositos = depositos;
    this.divida = divida;
    }

    public double montante(){
        return(valor - depositos)/ divida;

    }


}
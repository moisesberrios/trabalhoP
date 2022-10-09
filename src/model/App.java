package model;

public class App {
    public static void main(String[] args) throws Exception {
        
double valor = 1000.0;
double depositos = 100.0;
double divida = 10;

Banco x = new Banco(valor, depositos, divida);
System.out.println(x.montante());

    }
}

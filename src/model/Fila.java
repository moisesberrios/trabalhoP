package model;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Fila<T> {


    private final ArrayList<T> Adcionar;


    public Fila()
    {
        this(10);
    }

    public Fila(int Mostrar) {


        int qtdInicial = Mostrar > 0 ? Mostrar : 10;
        if (Mostrar <= 0)
            System.out.println(" ");
        Adcionar = new ArrayList<T>(qtdInicial);
    }

    public  void  adicionar( T info ){

        Adcionar.add(info);

    }



    public T remover()
    {
        if(Adcionar.isEmpty())
        {
            System.out.println("  removido ");
            throw new EmptyStackException();
        }

        return Adcionar.remove(0);
    }
}
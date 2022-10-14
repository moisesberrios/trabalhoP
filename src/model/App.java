package model;

import  java.util.Queue;

import java.nio.file.attribute.FileAttribute;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {



        Fila T  = new Fila<Pessoa>();


        T.adicionar(" pessoa1 ");
        T.adicionar(" pessoa2 ");
        T.adicionar(" pessoa3 ");
        T.adicionar(" pessoa4 ");
        T.adicionar(" pessoa5 ");



        System.out.println( T.remover());





    }
}
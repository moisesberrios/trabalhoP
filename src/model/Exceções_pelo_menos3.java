package model;

public class Exceções_pelo_menos3 {

    public static void main(String[] args) throws IllegalAccessException {

        int prova, trabalho, res;

        prova = 3;
        trabalho = 4;

        if (prova < 2) {

            //Exceção 1
            throw new IllegalAccessException(" o aluno novato não sabia o que tava fazendo ");
        }
        if (trabalho < 6) {
            //Exceção 2
            throw new IllegalAccessException(" culpa do Fernando ");
        }
        res = trabalho + prova;
        if (res > 7) {
            //Exceção 3
            throw new IllegalAccessException(" muito bem , muito bem ");


        }


    }
}
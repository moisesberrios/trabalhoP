package model;



public class Diretor  extends funcionario implements PessoaFisica , Diretoria{
    private Fila<Coordenador> coordenadorFila = new Fila();


    public Fila<Coordenador> getCoordenadorFila() {
        return coordenadorFila;
    }

    public void setCoordenadorFila(Fila<Coordenador> coordenadorFila) {
        this.coordenadorFila = coordenadorFila;
    }
}

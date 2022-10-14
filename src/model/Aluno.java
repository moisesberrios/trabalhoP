package model;

@PrimeiraAnotacao(
Eu = "moises" ,
Nota = 6 ,
curso = "espacial"

)

@SegundaAnotacao

public class Aluno implements PessoaFisica {

    private String mastrioula;
    private String curso;
    public String getMastrioula() {
        return mastrioula;
    }

    public void setMastrioula(String mastrioula) {
        this.mastrioula = mastrioula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

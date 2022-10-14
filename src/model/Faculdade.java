package model;

import java.util.ArrayList;
import java.util.List;

public class Faculdade  implements  PessoaJuridica {

    private Diretor diretor;

    private List<SecAcademica> secAcademicas= new ArrayList<>();

    private List<SecFinanceira> secFinanceiras = new ArrayList<>();

    private List<Coordenador> coordenadores = new ArrayList<>();

    public List<SecAcademica> getSecAcademicas() {
        return secAcademicas;
    }

    public void setSecAcademicas(List<SecAcademica> secAcademicas) {
        this.secAcademicas = secAcademicas;
    }

    public List<SecFinanceira> getSecFinanceiras() {
        return secFinanceiras;
    }

    public void setSecFinanceiras(List<SecFinanceira> secFinanceiras) {
        this.secFinanceiras = secFinanceiras;
    }

    private List<Curso> cursos =new ArrayList<>();

    public List<Curso> getCursos() {
        return cursos;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Coordenador> getCoordenadores() {
        return coordenadores;
    }

    public void setCoordenadores(List<Coordenador> coordenadores) {
        this.coordenadores = coordenadores;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}

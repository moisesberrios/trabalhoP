package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int limitMinA ;
    private int limitmaxA ;

    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}

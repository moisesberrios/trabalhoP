package model;
import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa{

   protected long id;

   private String  nome;
   private int cpf;
   private String sexo;

   protected List<Conta> contas = new ArrayList<>();

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getCpf() {
      return cpf;
   }

   public void setCpf(int cpf) {
      this.cpf = cpf;
   }

   public String getSexo() {
      return sexo;
   }

   public void setSexo(String sexo) {
      this.sexo = sexo;
   }

   public List<Conta> getContas() {
      return contas;
   }

   public void setContas(List<Conta> contas) {
      this.contas = contas;
   }
}
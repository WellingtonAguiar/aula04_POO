/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author ads2321036
 */
public class Aluno {
    private String nome;
    private String cpf;
    private int ra;
    private String data_nascimento;
    private String sexo;
    
  public Aluno (String nome, String cpf,
          int ra, String data_nascimento, String sexo){
            this.nome = nome;
            this.cpf = cpf;
            this.ra = ra;
            this.data_nascimento = data_nascimento;
            this.sexo = sexo;
  }
  public Aluno (){
  
  }
    
    public void setNome(String entrada){
        this.nome = entrada;
    }
    public void setRA(int entrada){
        this.ra = entrada;
    }
    public String getNome(){
        return this.nome;
    }
    public int getRa(){
        return this.ra;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

/**
 *
 * @author java
 */
public class Pessoa {
    
    String nome, cpf;
    int idade; 
    
    
    //criando construtor
    public Pessoa(String nome, String cpf, int idade){
     
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
        this.nome = nome;
        }
    }


    public void setCpf(String cpf) {
        if(!cpf.isEmpty()){
        this.cpf = cpf;
        }
    }

    public void setIdade(int idade) {
        if(idade >0){
        this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
    
    public void imprimir(){
        System.out.println("Pessoa: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("-----------x-----------");
        System.out.println("");
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo1;

/**
 *
 * @author java
 */

//se declarar uma metodo abstract a classe se tornará abstract tbm
public abstract class Abstrata {
    
    private String nome;
    private int idade;
    private double peso, altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public abstract double calculaImc(double peso, double altura);
    
    public abstract  boolean maiorIdade();
    
    public abstract  void imprimir();
    
    
}

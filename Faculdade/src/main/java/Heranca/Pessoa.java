/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Pessoa {

    private String indentidade;
    private String nome;

    //construtores
    public Pessoa() {
    }

    public Pessoa(String indentidade) {
        this.indentidade = indentidade;
    }

    public Pessoa(String indentidade, String nome) {
        this.indentidade = indentidade;
        this.nome = nome;
    }

    //getters e setters
    public String getIndentidade() {
        return indentidade;
    }

    public void setIndentidade(String indentidade) {
        if (!indentidade.isEmpty()) {
            this.indentidade = indentidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    //criar metodo para cadastrar
    public void cadastrar(String indentidade, String nome) {
        setIndentidade(indentidade);
        setNome(nome);
    }

    //criar metodo para receber valores
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da indentidade: ");
        setIndentidade(sc.nextLine());

        System.out.println("Digite o nome: ");
        setNome(sc.nextLine());

    }

    //criar me todo imprimir valores recebidos
    public void imprimir() {

        System.out.println("Número da indentidade: " + getIndentidade());
        System.out.println("Nome: " + getNome());
    }

}

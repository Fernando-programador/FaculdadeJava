/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asl.faculdade.classeConstrutor;

/**
 *
 * @author java
 */
public class Carro {
     String nome, modelo, cor;
    int ano;

    //metodo setter
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        }
    }

    public void setAno(int ano) {
        if (ano > 1900) {
            this.ano = ano;
        }
    }

    public void setCor(String cor) {
        if (!cor.isEmpty()) {
            this.cor = cor;
        }
    }

    //metodo getter
    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    //metodo imprimir formatado
    public void imprimir() {

        System.out.println("O carro que você comprou é o " + getNome());
        System.out.println("A marca do seu carro é " + getModelo());
        System.out.println("A cor do seu carro é " + getCor());
        System.out.println("O ano do seu carro é " + getAno());
    }
}

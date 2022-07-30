/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacao;

/**
 *
 * @author java
 */
public class DiscoRigido {

private String marca, modelo, tipo;
private double preco;
private int capacidade;

    public DiscoRigido(String marca, String modelo, String tipo, double preco, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.capacidade = capacidade;
    }

public DiscoRigido(){
    
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    
}

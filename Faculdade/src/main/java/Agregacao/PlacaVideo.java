/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacao;

/**
 *
 * @author java
 */
public class PlacaVideo {
    
    private String modelo, marca;
    private double preco;
    private int bits;

    public PlacaVideo(String modelo, String marca, double preco, int bits) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.bits = bits;
    }

    public PlacaVideo(){
        
    }
    //getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }
    
    
    
    
    
}

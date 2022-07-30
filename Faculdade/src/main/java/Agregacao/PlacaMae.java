/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacao;

import java.util.logging.Logger;

/**
 *
 * @author java
 */
public class PlacaMae {
    
    
   private String modelo, marca, processador;
   private double preco;

    PlacaMae() {
    }
    public PlacaMae(String modelo, String marca, String processador, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.processador = processador;
        this.preco = preco;
    }

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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   
           
    
}

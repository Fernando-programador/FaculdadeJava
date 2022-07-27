/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Carro {
    
    String fabricante, modelo, cor, placa;
    double valor;
    int nPortas, anoFab, anoMod;
    
    public Carro() {
        
    }
    
    public Carro(String fabricante, String modelo, String cor, String placa, double valor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
    }
    
    public Carro(String fabricante, String modelo, String cor, String placa, double valor, int nPortas,
            int anoFab, int anoMod){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
        this.nPortas = nPortas;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
    }    

    public void setFabricante(String fabricante) {
        if(!fabricante.isEmpty()){
        this.fabricante = fabricante;
    }
    }

    public void setModelo(String modelo) {
      if(!modelo.isEmpty()){
        this.modelo = modelo;
    }
    }
    public void setCor(String cor) {
      if(!cor.isEmpty()){
        this.cor = cor;
    }
    }
    public void setPlaca(String placa) {
      if(!placa.isEmpty()){
        this.placa = placa;
    }
    }
    public void setValor(double valor) {
      if(valor > 0){
        this.valor = valor;
    }
    }
    public void setnPortas(int nPortas) {
      if(nPortas > 0){
        this.nPortas = nPortas;
    }
    }
    public void setAnoFab(int anoFab) {
      if(anoFab > 1900){
        this.anoFab = anoFab;
    }
    }
    public void setAnoMod(int anoMod) {
      if(anoMod > 1900){
        this.anoMod = anoMod;
    }
    }
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValor() {
        return valor;
    }

    public int getnPortas() {
        return nPortas;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public int getAnoMod() {
        return anoMod;
    }
   
public void imprimir(){
    System.out.println("Fabricante: " + getFabricante());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Cor: " + getCor());
    System.out.println("Placa do veículo : " + getPlaca());
    System.out.println("Valor do veículo: " + getValor());
    System.out.println("Número de portas: " + getnPortas());
    System.out.println("Ano de Fabricação: " + getAnoFab());
    System.out.println("Ano de Modelo: " + getAnoMod());
    
}

// entrada de dados

    public void inDados(){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite o fabricante do veículo: ");
            setFabricante(sc.nextLine());
            
            System.out.println("Digite o modelo do veículo: ");
            setModelo(sc.nextLine());
            
            System.out.println("Digite a cor  do veículo: ");
            setCor(sc.nextLine());
            
            System.out.println("Digite a placa do veículo: ");
            setPlaca(sc.nextLine());
            
            System.out.println("Digite o valor do veículo: ");
            setValor(Double.parseDouble(sc.nextLine()));
            
            System.out.println("Digite  a quantidade de portas do veículo: ");
            setnPortas(Integer.parseInt(sc.nextLine()));
            
            System.out.println("Digite o ano de fabricação do veículo: ");
            setAnoFab(Integer.parseInt(sc.nextLine()));
            
            System.out.println("Digite o ano de modelo do veículo: ");
            setAnoMod(Integer.parseInt(sc.nextLine()));
            
           
    }


    
    
    
    
}

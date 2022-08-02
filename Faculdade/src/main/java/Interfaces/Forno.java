/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Forno implements Controle{
    
    private String marca, modelo;
    private int volume, potencia;

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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Forno() {
         }
    public Forno(String marca) {
        this.marca = marca;
    
    }
    
    public Forno(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
      
    }

    public Forno(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
    }

    public Forno(int volume) {
  
        this.volume = volume;
  
    }

    public Forno(int volume, int potencia) {

        this.volume = volume;
        this.potencia = potencia;
    }


    public Forno(String marca, String modelo, int volume, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.potencia = potencia;
    }
    
        public void cadastrar (String marca, String modelo, int volume, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.potencia = potencia;
    }
        
        public void imprimir(){
            System.out.println("Marca: " + getMarca());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Volume: " + getVolume());
            System.out.println("Potencia: " + getPotencia());
        }
    
        
        public void entrada( ){
            Scanner sc = new Scanner(System.in );
            
            System.out.println("Digite a marca: ");
            setMarca(sc.nextLine());
            System.out.println("Digite o modelo: ");
            setModelo(sc.nextLine());
            System.out.println("Digite o volume: ");
            setVolume(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite a potencia: ");
            setPotencia(Integer.parseInt(sc.nextLine()));
        }


    @Override
    public int getPotenciaMaxima() {
       return POTENCIAMAXIMA;
    }

    @Override
    public int getPotenciaMinima() {
      return POTENCIAMINIMA;
    }
    

    @Override
    public void assar(int potencia) {
        setPotencia(potencia);
    System.out.println("Forno assando com potencia: " + getPotencia());
    }

    @Override
    public void aquecer(int potencia) {
        setPotencia(potencia);
    System.out.println("Forno aquecendo com potencia: " + getPotencia());
    
    }

    @Override
    public void desligar() {
        System.out.println("Desligar Forno");
    
    }

        
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo2;

import java.util.Scanner;

/**
 *
 * @author java
 */
public abstract class AssaAquece {

    private String Marca;
    private String Modelo;
    private int volume;
    private int potencia;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
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

    public AssaAquece() {

    }
    

    public AssaAquece(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
       
    }

    public AssaAquece(int volume, int potencia) {
        this.volume = volume;
        this.potencia = potencia;
    }

    public AssaAquece(String Marca, String Modelo, int volume, int potencia) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.volume = volume;
        this.potencia = potencia;
    }

    
    public void cadastrar(String Marca, String Modelo, int volume, int potencia) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.volume = volume;
        this.potencia = potencia; 
    }
    
    public void imprimir() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Volume: " + getVolume());
        System.out.println("Potência: " + getPotencia());
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite o modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Digite o volume: ");
        setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a potência: ");
        setPotencia(Integer.parseInt(sc.nextLine()));

    }

    public abstract void assar(int potencia);

    public abstract void aquecer(int potencia);

    public abstract void desligar();

}

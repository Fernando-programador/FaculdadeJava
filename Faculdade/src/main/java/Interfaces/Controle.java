/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author java
 */
public interface Controle {
    /*
    1- todos atributos definidos na interface são static e final
    2- somente metodos getters com atributos nainterface ão final
    não poderão ser alterados, isto é, não possui setters 
    3- todos métodos na interface soa implicitamente public e abstract
    4 - para implementar um classe a uma interface se usa a palavra implements
    5 -  uma clasee pode implemantar quantas interfaces quiser
    */
    
    int POTENCIAMAXIMA = 350;
    int POTENCIAMINIMA = 120;
    
    public int getPotenciaMaxima();
    public int getPotenciaMinima();
    
    void assar(int potencia);
    void aquecer(int potencia);
    void desligar();
    
    
    
}

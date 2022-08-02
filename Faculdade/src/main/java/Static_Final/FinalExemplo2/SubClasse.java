/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Final.FinalExemplo2;

/**
 *
 * @author java
 */


public class SubClasse extends SuperClasse{
    
    
    //não pode ser constante
   // public final double ValorQuadrado(){
    public double ValorQuadrado(){
        return Math.pow(valor, 2);
    }
    
    //não pode ser constante
   // public final int ValorDobro(){
    public int ValorDobro(){
        return valor * 2;
    }
    
}

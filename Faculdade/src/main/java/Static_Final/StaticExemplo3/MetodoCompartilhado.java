/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Final.StaticExemplo3;

/**
 *
 * @author java
 */
public class MetodoCompartilhado {
    private static int valor = 5;
    
    public static double valorQuadrado(){
        return Math.pow(valor, 2);
        
    }
    public static int valorDobro(){
        return valor * 2;
    }
    
}

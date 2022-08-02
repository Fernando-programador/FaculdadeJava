/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Final.StaticExemplo3;

/**
 *
 * @author java
 */
public class appMetodo {
    public static void main(String[] args) {
    System.out.println(" System.out.println é um método estático Compartilhado");
    System.out.println("Uso do método Math.pow para contas de potencialização" + Math.pow(2,3));
    System.out.println("Também utilizamos  em nossas conversões");
    
    String valor = "1000";
    
    System.out.println("Double.parseDouble(valor): " + Double.parseDouble(valor));
    System.out.println("Integer.parseInteger(valor)" + Integer.parseInt(valor));
    
    
    /*
    agora vamos usar dois metodos da classe MetodoCompatilhado
    sem criação  de objetos
    */
    
    System.out.println("Dobro do valor: " + MetodoCompartilhado.valorDobro());
    
    System.out.println("Quadrado do valor: " +MetodoCompartilhado.valorQuadrado());
    
}
    
}

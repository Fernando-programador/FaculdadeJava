/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

/**
 *
 * @author java
 */
public class appPessoa {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();

                
        Pessoa p1 = new Pessoa("Fernando", "31512832847", 38);
        
        Pessoa p3 = new Pessoa("fer", "56416168", 38);
        
        
        System.out.println(p1.nome);
        p1.imprimir();
        p3.imprimir();
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

/**
 *
 * @author java
 */
public class appCarro {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.inDados();
        c1.imprimir();
        System.out.println("------------x-------------");
        System.out.println("");
        
        Carro c2 = new Carro();
        c2.inDados();
        c2.imprimir();
        System.out.println("------------x-------------");
        System.out.println("");
        
        Carro c3 = new Carro();
        c3.inDados();
        c3.imprimir();
        System.out.println("------------x-------------");
        System.out.println("");
     
       
        Carro c4 = new Carro("WV", "Polo", "Dourado", "bug0022", 32000 );
        c4.imprimir();
        System.out.println("------------x-------------");
        System.out.println("");
        
        Carro c5 = new Carro("WV", "Polo", "Dourado", "bug0022", 32000, 5, 2011, 2011 );
        c5.imprimir();
        System.out.println("------------x-------------");
        System.out.println("");     
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacao;

/**
 *
 * @author java
 */
public class appAgragacao {
    
    public static void main(String[] args) {
    
        Desktop desk = new Desktop();
        
        desk.slot0.setMarca("kingstom");
        desk.slot0.setModelo("kingstom");
        desk.slot0.setCapacidade(250);
        desk.slot0.setPreco(300.50);
        desk.slot0.setTipo("ddr4");
        
        

        
        
        System.out.println("marca: " + desk.slot0.getMarca());
        System.out.println("modelo: "  + desk.slot0.getModelo());
        System.out.println("capacidade: " +  desk.slot0.getCapacidade());
        System.out.println("preço: " + desk.slot0.getPreco());
        System.out.println("tipo: " +   desk.slot0.getTipo() );
        
        
}
    
}

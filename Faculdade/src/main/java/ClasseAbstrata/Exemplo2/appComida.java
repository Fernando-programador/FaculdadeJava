/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo2;

/**
 *
 * @author java
 */
public class appComida {
    public static void main(String[] args) {
    
        
    Forno f1 = new Forno("Panasonic", "Elegance", 60, 120); 
    Microondas m1 = new Microondas("Brastemp", "Futuro", 28, 250); 
    
    f1.assar(200);
    f1.desligar();
    m1.aquecer(150);
    m1.desligar();
    System.out.println("");
            
    AssaAquece a1 = new Forno("LG", "Total", 55, 200);
    a1.aquecer(300);
    a1.desligar();
    System.out.println("");
    
    AssaAquece a2 = new Microondas("Pan", "Elegante", 35, 180);
    a2.aquecer(150);
    a2.desligar();
    System.out.println("");
    
    
            
            
            
            
            
            }
    
}

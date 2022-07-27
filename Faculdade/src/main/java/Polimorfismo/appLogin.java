/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author java
 */
public class appLogin {
    public static void main(String[] args) {
        
        Login lg1 = new Login("asl", "123");
        System.out.println("O seu nome é: " + lg1.getNome());
        System.out.println("O seu nível de acesso é:" + lg1.getNivelAcesso());
        
        Login lg2 = new Login("sem acesso", "0000");
        System.out.println("O seu nome é: " + lg2.getNome());
        System.out.println("O seu nivel de acesso é: " + lg2.getNivelAcesso());
          
         Login lg3 = new Login("fer", "123", 2000);
        System.out.println("O seu nome é: " + lg3.getNome());
        System.out.println("O seu nivel de acesso é: " + lg3.getNivelAcesso());
                
        
    }
             
           
            
}

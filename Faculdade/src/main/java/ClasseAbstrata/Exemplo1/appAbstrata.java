/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo1;

import ClasseAbstrata.Exemplo1.SubAbstrata;

/**
 *
 * @author java
 */
public class appAbstrata {
    public static void main(String[] args) {
    
        SubAbstrata s1 = new SubAbstrata();
        s1.setNome("Fernando");
        s1.setIdade(38);
        s1.setPeso(126);
        s1.setAltura(1.86);
        
        
        if (s1.maiorIdade()){
            System.out.println("Sim, Maior de idade.");
        } else{
            System.out.println("Não, menor de idade.");
        }
        
        System.out.println("IMC = " + s1.calculaImc(126, 1.86));
        
        s1.imprimir();
        
        
        
}
}

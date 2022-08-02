/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo1;

import ClasseAbstrata.Exemplo1.Abstrata;

/**
 *
 * @author java
 */
public class SubAbstrata extends Abstrata{

  
    
    public double calculaImc(double peso, double altura) {
      double imc = peso / Math.pow(altura, 2);
      return imc;
    }

    

    public boolean maiorIdade() {
    if (this.getIdade()>= 18) {
        return true;
    }   else {
        return false;
    
    }
    }

    public void imprimir() {
        System.out.println("Nome: "  + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Altura: " + super.getAltura());
       
    }
    
}

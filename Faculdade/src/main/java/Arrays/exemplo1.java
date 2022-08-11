/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;


import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author java
 */
public class exemplo1 {
    
    public static void main(String[] args) {
    
        ArrayList array = new ArrayList();
        array.add(38); //interiro
        array.add(new Carro()); //objeto
        array.add(0, 0.354); //posição no vetor 0(zero) e do tipo double
        array.add(2, "Fernando"); //posição no vetor (2) do tipo String
        array.add(array.contains("Fernando"));
        array.add(array.lastIndexOf(array));
        array.add(new Pessoa()); // objeto
        array.add(array.set(2, "FerCorrea"));
        array.add( array.remove(2));
        array.add(array.size());
        
        
        System.out.println("a lista possui: " + array.size() + "elementos.");
        
        for(int i = 0; i < array.size(); i++){
            System.out.println("Elemento na posição [" + i + "] = " + array.get(i));        }
                
}

    private static class Pessoa {

        public Pessoa() {
        }
    }

    private static class Carro {

        public Carro() {
        }
    }


    
}

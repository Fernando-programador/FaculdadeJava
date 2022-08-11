/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.classIterator;

import Arrays.classIterator.Monitor;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class vetorClasse {

    public static void main(String[] args) {

// TODO code application logic here
        Scanner ent = new Scanner(System.in);

// determinação da quantidade de elementos
        System.out.println("Quantos monitores serão inseridos?");

        int qtd = Integer.parseInt(ent.nextLine());

        Monitor m1[] = new Monitor[qtd];// declaração

        for (int i = 0; i < qtd; i++){
         m1[i] = new Monitor();// Instanciação de cada objeto

        m1[i].entradaDados();

    }
   

        for (int i = 0; i < m1.length; i++) {
            System.out.println("---------x----------");
            m1[i].imprimir();
            System.out.println("---------x----------");
        }

}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class appIterator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String antigo, novo;
        int i, indice;

        ArrayList<String> array = new ArrayList<String>();

        for (i = 0; i < 5; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º integrante");
            array.add(sc.nextLine());
        }

        System.out.println("Número de elementos no grupo é = : " + array.size());

        System.out.println("Sustituição de um elemento por outro. ");
        System.out.println("Digite o nome do componente a ser substituido: ");
        antigo = sc.nextLine();

        indice = array.indexOf(antigo);

        System.out.println("O componente " + array.get(indice) + " será substituido.");

        System.out.println("Digite o nome do novo componente: ");
        novo = sc.nextLine();

        array.set(indice, novo);

        System.out.println("retirada de um elemento do grupo: ");

       Iterator<String> iterator = array.iterator();
     //   appIterator<String> iterator = array.iterator();
      

        i = 0;

        while (iterator.hasNext()) {
            System.out.println("Posição " + i + " tem o componente: " + iterator.next());
            i++;

        }

        System.out.println("Limpando o ArrayList: ");

        array.clear();

        System.out.println("Número de elementos do grupos é: " + array.size());

    }

}

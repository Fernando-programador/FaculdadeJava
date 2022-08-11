/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.classIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class appListaObjetos {

    public static void main(String[] args) {

// TODO code application logic here
        boolean continua = true;

        Scanner sc = new Scanner(System.in);

        ArrayList<Monitor> lm = new ArrayList<Monitor>();

        do {

            System.out.println("Inserir Monitor [1-Sim, 2-Não]?");

            if (Integer.parseInt(sc.nextLine()) == 1) {

// Inserir um objeto monitor
// objeto auxiliar para entrada de dados e inserção a lista
                Monitor aux = new Monitor();

                aux.entradaDados(); // entrada de dados do objeto

                lm.add(aux); // inserção a lista

            } else {

// Não inserir um objeto monitor
// encerrar a entrada de dados
                continua = false;

            }

        } while (continua);

// criação do objeto iterator para o acesso sequencial e criação do relatório
        Iterator<Monitor> iterator = lm.iterator();

// criação do cabeçalho do relatório
        System.out.println("");

        System.out.println(": Resolução : Preço : Potência :");

// contador de elementos
        int cont = 0;

// enquanto houver elementos no iterator, caso contrário sairá do laço
        while (iterator.hasNext()) {

// objeto auxiliar para entrada de dados e inserção a lista
            Monitor aux = new Monitor();

// busca o próximo elemento no iterator e transfere os dados para o
// objeto auxiliar
            
            aux = (Monitor)iterator.next();

            System.out.printf("%-15s : %8.2f : %8.2f",
                    aux.getResolucao().substring(0, 10),
                    aux.getPreco(),
                    aux.getPotencia());
                                

          
            cont++;

        }

// criação do rodapé do relatório
        System.out.println("");

        System.out.println("Quantidade de Monitores: " + cont);

    }

}


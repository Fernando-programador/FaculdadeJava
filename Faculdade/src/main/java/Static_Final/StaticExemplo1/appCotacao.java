/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Final.StaticExemplo1;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class appCotacao {

    public static void main(String[] args) {
        double valorReal;

        Scanner sc = new Scanner(System.in);
        Cotacao c1 = new Cotacao();
        c1.entrada();
        System.out.println("Quantos reais para a conversão?");
        valorReal = Double.parseDouble(sc.nextLine());
        System.out.println("");

//conversão com objeto c1 de R$1000,00 com dolar valendo R$3,82
        c1.imprimir();
        System.out.printf("Conversão de Real para dolar : USS %.2f", c1.converterRealDolar(valorReal));
        System.out.println("");

//conversão utilizando os objetos c1 e c2 como mesmo valor de R$1000,00
        Cotacao c2 = new Cotacao(4.15);
        c1.imprimir();
        System.out.printf("Conversão de Real para dolar : USS %.2f", c1.converterRealDolar(valorReal));
        System.out.println("");

        c2.imprimir();
        System.out.printf("Conversão de Real para dolar : USS %.2f", c2.converterRealDolar(valorReal));
        System.out.println("");

    }

}

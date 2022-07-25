/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asl.faculdade.classeConstrutor;

/**
 *
 * @author java
 */
public class AppCarro {
     public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.setNome("Gol");
        c1.setModelo("VolksWagem");
        c1.setCor("prata");
        c1.setAno(2006);

        c2.setNome("Cruise");
        c2.setModelo("Chevrolet");
        c2.setCor("preta");
        c2.setAno(2017);

        c3.setNome("Toro");
        c3.setModelo("Fiat");
        c3.setCor("branca");
        c3.setAno(2022);

        c1.imprimir();
        System.out.println("");
        c2.imprimir();
        System.out.println("");
        c3.imprimir();
        System.out.println("");

    }

}

package Arrays;


import construtores.Carro;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author java
 */
public class tiposArrays {

    public static void main(String[] args) {

        byte binarios[] = new byte[3];

        short valor[] = new short[3];

        long valor2[] = new long[3];

        float nota[] = new float[3];
       // double nota1[] = new double[5];

        char caractere[] = new char[3];

        boolean logico[] = new boolean[2];

        String nomes[] = new String[3];

   
        valor[0] = 10;
        valor[1] = 15;
        valor[2] = 18;

            System.out.println("short declarado");
        for (int i = 0; i < valor.length; i++) {
            System.out.println("valor: [" + i + "] = " + valor[i]);
        }
            System.out.println("----------x----------");

        double nota1[] = {1.2, 2.5, 3.5, 7.1, 5.7};
        
                    System.out.println("double declarado");
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("nota1: [" + i + "] = " + nota1[i]);
        }
            System.out.println("----------x----------");
            
        int valor1[] = {5, 6, 7, 8, 9, 12, 45};

            System.out.println("int declarado");
        for (int i = 0; i < valor1.length; i++) {
            System.out.println("valor1: [" + i + "] = " + valor1[i]);
        }
            System.out.println("----------x----------");

    }

   
}

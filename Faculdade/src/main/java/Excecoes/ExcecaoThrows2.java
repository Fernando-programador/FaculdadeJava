/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecoes;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class ExcecaoThrows2 {
    
      public void metodoExececao() throws ArithmeticException, NumberFormatException, IllegalArgumentException {

        Scanner sc = new Scanner(System.in);

        int num, deno, res;

        System.out.println("Digite o numerador para a divisão: ");
        num = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o denominador para a divisão: ");
        deno = Integer.parseInt(sc.nextLine());
        
        if (deno == 0){
            throw new IllegalArgumentException("Denominador = 0!");
        }
        res = num / deno;

        System.out.println("O resultado da divisão é " + res);

    }
    
}

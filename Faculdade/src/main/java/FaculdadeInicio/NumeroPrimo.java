/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaculdadeInicio;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        int y;

        System.out.println("Digite um número:");
        x = Double.parseDouble(sc.nextLine());

        y = 0;
        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {
                y++;
            }
        }

        if (y == 2) {
            System.out.println("Este  número é primo");
        } else {
            System.out.println("Este número não é primo");
        }

        sc.close();

    }

}

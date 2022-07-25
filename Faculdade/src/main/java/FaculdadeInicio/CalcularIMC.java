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
public class CalcularIMC {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, alt, res;

        System.out.println("CALCULAR O ICM");
        System.out.println("Digite o seu peso:");
        peso = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite a sua altura:");
        alt = Double.parseDouble(entrada.nextLine());

        res = peso / (alt * alt);
        System.out.println("Seu IMC é " + res);
        entrada.close();

        if (res < 18.5){
            System.out.println("A baixo do peso");
        }
        else if (res < 25){
            System.out.println("Peso normal");
        }
        else if (res < 30){
            System.out.println("Sobrepeso");
        }
        else if (res < 35){
            System.out.println("Obesidade Grau 1");
        }
        else if (res< 40){
            System.out.println("Obesisdade Grau 2");
        }
        else
            System.out.println("Obesidade Grau 3");

    }
    
}

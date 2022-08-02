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
public class Cotacao {

    private static double valorDolar;

    public static double getValorDolar() {
        return valorDolar;
    }

    public static void setValorDolar(double valorDolar) {
        if (valorDolar > 0) {
            Cotacao.valorDolar = valorDolar;
        }

    }

    public Cotacao() {
    }

    public Cotacao(double valorDolar) {
        setValorDolar(valorDolar);
    }

    public void cadastrar(double valorDolar) {
        setValorDolar(valorDolar);
    }

    public void imprimir() {
        System.out.println("Valor do dolar: " + getValorDolar());
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do dolar? ");
        setValorDolar(Double.parseDouble(sc.nextLine()));

    }

    public double converterRealDolar(double real) {
        return real / getValorDolar();
    }

}

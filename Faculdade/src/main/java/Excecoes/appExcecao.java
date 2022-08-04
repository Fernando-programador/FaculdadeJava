/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecoes;

/**
 *
 * @author java
 */
public class appExcecao {

    public static void main(String[] args) {

        ExcecaoThrows et = new ExcecaoThrows();

        try {
            et.metodoExececao();
        } catch (ArithmeticException e) {

            System.out.println("Exceção gerada" + e.getMessage());
            System.out.println("Foi gerada uma exceção aritimética, divisão por zero");
            System.out.println("O denominador não pode ser 0 (zero). ");

        } catch (NumberFormatException e) {

            System.out.println("Exceção gerada" + e.getMessage());
            System.out.println("Foi gerada uma exceção  de conersão de dados.");
            System.out.println("Os valores devem ser números inteiros ");

        } catch (Exception e) {

            System.out.println("Outras exceções pode ser tratadas aqui. ");

        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author java
 */
public class appPessoa {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        System.out.println("Dados do Cliente:");
        c1.entradaDados();

        Funcionario f1 = new Funcionario();
        System.out.println("Dados do funcionário:");
        f1.entradaDados();

        Gerente g1 = new Gerente();
        System.out.println("Dados do Gerente");
        g1.entradaDados();

        c1.imprimir();
        f1.imprimir();
        g1.imprimir();
    }
}

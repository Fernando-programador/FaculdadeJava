/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Gerente extends PessoaEmpresa {

    private double percentualVenda;
    private int nivelGerente;

    //construtores
    public Gerente() {

    }

    public Gerente(double percentualVenda, int NivelGerente) {
        this.percentualVenda = percentualVenda;
        this.nivelGerente = NivelGerente;
    }

    public Gerente(double percentualVenda, int NivelGerente, String matricula, double salario) {
        super(matricula, salario);
        this.percentualVenda = percentualVenda;
        this.nivelGerente = NivelGerente;
    }

    public Gerente(double percentualVenda, int NivelGerente, String matricula, double salario, String indentidade) {
        super(matricula, salario, indentidade);
        this.percentualVenda = percentualVenda;
        this.nivelGerente = NivelGerente;
    }

    public Gerente(double percentualVenda, int NivelGerente, String matricula, double salario, String indentidade, String nome) {
        super(matricula, salario, indentidade, nome);
        this.percentualVenda = percentualVenda;
        this.nivelGerente = NivelGerente;
    }

    //getters e setters   
    public double getPercentualVenda() {
        return percentualVenda;
    }

    public void setPercentualVenda(double percentualVenda) {
        if (percentualVenda > 0) {
            this.percentualVenda = percentualVenda;
        }
    }

    public int getNivelGerente() {
        return nivelGerente;
    }

    public void setNivelGerente(int NivelGerente) {
        if (nivelGerente >= 0) {
            this.nivelGerente = NivelGerente;
        }
    }

    //metodo cadastrar
    public void cadastrar(String indentidade, String nome, String matricula, double salario, double percentualVenda, int nivelGerente) {
        super.cadastrar(indentidade, nome, matricula, salario);
        setPercentualVenda(percentualVenda);
        setNivelGerente(nivelGerente);
    }
    //metodo entrada de dados

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        //  System.out.println("Dados do Gerente.");
        System.out.println("Digite o valor da porcentagem do gerente: ");
        setPercentualVenda(Double.parseDouble(sc.nextLine()));

        System.out.println("Nivel do gerência: (0-10)");
        setNivelGerente(Integer.parseInt(sc.nextLine()));

    }

    //metodo imprimir  
    public void imprimir() {
        System.out.println("Dados do Gerente");
        super.imprimir();
        System.out.println("Porcentagem de venda do gerente: " + getPercentualVenda() + "%");
        System.out.println("Nome do gerente do setor: " + getNivelGerente());
        System.out.println("-----------x------------");
        System.out.println("");

    }
}

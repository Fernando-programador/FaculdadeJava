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
public class Funcionario extends PessoaEmpresa {

    private String setor;
    private String nomeGerente;

    //construtores
    public Funcionario() {

    }

    public Funcionario(String setor, String nomeGerente) {
        this.setor = setor;
        this.nomeGerente = nomeGerente;
    }

    public Funcionario(String setor, String nomeGerente, String matricula, double salario) {
        super(matricula, salario);
        this.setor = setor;
        this.nomeGerente = nomeGerente;
    }

    public Funcionario(String setor, String nomeGerente, String matricula, double salario, String indentidade) {
        super(matricula, salario, indentidade);
        this.setor = setor;
        this.nomeGerente = nomeGerente;
    }

    public Funcionario(String setor, String nomeGerente, String matricula, double salario, String indentidade, String nome) {
        super(matricula, salario, indentidade, nome);
        this.setor = setor;
        this.nomeGerente = nomeGerente;
    }

    //getters setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (!setor.isEmpty()) {
            this.setor = setor;
        }
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        if (!nomeGerente.isEmpty()) {
            this.nomeGerente = nomeGerente;
        }
    }

    //metodo cadastrar
    public void cadastrar(String indentidade, String nome, String matricula, double salario, String setor, String nomeGerente) {
        super.cadastrar(indentidade, nome, matricula, salario);
        setSetor(setor);
        setNomeGerente(nomeGerente);
    }

    //metodo entrada de dados
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o nome do setor do funcionário: ");
        setSetor(sc.nextLine());

        System.out.println("Digite o nome do Gerente : ");
        setNomeGerente(sc.nextLine());

    }

    //metodo imprimir
    public void imprimir() {
        System.out.println("Dados do funcionário");
        super.imprimir();
        System.out.println("Nome do setor: " + getSetor());
        System.out.println("Nome do gerente do setor: " + getNomeGerente());
        System.out.println("-----------x------------");
        System.out.println("");

    }

}

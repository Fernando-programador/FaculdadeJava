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
public class PessoaEmpresa extends Pessoa {

    private String matricula;
    private double salario;

    //construtores
    public PessoaEmpresa() {

    }

    public PessoaEmpresa(String matricula, double salario) {
        this.matricula = matricula;
        this.salario = salario;
    }

    public PessoaEmpresa(String matricula, double salario, String indentidade) {
        super(indentidade);
        this.matricula = matricula;
        this.salario = salario;
    }

    public PessoaEmpresa(String matricula, double salario, String indentidade, String nome) {
        super(indentidade, nome);
        this.matricula = matricula;
        this.salario = salario;
    }

    // getter e setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (!matricula.isEmpty()) {
            this.matricula = matricula;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    //cadastrar
    public void cadastrar(String indentidade, String nome, String matricula, double salario) {
        super.cadastrar(indentidade, nome);
        setMatricula(matricula);
        setSalario(salario);
    }
    //metodo entrada de dados

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o número da Matrícula: ");
        setMatricula(sc.nextLine());

        System.out.println("Digite o salario : R$ ");
        setSalario(Double.parseDouble(sc.nextLine()));
        
    }
    //metodo imprimir

    public void imprimir() {
        super.imprimir();
        System.out.println("Número da Matrícula: " + getMatricula());
        System.out.println("Salário é: R$ " + getSalario());

    }
}

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
public class Cliente extends Pessoa {

    private int idade;
    private String telefone;
    private String codigoCliente;

    //construtores
    public Cliente() {

    }

    public Cliente(int idade, String telefone, String codigoCliente) {
        this.idade = idade;
        this.telefone = telefone;
        this.codigoCliente = codigoCliente;
    }

    public Cliente(int idade, String telefone, String codigoCliente, String indentidade) {
        super(indentidade);
        this.idade = idade;
        this.telefone = telefone;
        this.codigoCliente = codigoCliente;
    }

    public Cliente(int idade, String telefone, String codigoCliente, String indentidade, String nome) {
        super(indentidade, nome);
        this.idade = idade;
        this.telefone = telefone;
        this.codigoCliente = codigoCliente;
    }

    //getters e setter    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!telefone.isEmpty()) {
            this.telefone = telefone;
        }
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        if (!codigoCliente.isEmpty()) {
            this.codigoCliente = codigoCliente;
        }
    }

    //metodo cadastrar
    public void cadastrar(String indentidade, String nome, String telefone, int idade, String codigoCliente) {
        super.cadastrar(indentidade, nome);
        setTelefone(telefone);
        setIdade(idade);
        setCodigoCliente(codigoCliente);
    }
    //metodo entrada de dados

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        super.entradaDados();
        System.out.println("Digite a idade do cliente: ");
        setIdade(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o número do Telefone do cliente: ");
        setTelefone(sc.nextLine());

        System.out.println("Digite o codigo do cliente: ");
        setCodigoCliente(sc.nextLine());

    }

    //metodo imprimir
    public void imprimir() {
        System.out.println("Dados do cliente");
        super.imprimir();
        System.out.println("Idade do cliente: " + getIdade());
        System.out.println("Número telefônico do cliente: " + getTelefone());
        System.out.println("Código do cliente: " + getCodigoCliente());
        System.out.println("-----------x------------");
        System.out.println("");

    }

}

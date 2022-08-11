/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.classIterator;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Monitor {

    private String resolucao;

    private double preco, potencia;

    private int tamanhoTela, tensao;

    public String getResolucao() {

        return resolucao;

    }

    public void setResolucao(String resolucao) {

        if (!resolucao.isEmpty()) {

// são inseridos 15 espaços ao final para garantir que
// tenha no mínimo 15 caracteres para o relatório
            this.resolucao = resolucao + " ";

        }

    }

    public double getPreco() {

        return preco;

    }

    public void setPreco(double preco) {

        if (preco >= 0) {

            this.preco = preco;

        }

    }

    public double getPotencia() {

        return potencia;

    }

    public void setPotencia(double potencia) {

        if (potencia >= 0) {

            this.potencia = potencia;

        }

    }

    public int getTamanhoTela() {

        return tamanhoTela;

    }

    public void setTamanhoTela(int tamanhoTela) {

        if (tamanhoTela >= 0) {

            this.tamanhoTela = tamanhoTela;

        }

    }

    public int getTensao() {

        return tensao;

    }

    public void setTensao(int tensao) {

        if (tensao >= 0) {

            this.tensao = tensao;

        }

    }

    public Monitor() {
    }

    public Monitor(String resolucao, double preco, double potencia, int tamanhoTela, int tensao) {
        this.resolucao = resolucao;
        this.preco = preco;
        this.potencia = potencia;
        this.tamanhoTela = tamanhoTela;
        this.tensao = tensao;
    }



    public void cadastrar(String resolucao, double preco, double potencia,
            int tamanhoTela, int tensao) {

        setResolucao(resolucao);

        setPreco(preco);

        setPotencia(potencia);

        setTamanhoTela(tamanhoTela);

        setTensao(tensao);

    }

    public void imprimir() {

        System.out.println("Resolução : " + resolucao);

        System.out.println("Preço : " + preco);

        System.out.println("Potência : " + potencia);

        System.out.println("Tamanho : " + tamanhoTela);

        System.out.println("Tensão : " + tensao);

    }

    public void entradaDados() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Resolução : ");

        setResolucao(sc.nextLine());

        System.out.println("Preço : ");

        setPreco(Double.parseDouble(sc.nextLine()));

        System.out.println("Potência : ");

        potencia = Double.parseDouble(sc.nextLine());

        System.out.println("Tamanho : ");

        setTamanhoTela(Integer.parseInt(sc.nextLine()));

        System.out.println("Tensão : ");

        setTensao(Integer.parseInt(sc.nextLine()));

    }

}

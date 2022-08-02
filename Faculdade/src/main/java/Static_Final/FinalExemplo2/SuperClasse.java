/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Final.FinalExemplo2;

/**
 *
 * @author java
 */

//não pode ter extend quando a classe for constante
//public final class SuperClasse {
public  class SuperClasse {

    protected static int valor = 5;

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        SuperClasse.valor = valor;
    }

    public  double ValorQuadrado() {
        return Math.pow(valor, 2);
    }

    public int ValorDobro() {
        return valor * 2;
    }

}

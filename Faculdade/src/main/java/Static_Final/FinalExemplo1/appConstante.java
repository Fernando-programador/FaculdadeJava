/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Final.FinalExemplo1;

/**
 *
 * @author java
 */
public class appConstante {

    public static void main(String[] args) {

        Constante c1 = new Constante();

        System.out.println("Valor c1 = " + c1.getVALOR());

        //Não é possivel alterar o valor pois é uma constante
        //c1.VALOR = 10;
        System.out.println("Valor c1 = " + c1.getVALOR());

    }

}

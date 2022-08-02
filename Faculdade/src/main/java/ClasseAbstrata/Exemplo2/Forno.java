/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo2;

import java.util.logging.Logger;

/**
 *
 * @author java
 */
public class Forno extends AssaAquece {

    public Forno() {
        super();
    }

    public Forno(String marca, String modelo) {
        super(marca, modelo);
    }

    public Forno(int volume, int potencia) {
        super(volume, potencia);
    }

    public Forno(String marca, String modelo, int volume, int potencia) {
        super(marca, modelo, volume, potencia);
    }

    public void cadastrar(String marca, String modelo, int volume, int potencia) {
        super.cadastrar(marca, modelo, volume, potencia);
    }

    public void imprimir() {
        super.imprimir();
    }

    public void entrada() {
        super.entrada();
    }

    public void assar(int potencia) {
        super.setPotencia(potencia);
        System.out.println("Forno assando com potencia: " + super.getPotencia());
    }

    public void aquecer(int potencia) {
        super.setPotencia(potencia);
        System.out.println("Forno aquecendo com potencia: " + super.getPotencia());

    }

    public void desligar() {
        System.out.println("Desligar Forno");
    }

}

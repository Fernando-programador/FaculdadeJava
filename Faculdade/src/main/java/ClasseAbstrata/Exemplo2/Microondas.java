/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.Exemplo2;

/**
 *
 * @author java
 */
public class Microondas extends AssaAquece {

    public Microondas() {
    }

    public Microondas(String Marca, String Modelo) {
        super(Marca, Modelo);
    }

    public Microondas(int volume, int potencia) {
        super(volume, potencia);
    }

    public Microondas(String Marca, String Modelo, int volume, int potencia) {
        super(Marca, Modelo, volume, potencia);
    }

    public void cadastrar(String Marca, String Modelo, int volume, int potencia) {
        super.cadastrar(Marca, Modelo, volume, potencia);
    }

    public void imprimir() {
        super.imprimir();

    }

    public void entrada() {
        super.entrada();
    }

    private void girar(boolean giro) {
        if (giro) {
            System.out.println("Girando o prato");
        } else {
            System.out.println("Prato parado");

        }
    }

    public void assar(int potencia) {
        super.setPotencia(potencia);
        girar(true);
        System.out.println("Microondas assando com potencia: " + super.getPotencia());
    }

    public void aquecer(int potencia) {
        super.setPotencia(potencia);
        girar(true);
        System.out.println("Microondas aquecendo com potencia: " + super.getPotencia());

    }

    public void desligar() {
        girar(false);
        System.out.println("Desligar microondas");
    }

}

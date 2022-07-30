/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacao;

/**
 *
 * @author java
 */
public class Notebook {
     private DiscoRigido hd = new DiscoRigido();
    private Memoria me  = new Memoria();
    private PlacaMae pm = new PlacaMae();
    private PlacaVideo pv = new PlacaVideo();

    public Notebook() {
    }

    public DiscoRigido getHd() {
        return hd;
    }

    public void setHd(DiscoRigido hd) {
        this.hd = hd;
    }

    public Memoria getMe() {
        return me;
    }

    public void setMe(Memoria me) {
        this.me = me;
    }

    public PlacaMae getPm() {
        return pm;
    }

    public void setPm(PlacaMae pm) {
        this.pm = pm;
    }

    public PlacaVideo getPv() {
        return pv;
    }

    public void setPv(PlacaVideo pv) {
        this.pv = pv;
    }
    
}

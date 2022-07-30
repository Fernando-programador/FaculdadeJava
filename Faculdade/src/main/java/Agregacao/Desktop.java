/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacao;

/**
 *
 * @author java
 */
public class Desktop {
     private String torre;

    public DiscoRigido hd = new DiscoRigido();
    public Memoria me = new Memoria();
    public PlacaMae pm = new PlacaMae();
    public PlacaVideo pv = new PlacaVideo();


    public Memoria slot0 = new Memoria();
    public Memoria slot1 = new Memoria();
    public Memoria slot2 = new Memoria();
    public Memoria slot3 = new Memoria();

    Desktop() {
    }
    public String getTorre() {
        return torre;
    }

    public Desktop(String torre) {
        this.torre = torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
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

    public Memoria getSlot0() {
        return slot0;
    }

    public void setSlot0(Memoria slot0) {
        this.slot0 = slot0;
    }

    public Memoria getSlot1() {
        return slot1;
    }

    public void setSlot1(Memoria slot1) {
        this.slot1 = slot1;
    }

    public Memoria getSlot2() {
        return slot2;
    }

    public void setSlot2(Memoria slot2) {
        this.slot2 = slot2;
    }

    public Memoria getSlot3() {
        return slot3;
    }

    public void setSlot3(Memoria slot3) {
        this.slot3 = slot3;
    }


  
    
}

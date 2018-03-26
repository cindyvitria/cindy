/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cindy;

/**
 *
 * @author ACER
 */
public class Rumah {
    String warnaTembok;
    String warnaAtap;
    int tipeRumah;
    String bntkJendela;
    String jnsPintu;
    
    void cetakInfo(){
        System.out.println("Warna Tembok Rumah  : "+warnaTembok);
        System.out.println("Warna Atap Rumah    : "+warnaAtap);
        System.out.println("Tipe Rumah          : "+tipeRumah);
        System.out.println("Bentuk Jendela      : "+bntkJendela);
        System.out.println("Jenis Pintu         : "+jnsPintu);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

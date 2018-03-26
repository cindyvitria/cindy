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
public class RumahAksi {
    public static void main(String[] args) {
        Rumah r1 = new Rumah();
        Rumah r2 = new Rumah();
        Rumah r3 = new Rumah();
        
        
        r1.warnaTembok="Biru";
        r1.warnaAtap="Coklat";
        r1.tipeRumah=45;
        r1.bntkJendela="Bulat";
        r1.jnsPintu="Pintu Keluar";
        
        r2.warnaTembok="Pink";
        r2.warnaAtap="Merah";
        r2.tipeRumah=100;
        r2.bntkJendela="KOtak";
        r2.jnsPintu="Pintu Geser";
        
        r3.warnaTembok="Hijau";
        r3.warnaAtap="Hitam";
        r3.tipeRumah=54;
        r3.bntkJendela="Abstrak";
        r3.jnsPintu="Pintu Dorong";
    }
}

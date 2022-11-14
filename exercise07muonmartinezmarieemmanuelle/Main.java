/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07muonmartinezmarieemmanuelle;

/**
 *
 * @author MUON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location plaza = new Location("Plaza", "Flowers");
        Trainer a = new Trainer("A", plaza);
        NPC flowerSeller = new NPC("Flower Seller");
        FireType scaryWoah = new FireType("Scary Woah", "Fire", 40, 10);
        
        a.inspect(plaza);
        a.inspect(flowerSeller);
        a.inspect(scaryWoah);
    }
    
}

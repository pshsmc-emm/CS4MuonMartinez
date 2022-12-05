/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09muon;

/**
 *
 * @author MUON
 */
public class GrassType extends Monster{

    public GrassType(String name, String type, int hp, int base) {
        super(name , "grass", "water", "fire", hp , base);
        
        atk = base;
        def = base;
    }
    
    
    public void rest() {
        int halfHP = maxHP;
        halfHP *= 0.5;
        hp += halfHP;
        System.out.println(name + " is resting.");
        System.out.println(name + " has healed and has " + hp + 
                           " / " + maxHP + " HP now.\n");
    }

    @Override
    public void special() {
      int twentyPercentHP = maxHP;
      twentyPercentHP *= 0.2;

      hp += twentyPercentHP;
      
      System.out.println(name + " did a pose.");
      System.out.println(name + " has healed and has " + hp + 
                         " / " + maxHP + " HP now.\n");
    }
}


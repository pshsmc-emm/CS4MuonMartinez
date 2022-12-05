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
public class FireType extends Monster{
    
    public FireType(String name, String type, int hp, int base) {
        super(name , "fire", "grass", "water", hp , base);
        
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special() {
        int tenPercentHP = maxHP;
        tenPercentHP *= 0.1;

        atk += 2;
        hp -= tenPercentHP;
        
        System.out.println(name + " did a pose.");
        System.out.println(name + " has boosted atk. It is now " + atk + 
                           ". Remaining HP is " + hp + ".\n");
    }
}

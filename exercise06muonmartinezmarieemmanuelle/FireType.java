/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06muonmartinezmarieemmanuelle;

/**
 *
 * @author MUON
 */
public class FireType extends Monster{
    private int tenPercentHP = maxHP;
    
    public FireType(String name, String type, int hp, int base) {
        super(name , "fire", "grass", "water", hp , base);
        
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special() {
        atk += 2;
        
        tenPercentHP *= 0.9;
        hp -= tenPercentHP;
        
        System.out.println(name + "has boosted atk.");
    }
}





















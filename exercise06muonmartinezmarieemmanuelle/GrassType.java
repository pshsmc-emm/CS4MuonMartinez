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
public class GrassType extends Monster{
    private int twentyPercentHP = maxHP;

    public GrassType(String name, String type, int hp, int base) {
        super(name , "grass", "water", "fire", hp , base);
        
        atk = base;
        def = base;
    }
    
    
    @Override
    public void special() {
        twentyPercentHP *= 0.2;
        
        hp += twentyPercentHP;
    }
}

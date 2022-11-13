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
public class WaterType extends Monster {
  
  public WaterType(String name, String type, int hp, int base) {
    super(name, "water", "fire", "grass", hp, base);

    atk *= 0.7;
    def *= 1.3;
  }

  @Override
  public void special() {
    super.special();
    int tenPercentHP = maxHP;
    tenPercentHP *= 0.1;

    def += 2;
    hp -= tenPercentHP;

    System.out.println(name + " has boosted def. It is now " + def + 
                       ". Remaining HP is " + hp + ".\n");
  }
}

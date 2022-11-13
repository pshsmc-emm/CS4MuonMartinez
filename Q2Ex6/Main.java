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
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    FireType blaze = new FireType("Blaze", "Fire", 40, 10);
    GrassType velon = new GrassType("Velon", "Grass", 50, 12);
    WaterType clear = new WaterType("Clear", "Water", 60, 10);

    int blazeHalfHP = blaze.getMaxHP();
    blazeHalfHP *= 0.5;

    int blazeTenPercentHP = blaze.getMaxHP();
    blazeTenPercentHP *= 0.1;

    int velonHalfHP = velon.getMaxHP();
    velonHalfHP *= 0.5;

    int velonQuarterHP = velon.getMaxHP();
    velonQuarterHP *= 0.25;

    int clearHalfHP = clear.getMaxHP();
    clearHalfHP *= 0.5;

    int clearTenPercentHP = clear.getMaxHP();
    clearTenPercentHP *= 0.1;

    int fireGrassRoundCount = 1;
    int blazeFvGSpecialCount = 0;
    int velonFvGSpecialCount = 0;
    int velonFvGRestCount = 0;
    int fireWaterRoundCount = 1;
    int blazeFvWSpecialCount = 0;
    int clearFvWSpecialCount = 0;
    int waterGrassRoundCount = 1;
    int clearWvGSpecialCount = 0;
    int velonWvGSpecialCount = 0;
    int velonWvGRestCount = 0;

    System.out.println("Monster League");
    System.out.println("There will be three rounds today. " + 
                       "With our contestants being Blaze (Fire), Velon (Grass) and Clear (Water).");

    //fire vs. grass fight
    System.out.println("\n\n\nFIGHT 1: FIRE VS. GRASS\n");

    blaze.restoreHealth();
    velon.restoreHealth();

    do {
      System.out.println("Round " + fireGrassRoundCount);

      if (blaze.getHP() > 0) {
        blaze.attack(velon);
        
        if (velon.getHP() < velonHalfHP && velonFvGSpecialCount < 2) {
          velon.special();
          velonFvGSpecialCount++;
        }

        if (velon.getHP() < velonQuarterHP && velonFvGRestCount < 1) {
          velon.rest();
          velonFvGRestCount++;
        }
      }

      if (velon.getHP() > 0) {
        velon.attack(blaze);

        if (blaze.getHP() > blazeTenPercentHP && blaze.getHP() < blazeHalfHP 
            && blazeFvGSpecialCount < 2) {
          blaze.special();
          blazeFvGSpecialCount++;
        }
      }

      fireGrassRoundCount++;
    } while (blaze.getHP() > 0 && velon.getHP() > 0);

    //fire vs. water fight
    System.out.println("\n\n\nFIGHT 2: FIRE VS. WATER\n");

    blaze.restoreHealth();
    clear.restoreHealth();

    do {
      System.out.println("Round " + fireWaterRoundCount);

      if (blaze.getHP() > 0) {
        blaze.attack(clear);

        if (clear.getHP() > clearTenPercentHP && clear.getHP() < clearHalfHP 
            && clearFvWSpecialCount < 2) {
          clear.special();
          clearFvWSpecialCount++;
        }
      }

      if (clear.getHP() > 0) {
        clear.attack(blaze);

        if (blaze.getHP() > blazeTenPercentHP && blaze.getHP() < blazeHalfHP 
            && blazeFvWSpecialCount < 2) {
          blaze.special();
          blazeFvWSpecialCount++;
        }
      }

      fireWaterRoundCount++;
    } while (blaze.getHP() > 0 && clear.getHP() > 0);

    //water vs. grass fight
    System.out.println("\n\n\nFIGHT 3: WATER VS. GRASS\n");

    clear.restoreHealth();
    velon.restoreHealth();
    
    do {
      System.out.println("Round " + waterGrassRoundCount);

      if (clear.getHP() > 0) {
        clear.attack(velon);

        if (velon.getHP() < velonHalfHP && velonWvGSpecialCount < 2) {
          velon.special();
          velonWvGSpecialCount++;
        }

        if (velon.getHP() < velonQuarterHP && velonWvGRestCount < 1) {
          velon.rest();
          velonWvGRestCount++;
        }
      }

      if (velon.getHP() > 0) {
        velon.attack(clear);

        if (clear.getHP() > clearTenPercentHP && clear.getHP() < clearHalfHP 
            && clearWvGSpecialCount < 2) {
          clear.special();
          clearWvGSpecialCount++;
        }
      }

      waterGrassRoundCount++;
    } while (clear.getHP() > 0 && velon.getHP() > 0);
  }
}
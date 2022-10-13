/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04muonmartinez;
import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String venue;
    String repeat = "y";

    Song sourGrapes = new Song("Sour Grapes", 196);
    Singer yoda = new Singer("Yoda", 12, sourGrapes);

    Song lemonade = new Song("Lemonade", 191);
    Singer porg = new Singer("Porg", 12, lemonade);
      
    Place veEatery = new Place("VE Eatery", 9.1);
    Place csBakery = new Place("CS Bakery", 9.3);
    Place adtStore = new Place("ADT Store", 9.7);

    while (repeat.equalsIgnoreCase("y")) {
      do {
        System.out.println("\nPlease pick a venue (VE Eatery, CS Bakery, ADT Store).");
        venue = scan.nextLine();

        if (venue.equalsIgnoreCase("ve eatery")) {
          veEatery.performThere();
        } else if (venue.equalsIgnoreCase("cs bakery")) {
          csBakery.performThere();
        } else if (venue.equalsIgnoreCase("adt store")) {
          adtStore.performThere();
        } else {
          System.out.println("Invalid input please try again.");
        }
      } while (!venue.equalsIgnoreCase("ve eatery") && !venue.equalsIgnoreCase("cs bakery")
          && !venue.equalsIgnoreCase("adt store"));

      System.out.println("\nPlease input a favorite song.");
      String newSongName = scan.nextLine();

      System.out.println("\nEnter its length in seconds.");
      int newSongLength = scan.nextInt();
      scan.nextLine();

      Song favoriteSong = new Song(newSongName, newSongLength);

      yoda.performForAudience(favoriteSong, 12);
      favoriteSong.songInfo();

      System.out.println("\nPlease input a new favorite song.");
      String newFavSongName = scan.nextLine();

      System.out.println("\nEnter its length in seconds.");
      int newFavSongLength = scan.nextInt();
      scan.nextLine();

      Song changeFavSong = new Song(newFavSongName, newFavSongLength);

      yoda.changeFavSong(changeFavSong);
      yoda.performForAudience(changeFavSong, 12, porg);
      porg.coPerform(12);
      System.out.println("Total performances overall is now " + Singer.totalPerformances(yoda, porg) + ".");
      changeFavSong.songInfo();

      do {
        System.out.print("\nPerform again (y/n)? ");
        repeat = scan.nextLine();
      } while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n"));
    }
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex3;
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
      Scanner scan = new Scanner (System.in);
      String venue;
      String repeat = "y";

      Singer yoda = new Singer("Yoda", 12, "Sour Grapes");
      Place veEatery = new Place("VE Eatery", 9.1);
      Place csBakery = new Place("CS Bakery", 9.3);
      Place adtStore = new Place("ADT Store", 9.7);
      Song sourGrapes = new Song("Sour Grapes", 196);
      
      while(repeat.equalsIgnoreCase("y")) {
        do {
          System.out.println("\nPlease pick a venue (VE Eatery, CS Bakery, ADT Store).");
          venue = scan.nextLine();
    
          if(venue.equalsIgnoreCase("ve eatery")) {
            veEatery.performThere();
          } else if(venue.equalsIgnoreCase("cs bakery")) {
            csBakery.performThere();
          } else if(venue.equalsIgnoreCase("adt store")) {
            adtStore.performThere();
          } else {
             System.out.println("Invalid input please try again.");
          }
        } while (!venue.equalsIgnoreCase("ve eatery") && !venue.equalsIgnoreCase("cs bakery") && !venue.equalsIgnoreCase("adt store"));

        System.out.println("\nPlease input a favorite song.");
        String newSongName = scan.nextLine();

        System.out.println("\nEnter its length in seconds.");
        int newSongLength = scan.nextInt();
        scan.nextLine();
  
        Song newSong = new Song(newSongName, newSongLength);
      
        yoda.performForAudience(newSong, 12);
        newSong.songInfo();
      
        System.out.println("\nPlease input a new favorite song.");
        String newFavSongName = scan.nextLine();
  
        System.out.println("\nEnter its length in seconds.");
        int newFavSongLength = scan.nextInt();
        scan.nextLine();
  
        Song newFavSong = new Song(newFavSongName, newFavSongLength);
        
        yoda.changeFavSong(newFavSongName);
        yoda.performForAudience(newFavSong, 12);
        newFavSong.songInfo();

        do {
          System.out.print("\nPerform again (y/n)? ");
          repeat = scan.nextLine();
        } while(!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n"));
      }
    }
}

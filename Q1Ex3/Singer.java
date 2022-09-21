/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex3;

/**
 *
 * @author MUON
 */
public class Singer {  
  private String name;
  private int noOfPerformances;
  private double earnings;
  private int noOfPeople;
  private String favoriteSong;
  private String newFavSong;

  public Singer(String n, int e, String s) {
    name = n;
    noOfPeople = e;
    favoriteSong = s;
    // noOfPerformances = 0;
    // earnings = 0.00;
  }

  public void performForAudience(Song f, int noOfPeople) {    
    noOfPerformances += 1;
    earnings += noOfPeople * 100;
    
    System.out.println("\n" + name + " performed " + f.getTitle() + " for " + noOfPeople + " people and earned " + earnings + " pesos.");
    
    System.out.println(name + "'s total number of performances is now " + noOfPerformances + ".");
  }

  public void changeFavSong(String newFavSong) {
    favoriteSong = newFavSong;
    System.out.println("\n" + name + "'s new favorite song is '" + newFavSong + "'.");
  }
}
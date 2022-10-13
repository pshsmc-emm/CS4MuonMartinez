/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04muonmartinez;

/**
 *
 * @author MUON
 */
public class Singer {
  private String name;
  private int noOfPerformances;
  private double earnings;
  private int noOfPeople;
  private Song favoriteSong;
  private Song changeFavSong = new Song("title", 0);
  private static int totalPerformances = 0;

  public Singer(String n, int e, Song s) {
    name = n;
    noOfPeople = e;
    favoriteSong = s;
  }

  public String getName() {
    return name;
  }

  public double getEarnings() {
    return earnings;
  }

  public int getPerformances() {
    return noOfPerformances;
  }
  
  public void performForAudience(Song favoriteSong, int noOfPeople) {
    noOfPerformances += 1;
    earnings += noOfPeople * 100;

    System.out.println("\n" + name + " performed " + favoriteSong.getTitle() + " for " + noOfPeople
        + " people and now has a total of " + earnings + " pesos.");

    System.out.println(name + "'s total number of performances is now " + noOfPerformances + ".");
  }

  public void performForAudience(Song favoriteSong, int noOfPeople, Singer otherSinger) {
    noOfPerformances += 1;
    int otherPerform = otherSinger.getPerformances();
    otherPerform += 1;
    
    earnings += (noOfPeople * 100) / 2;
    double otherEarnings = otherSinger.getEarnings();
    otherEarnings += (noOfPeople * 100) / 2;

    System.out.println("\n" + name + " performed " + favoriteSong.getTitle() + " for " + noOfPeople
        + " people and now has a total of " + earnings + " pesos.");

    System.out.println("\n" + otherSinger.getName() + " performed " + favoriteSong.getTitle() + " for " + noOfPeople
        + " people and now has a total of " + otherEarnings + " pesos.");

    System.out.println(name + "'s total number of performances is now " + noOfPerformances + ".");
    System.out.println(otherSinger.getName() + "'s total number of performances is now " + otherPerform + ".");
  }

  public void coPerform(int noOfPeople) {
    noOfPerformances += 1;
    earnings += (noOfPeople * 100) / 2;
  }

  public void changeFavSong(Song newFavSong) {
    favoriteSong = newFavSong;
    System.out.println("\n" + name + "'s new favorite song is '" + newFavSong.getTitle() + "'.");
  }

  public static int totalPerformances(Singer singerOne, Singer singerTwo) {
    totalPerformances = singerOne.getPerformances() + singerTwo.getPerformances();

    return totalPerformances;
  }
}
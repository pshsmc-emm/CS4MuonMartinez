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
public class Song {  
  private String title;
  private int songLengthSecs;
  
  public Song(String t, int c) {
    title = t;
    songLengthSecs = c;
  }

  public String getTitle() {
    return title;
  }
  
  public void songInfo() {
    double songLengthMins;
    songLengthMins = songLengthSecs / 60;
    
    System.out.println("\n" + title + " is " + songLengthSecs + " seconds or about " + songLengthMins + " minutes long.");
  }
}
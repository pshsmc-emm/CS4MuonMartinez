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
public class Place{
    private String location;
    private double ambienceScore;
    
    public Place(String l, double a){
      location = l;
      ambienceScore = a;
    }

    public void performThere(){
      if (ambienceScore < 9.9) {
        ambienceScore += 0.1;
      } else {
        ambienceScore = 10;
      }  
      
      System.out.println("\n" + location + " was the venue for the performance.");
      System.out.println(location + " now has an ambience score of "+ ambienceScore + ".");  
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;
import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Ex02MuonMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int lowerLimit = 0;
        int upperLimit = 10;
        int numOfGuesses = 3;
        int range = 10;
        //String retry = "y";
      
        //starting screen
        System.out.println("Welcome to Higher or Lower! What will you do?");
        System.out.println("- Start game");
        System.out.println("- Change settings");
        System.out.println("- End application");
        String userInput = scan.nextLine();
        
        //do {
        if(userInput.equalsIgnoreCase("start game")) {
          int random = (int) Math.floor(Math.random()*range) + lowerLimit;  
            
          System.out.print("You have " + numOfGuesses + " guess(es) left. What is your guess? ");
          int userGuess = scan.nextInt();
          
          while(numOfGuesses > 1){
              numOfGuesses -= 1;
              
              if(userGuess < random) {
                  System.out.print("Guess higher! You have " + numOfGuesses +" guess(es) left. What is your guess? ");
                  userGuess = scan.nextInt();
              } else if (userGuess > random) {
                  System.out.print("Guess lower! You have " + numOfGuesses +" guess(es) left. What is your guess? ");
                   userGuess = scan.nextInt();
              }
            }
          
          if (userGuess == random){
                System.out.println("You got it!");
          } else {
                System.out.println("You lost...");
          }
          
          System.out.println("Play again (y/n)? ");
          String retryGame = scan.nextLine();
          
          System.out.println("test");
          
          
        } else if(userInput.equalsIgnoreCase("change settings")) {
          System.out.println("What is the lower limit of the random number?");
          System.out.println("What is the upper limit of the random number?");
          System.out.println("How many guesses are allowed?");

          System.out.print("Lower limit: ");
          lowerLimit = scan.nextInt();
          System.out.print("Upper limit: ");
          upperLimit = scan.nextInt();
          System.out.print("Guesses: ");
          numOfGuesses = scan.nextInt();
                  

        } else if(userInput.equalsIgnoreCase("end application")) {
          System.out.println("Thank you for playing!");
          
        } else {
          System.out.println("Please input an appropriate response.");
        }
   // } while(retry.equalsIgnoreCase("y"));
  }
}

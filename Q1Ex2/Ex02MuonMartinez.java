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
      //declaring variables
      Scanner scan = new Scanner (System.in);
      int lowerLimit = 0;
      int upperLimit = 10;
      int numOfGuesses = 3;
      int range = 10;
      String userInput = "userChoice";

      while(!userInput.equalsIgnoreCase("end application")) {
        String retry = "y";
        
        //starting screen
        System.out.print("Welcome to Higher or Lower! ");
        System.out.println("What will you do?");
        System.out.println("- Start game");
        System.out.println("- Change settings");
        System.out.println("- End application");
        userInput = scan.nextLine();
        System.out.print("\n");

        //cases for user input
        switch(userInput) {
          //to start the game  
          case "start game":
            while(retry.equalsIgnoreCase("y")) {
              int random = (int) Math.floor(Math.random()*range) + lowerLimit;  
            
              System.out.print("You have " + numOfGuesses);
              System.out.print(" guess(es) left. What is your guess? ");
              int userGuess = scan.nextInt();
              scan.nextLine();
          
              for(int guessCount = numOfGuesses-1; guessCount > 0; guessCount--){
                int guessesLeft = guessCount;
              
                if(userGuess < random) {
                  System.out.print("Guess higher! You have " + guessesLeft);
                  System.out.print(" guess(es) left. What is your guess? ");
                  userGuess = scan.nextInt();
                  scan.nextLine();
                } else if (userGuess > random) {
                  System.out.print("Guess lower! You have " + guessesLeft);
                  System.out.print(" guess(es) left. What is your guess? ");
                  userGuess = scan.nextInt();
                  scan.nextLine();
                }
              }
          
              if(userGuess == random){
                System.out.println("You got it!");
              } else {
                System.out.println("You lost...");
              }

              do {
                System.out.print("Play again (y/n)? ");
                retry = scan.nextLine();
                System.out.print("\n");
              } while(!retry.equalsIgnoreCase("y") && !retry.equalsIgnoreCase("n"));
            }
            
            break;

          //to change the limits and amount of guesses
          case "change settings":
            System.out.println("What is the lower limit of the random number?");
            System.out.println("What is the upper limit of the random number?");
            System.out.println("How many guesses are allowed?");

            System.out.print("Lower limit: ");
            lowerLimit = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Upper limit: ");
            upperLimit = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Guesses: ");
            numOfGuesses = scan.nextInt();
            scan.nextLine();

            System.out.print("\n");

            break;

          //when the application is ended
          case "end application":
            System.out.println("Thank you for playing!");

            break;

          //other inputs  
          default:
            System.out.print("Please input an appropriate response.");

            break;
        }
      }
    }  
}

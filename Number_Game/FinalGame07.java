//7. Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.Random;
import java.util.Scanner;

public class FinalGame07{
    public static void main(String[] args) {
        Random  guess = new Random();
        Scanner in = new Scanner(System.in);;
        String playAgain ;
        int  totalScore =0;   
        int  roundsWon =0;


        do{
        int randomGuess = guess.nextInt(100)+1;
        int userGuess=0;
        int NumberOfAttempts=8;
        int scoreOfThisRound=0;

        System.out.println("I had Generated some random number in between 1 to 100 ");
        System.out.println("Try to guess  it in given  " +  NumberOfAttempts + " Given." );

        while (userGuess != randomGuess && NumberOfAttempts > 0) {
            System.out.print("Enter your guess number : ");
            userGuess = in.nextInt();
            NumberOfAttempts--;

            if (userGuess < randomGuess) {
                System.out.println("It's higher than " + userGuess + " & you are left with  "+NumberOfAttempts+ " number of attempts" );
            } else if (userGuess > randomGuess) {
                System.out.println("It's lower than " + userGuess  + " & you are left with  "+NumberOfAttempts+ " number of attempts" );
            }

            if (NumberOfAttempts == 0 && userGuess != randomGuess) {
                System.out.println("You're running out of attempts! The number was " + randomGuess);
                break;
            }
        }

        if (userGuess == randomGuess) {
            roundsWon++;
            scoreOfThisRound = NumberOfAttempts *10;
            totalScore += scoreOfThisRound;
            System.out.println("Congratulations! You guessed the number: " + randomGuess);
            System.out.println("You Scored "+ scoreOfThisRound + " Points of this Round");
        }
        System.out.println("Total sore You Got : " +totalScore);
        System.out.println("Rounds Won : "+ roundsWon);


        System.out.println("Do you Want to Play again? (Yes/No) :");//Asking Player Wants to  play again..
            playAgain =in.next();
    
        }while(playAgain.equalsIgnoreCase("yes")) ;


        System.out.println("Thanks for Playing🎉🎉!");
        in.close();
    }
}
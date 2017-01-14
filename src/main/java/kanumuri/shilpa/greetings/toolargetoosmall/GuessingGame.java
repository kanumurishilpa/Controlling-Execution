package kanumuri.shilpa.greetings.toolargetoosmall;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class GuessingGame {

        public static void main(String[] args){
            Scanner userInput = new Scanner(System.in);
            System.out.println("please enter number");
            int number = userInput.nextInt();
            Random numberToGuess = new Random();
            int secretNumber = numberToGuess.nextInt(10);

            GuessANumber guessANumber = new GuessANumber();
            boolean win = true;
            int count = 1;

            String result = guessANumber.guessANumber(secretNumber,number);

            while (win){

                if(result.equalsIgnoreCase("win")){
                    System.out.println("You win");
                    win = false;
                }else{
                    System.out.println("Try Again");
                    count = count +1;
                    System.out.println("please enter number");
                    number = userInput.nextInt();
                    result = guessANumber.guessANumber(secretNumber,number);
                }
            }




        }




    }

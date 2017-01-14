package kanumuri.shilpa.greetings.toolargetoosmall;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/13/17.
 */
public class GuessANumber {



    public String guessANumber(int secretNumber,int userguess) {

        String output = "";

        if (userguess == secretNumber) {
            System.out.println("horray!! You got the right number " + userguess);
            return "win";
        }

        if ((userguess > (secretNumber - 2)) && (userguess < (secretNumber + 2))) {
            System.out.println("You are close");
            return "CLOSE";
        }
        if (userguess > secretNumber) {
            System.out.println("Number too BIG");
            return  "BIG";
        }
        if (userguess < secretNumber) {

            System.out.println("Number too SMALL");
            return  "SMALL";
        }

        return output;
    }




}

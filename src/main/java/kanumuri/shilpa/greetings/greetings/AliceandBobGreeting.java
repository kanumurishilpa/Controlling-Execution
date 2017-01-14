package kanumuri.shilpa.greetings.greetings;

import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/12/17.
 */
public class AliceandBobGreeting {


    public String greeting(String name){

        String aliceName = "Alice";
        String bobName = "Bob";

        if(name.equalsIgnoreCase(aliceName) || name.equalsIgnoreCase(bobName)){

            return "Hello " + name;
        }
        else {

            return "Do i know you";
        }

    }

    public static void main(String[] args){

       Scanner givename = new Scanner(System.in);
       System.out.println("Enter a name");
       String givenName = givename.nextLine();

       AliceandBobGreeting greet = new AliceandBobGreeting();
       System.out.println(greet.greeting(givenName));

    }



}

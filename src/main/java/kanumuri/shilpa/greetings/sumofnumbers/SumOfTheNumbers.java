package kanumuri.shilpa.greetings.sumofnumbers;

import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/12/17.
 */
public class SumOfTheNumbers {

    public static int sumOfTheNumbers(int number){

        int sum = 0;

        for(int i=1 ; i <= number ; i++){

            sum = sum + i ;

        }
        return sum;

    }

    public static void main(String[] args){
        Scanner print = new Scanner(System.in);
        System.out.println("Enter a Number");
        int enterNumber= print.nextInt();

        SumOfTheNumbers sum = new SumOfTheNumbers();
        System.out.println(sum.sumOfTheNumbers(enterNumber));

    }
}

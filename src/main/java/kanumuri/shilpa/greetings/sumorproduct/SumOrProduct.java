package kanumuri.shilpa.greetings.sumorproduct;

import java.util.Scanner;
/**
 * Created by shilpakanumuri on 1/12/17.
 */
public class SumOrProduct {

    public String sumOrProduct(String options, int number){

        String optionSum = "sum";
        String optionProduct = "product";

        if(options.equalsIgnoreCase(optionSum)){

            int sumanswer = sumOfTheNumbers(number);
            String numberAsString = Integer.toString(sumanswer);
            return "The sum is " + numberAsString;

        }
        else if (options.equalsIgnoreCase(optionProduct)){

            int productanswer = productOfTheNumbers(number);
            String numberAsString = Integer.toString(productanswer);
            return "The product is " + numberAsString;
        }

        else {

            return " What do want me to do! Sum or Product!!!! ";
        }
    }

    public static int sumOfTheNumbers(int number){
        System.out.println("We are in sum Of the Numbers" + number);

        int sum = 0;

        for(int i=1 ; i <= number ; i++){

            sum = sum + i ;

        }
        return sum;

    }

    public static int productOfTheNumbers(int number){

        int product = 1;

        for(int i=1 ; i <= number ; i++){

            product = product * i ;

        }
        return product;

    }

    public static void main(String[] args){

        Scanner enterSumorProduct = new Scanner(System.in);
        System.out.println("Enter a Sum or Product");
        String sumOrproduct = enterSumorProduct.nextLine();

        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number= enterNumber.nextInt();

        SumOrProduct answer = new SumOrProduct();
        System.out.println(answer.sumOrProduct(sumOrproduct,number));

    }



}

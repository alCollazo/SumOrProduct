package collazo.albert.SumOrProduct;

import java.util.Scanner;

public class SumOrProduct {

    public static void main(String[] args){
        SumOrProduct dude = new SumOrProduct();

        System.out.println("Enter a whole number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();


        System.out.println("Do you want to find the Sum, or the Product?: ");
        Scanner userInput2 = new Scanner(System.in);
        String in = userInput2.next();
        if (in.equalsIgnoreCase("Sum")){

            System.out.println("Here is the sum of your number: "+dude.sumFunction(n));
        }
        else if(in.equalsIgnoreCase("Product")){

            System.out.println("Here is the product of your number: "+dude.productFunction(n));
        }
        else{
            System.out.println("Invalid input.");
        }
    }

    public int sumFunction(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

    }

    public int productFunction(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    }


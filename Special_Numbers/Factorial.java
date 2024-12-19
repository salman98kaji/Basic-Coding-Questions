package Special_Numbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        }
    }

    public static int factorial(int num){
        int product = 1;
        for(int i=1; i<=num; i++){
            product *= i;
        }
        return product;
    }



}

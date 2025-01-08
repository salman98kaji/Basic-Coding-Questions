package Special_Numbers;

import java.util.Scanner;
//a positive integer where the sum of the factorials of its digits is equal to the number itself.
//For example, 145  is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145.

public class StrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }

    public static boolean isStrongNumber(int num){
        int originalNum = num;
        int fact = 0;
        while (num >0){
            int rem = num % 10;
            fact += factorial(rem);
            num = num / 10;
        }
        return fact == originalNum;
    }

    public static int factorial(int num){
        int product = 1;
        for(int i=1; i<=num; i++){
            product *= i;
        }
        return product;
    }
}

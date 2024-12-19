package Special_Numbers;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }

    public static boolean isHarshadNumber(int num){
        int originalNum = num;
        int sumOfDigits = 0;
        while (num > 0) {
            int digit = num % 10;
            sumOfDigits += digit;
            num /= 10;
        }
        return originalNum % sumOfDigits == 0;
    }
}

// Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
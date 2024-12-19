package Special_Numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }
    }

    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }
        return reversed == originalNum;
    }
}

//A palindrome number is a number that reads the same backward as forward, such as 121 or 12321.

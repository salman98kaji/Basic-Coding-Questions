package Special_Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    //count the no of digits
    public static int countDigits(int num){
        int counter = 0;
        while (num > 0){
            counter++;
            num /= 10;
        }
        return counter;
    }

    public static boolean isArmstrong(int num){
        int originalNum = num;
        int digits = countDigits(num);
        double sum =0;
        while (num >0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }
        return sum == originalNum;
    }
}

//also known as Narcissistic Numbers: Numbers equal to the sum of their own digits raised to the power of the number of digits.
//Example: 153 (1³ + 5³ + 3³), 9474 (9⁴ + 4⁴ + 7⁴ + 4⁴), etc.

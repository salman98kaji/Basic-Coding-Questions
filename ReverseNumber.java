import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        int reversedNum = 0;

        while(number!=0) {
            int lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10 ;
        }

        System.out.print("The reversed number is :" +reversedNum);
    }
}

//Modulo '%' -- returns remainder, whereas Slash '/' -- returns quotient.

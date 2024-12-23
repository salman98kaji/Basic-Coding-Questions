package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str){
        int left=0;
        int right= str.length() - 1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

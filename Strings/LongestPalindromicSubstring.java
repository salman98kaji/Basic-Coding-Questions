package Strings;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find its longest palindromic substring: ");
        String input = scanner.nextLine();

        String longestPalindrome = findLongestPalindrome(input);
        System.out.println("The longest palindromic substring is: " + longestPalindrome);
        scanner.close();
    }

    public static String findLongestPalindrome(String str){
        if(str.length() < 1 || str == null){
            return str;
        }
        //Initializes the variable maxStr to the first character of the input string. This is the initial longest palindrome. If no larger palindrome is found, the first character will be the output.
        String maxStr = str.substring(0,1);

        for(int i=0; i<str.length()-1; i++){
            String odd = expandFromCentre(str, i, i);
            String even = expandFromCentre(str, i, i+1);

            if(odd.length() > maxStr.length()){
                maxStr = odd;
            }
            if(even.length() > maxStr.length()){
                maxStr = even;
            }
        }
        return maxStr;
    }

    public static String expandFromCentre(String s, int left, int right){
    //While the characters at left and right indices match, move left one step to the left and right one step to the right, expanding the palindrome.
        while (left>=0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
        //After the loop ends, left and right point to indices just outside the palindrome bounds. So, the valid palindrome is from left + 1 to right - 1 (inclusive).
    }
}

package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.next();
        System.out.print("Enter another string to determine anagram: ");
        String str2 = sc.next();

        if(isAnagram(str1, str2)){
            System.out.println("This is anagram");
        } else {
            System.out.println("This is not anagram.");
        }
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}

package Reverse;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed array:"+ Arrays.toString(arr));

    }

}
//It is commonly used to convert an array into a readable string representation, making it easier to print.
//When you directly print an array using System.out.println(array), it prints a reference to the memory location (e.g., [I@15db9742), not the actual contents of the array.
//Arrays.toString() is for 1-dimensional arrays.
//Use Arrays.deepToString() for multidimensional arrays.
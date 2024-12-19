package Reverse;

import java.util.Arrays;

public class ReverseHalfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        int mid = n/2;

        for(int i=0; i<mid/2; i++){
            int temp = arr[i];
            arr[i] = arr[mid-1-i];
            arr[mid-1-i] = temp;
        }
        System.out.println("Reversed array : "+ Arrays.toString(arr));
    }
}

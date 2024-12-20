package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,5,6,6,7,8,9,0,0};
        int n = arr.length;

        Arrays.sort(arr);

        int[] temp = new int[n]; //When removing duplicates, we need a place to store the filtered elements
        int j=0;
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[ i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1]; //Adding the Last Element

        int[] uniqueArray = Arrays.copyOf(temp, j);
        System.out.println(Arrays.toString(uniqueArray));
    }
}

package Arrays;

public class CountFreqOfNum {
    public static void main(String[] args){
        int[] arr = {4,3,4,1,4,2,4,8,9,4};
        int target = 4;
        int n = arr.length;
        int count = 0;
        for(int i =0; i<n; i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println("The frequency of "+target+" is "+count);
    }
}

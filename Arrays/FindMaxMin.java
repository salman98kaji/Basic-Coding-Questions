package Arrays;

public class FindMaxMin {
    public static void main(String[] args){
        int[] arr = {4,3,7,1,8,10,0};
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);
    }
}

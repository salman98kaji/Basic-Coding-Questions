package Arrays;

public class SumAllElem {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("SUm of all the elements is "+sum);
    }
}

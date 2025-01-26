package Stack;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k= 3;
        int[] result = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Step 1: Precompute the next greater element (NGR) indices
        for(int i=n-1; i>=0; i--) {
            // Remove smaller elements from the stack
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                stack.pop();
            }
            // If stack is empty, no greater element to the right
            nextGreater[i] = stack.isEmpty() ? n : stack.peek();

            // Push current index to the stack
            stack.push(i);
        }

        // Step 2: Find the maximum in each sliding window using NGR
        int[] result = new int[n-k+1];
        int maxIndex=0;
        for(int i=0; i<=n-k; i++) {
            if(maxIndex < i ) {
                maxIndex =i;
            }
            while (nextGreater[maxIndex] < i+k) {
                maxIndex = nextGreater[maxIndex];
            }

            result[i] = nums[maxIndex];
        }
        return result;
    }
}

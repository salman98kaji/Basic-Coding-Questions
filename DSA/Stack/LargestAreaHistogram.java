package Stack;

import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {
        int[] heights = {6, 2, 5, 4, 5, 1, 6};

        int n = heights.length;

        // Arrays to store nearest smaller to left and right
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        // We want to find the index of the nearest smaller element to the left for each bar. If there is no smaller element to the left, we use -1.
        for(int i=0; i<n; i++){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i); 
        }
    
        // Clear the stack for reuse
        stack.clear();

        // We find the index of the nearest smaller element to the right for each bar. If no smaller element exists, use the length of the array (n).
        for(int i=n-1; i>=0; i--){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the maximum area
        int maxArea =0;
        for(int i=0; i<n; i++){
            int width = right[i]-left[i] -1;
            int area = heights[i] * width;
            if(area > maxArea) {
                maxArea = area;
            }
        }

        System.out.println(maxArea);
    }
    
}
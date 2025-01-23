package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);
        System.out.println("Span values: "+ Arrays.toString(span));
    }
    
    public static int[] calculateSpan(int[] prices){
        int n= prices.length;
        //Create an array span to store the span values for each day.
        int[] span = new int[n];

        //Create a stack to store the indices of the prices.
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i< n; i++){
            // Pop elements from the stack while the current price is greater than or equal to the top of the stack
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? i+1 : i-stack.peek();

            stack.push(i);
        }
        return span; 
    }
}

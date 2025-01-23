package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] results = nxtGrtElem(arr);
        System.out.println("Next greater elements: " + Arrays.toString(results));
    }

    public static int[] nxtGrtElem(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove elements from stack smaller than or equal to the current element
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            result[i] = st.isEmpty() ? -1 : st.peek();

            // Push the current element onto the stack
            st.push(arr[i]);
        }

        return result;
    }
}

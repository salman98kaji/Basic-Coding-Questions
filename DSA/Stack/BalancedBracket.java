package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.next();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);

            } else if (ch == ')') {
                if (st.size() == 0) {
                    System.out.print(false);
                    return;
                } else if (st.peek() != '(') {
                    System.out.print(false);
                    return;
                } else {
                    st.pop();
                }

            } else if (ch == '}') {
                if (st.size() == 0) {
                    System.out.print(false);
                    return;
                } else if (st.peek() != '{') {
                    System.out.print(false);
                    return;
                } else {
                    st.pop();
                }

            } else if (ch == ']') {
                if (st.size() == 0) {
                    System.out.print(false);
                    return;
                } else if (st.peek() != '{') {
                    System.out.print(false);
                    return;
                } else {
                    st.pop();
                }
            }
        }
        if(st.size()==0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

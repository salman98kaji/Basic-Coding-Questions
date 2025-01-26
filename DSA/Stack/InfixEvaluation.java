package Stack;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String expression = "2+(5-3*6/2)";
        System.out.println("Result: " + evaluate(expression));
    }

    public static int evaluate(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            } else if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + expression.charAt(i) - '0';
                    i++;
                }
                i--;
                operands.push(num);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int value = operation(v1, v2, operator);
                    operands.push(value);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int value = operation(v1, v2, operator);
                    operands.push(value);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int value = operation(v1, v2, operator);
            operands.push(value);
        }

        return operands.pop();
    }

    public static int precedence(char operator) {
        if (operator == '+') {
            return 1;
        } else if (operator == '-') {
            return 1;
        } else if (operator == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char operator) {
        if (operator == '+') {
            return v1 + v2;
        } else if (operator == '-') {
            return v1 - v2;
        } else if (operator == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}

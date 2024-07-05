package week2;

import java.util.Stack;

public class leet_validparentheses {
    public static void main(String[] args) {
        boolean result = isValid("(({})[])");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (c == ')') {
                boolean isMatched = stack.peek() == '(';
                if (!isMatched) {
                    return false;
                }
                stack.pop();
            }  else if (c == '}') {
                boolean isMatched = stack.peek() == '{';
                if (!isMatched) {
                    return false;
                }
                stack.pop();
            } else if (c == ']') {
                boolean isMatched = stack.peek() == '[';
                if (!isMatched) {
                    return false;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

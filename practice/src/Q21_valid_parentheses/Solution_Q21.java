package Q21_valid_parentheses;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution_Q21 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char bracket;
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                try {
                    bracket = stack.pop();
                } catch(EmptyStackException e) {
                    return false;
                }

                if ((c == ')' && bracket != '(') ||
                        (c == '}' && bracket != '{') ||
                        (c == ']' && bracket != '[')) return false;
            }
        }

        return stack.isEmpty();
    }
}

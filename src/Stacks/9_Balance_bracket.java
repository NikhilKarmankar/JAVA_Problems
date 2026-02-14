package Stacks;

import java.util.Scanner;
import java.util.Stack;

class Balance_bracket {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            // For closing brackets, check matching
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty()) return false;

                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(isBalanced(str));
    }
}

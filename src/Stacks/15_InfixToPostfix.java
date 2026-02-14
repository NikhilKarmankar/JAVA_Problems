package Stacks;

import java.util.Stack;

class InfixToPostfix {
    public static void main(String[] args) {
        String Infix = "9-(5+3)*4/6";
        System.out.println(Infix);
        Stack<String> Val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < Infix.length(); i++) {
            char ch = Infix.charAt(i);

            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57){
                String s = "" +ch;
                Val.push(s);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = Val.pop();
                    String v1 = Val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    Val.push(t);

                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = Val.pop();
                    String v1 = Val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    Val.push(t);
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = Val.pop();
                        String v1 = Val.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        Val.push(t);
                        op.push(ch);

                    } else op.push(ch);
                }
            }


        }
        //val stack size ->1
        while (Val.size() > 1) {
            String v2 = Val.pop();
            String v1 = Val.pop();
            char o = op.pop();
            String t = v1 + v2 + o;
            Val.push(t);
        }
        String postfix = Val.pop();
        System.out.println(postfix);
    }
}

package Stacks;

import java.util.Stack;

class PrefixToPostfix {
    public static void main(String[] args) {
        String Str  = "-9/*+5346";
        Stack<String> Val = new Stack<>();
        for(int i =Str.length()-1;i>=0;i--){
            char ch = Str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                Val.push(ch+"");
            }else{
                String v1 = Val.pop();
                String v2 = Val.pop();
                char op =ch;
                String t =v1 +v2 +op;
                Val.push(t);


            }
        }
        System.out.println(Val.peek());

    }
}

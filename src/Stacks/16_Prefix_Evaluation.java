package Stacks;

import java.util.Stack;

class Prefix_Evaluation {
    public static void main(String[] args) {
        String Str  = "-9/*+5346";
        Stack<Integer>Val = new Stack<>();
        for(int i =Str.length()-1;i>=0;i--){
            char ch = Str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                Val.push(ascii-48);
            }else{
                int v1 = Val.pop();
                int v2 = Val.pop();
                if(ch =='+')Val.push(v1+v2);
                if(ch =='-')Val.push(v1-v2);
                if(ch =='*')Val.push(v1*v2);
                if(ch =='/')Val.push(v1/v2);

            }
        }
        System.out.println(Val.peek());
    }
}

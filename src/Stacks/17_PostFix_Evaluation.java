package Stacks;

import java.util.Stack;

class PostFix_Evalutaion {
    public static void main(String[] args) {
        String Str = "953+4*6/-";
        Stack<Integer>Val = new Stack<>();
        for(int i=0;i<Str.length();i++){
            char ch = Str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                Val.push(ascii-48);
            }else{
                int v2 = Val.pop();
                int v1 = Val.pop();
                if(ch =='+')Val.push(v1+v2);
                if(ch =='-')Val.push(v1-v2);
                if(ch =='*')Val.push(v1*v2);
                if(ch =='/')Val.push(v1/v2);

            }
        }
        System.out.println(Val.peek());
    }
}

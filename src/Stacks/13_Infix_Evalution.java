package Stacks;

import java.util.Stack;

class Infix_Evalution {
    public static void main(String[] args) {
        String Str = "9-(5+3)*4/6";
        Stack<Integer>Val = new Stack<>();
        Stack<Character>op = new Stack<>();

        for(int i=0;i<Str.length();i++){
            char ch = Str.charAt(i);

            int ascii =(int)ch;
            if(ascii>=48 && ascii<=57)Val.push(ascii-48);
            else if(op.size()==0||ch=='('||op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    int v2 = Val.pop();
                    int v1 = Val.pop();

                    if(op.peek() =='-')Val.push(v1-v2);
                    if(op.peek() =='+')Val.push(v1+v2);
                    if(op.peek() =='*')Val.push(v1*v2);
                    if(op.peek() =='/')Val.push(v1/v2);
                    op.pop();

                }
                op.pop();
            }
            else{
                if(ch =='+'||ch=='-'){
                    int v2 = Val.pop();
                    int v1 = Val.pop();

                    if(op.peek() =='-')Val.push(v1-v2);
                    if(op.peek() =='+')Val.push(v1+v2);
                    if(op.peek() =='*')Val.push(v1*v2);
                    if(op.peek() =='/')Val.push(v1/v2);
                    op.pop();

                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        //work
                        int v2 = Val.pop();
                        int v1 = Val.pop();

                        if(op.peek() =='*')Val.push(v1*v2);
                        if(op.peek() =='/')Val.push(v1/v2);
                        op.pop();

                        op.push(ch);

                    }
                    else op.push(ch);
                }
            }


        }
        //val stack size ->1
        while(Val.size()>1){
            int v2 = Val.pop();
            int v1 = Val.pop();
            if(op.peek() =='-')Val.push(v1-v2);
            if(op.peek() =='+')Val.push(v1+v2);
            if(op.peek() =='*')Val.push(v1*v2);
            if(op.peek() =='/')Val.push(v1/v2);
            op.pop();

        }
        System.out.println(Val.peek());


    }
}

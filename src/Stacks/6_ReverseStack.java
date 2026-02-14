package Stacks;

import java.util.Stack;



class ReverseStack {
    public static void pushAtBottom(Stack<Integer>St,int x){
        if(St.size()==0){
            St.push(x);
            return;
        }
        int top = St.pop();
        pushAtBottom(St,x);
        St.push(top);

    }

    public static void  reverserecursively(Stack<Integer>St){
        if(St.size()==1)return;
        int top = St.pop();
        reverserecursively(St);
        pushAtBottom(St,top);
    }
    public void rev(Stack<Integer>Sk){
        if(Sk.size()==1)return;
        int top = Sk.pop();
        System.out.println(top);
        rev(Sk);
    }
    public static void main(String[] args) {
        Stack<Integer>St = new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.push(5);
        St.push(6);

        System.out.println(St);

        Stack<Integer>Rt = new Stack<>();
        while(St.size()>0){
            Rt.push(St.pop());
        }
        System.out.println(Rt);

        Stack<Integer>Qt = new Stack<>();
        while(Rt.size()>0){
            Qt.push(Rt.pop());
        }
        System.out.println(Qt);

        while(Qt.size()>0){
            St.push(Qt.pop());
        }

        System.out.println(St);

        reverserecursively(St);

    }

}

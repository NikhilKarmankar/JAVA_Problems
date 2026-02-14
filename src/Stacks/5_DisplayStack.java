package Stacks;

import java.util.Stack;

class DisplayStack {
    public static void displayReverseRec(Stack<Integer>st){// printing stack in reverse order
        if(st.size()==0)return ;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);

    }
    public static void displayRec(Stack<Integer>st) {// printing stack in reverse order
        if (st.size() == 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>St = new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.push(5);

//        Stack<Integer>rt = new Stack<>();
//        while(St.size()>0){
//            rt.push(St.pop());
//        }
//        while(rt.size()>0){
//            int x = rt.pop();
//            System.out.println(x +" ");
//            St.push(x);
//        }
        displayReverseRec(St);
        displayRec(St);


    }

}

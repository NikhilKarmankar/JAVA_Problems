package Stacks;

import java.util.Stack;

class UnderFlow {
    public static void main(String[] args) {
        Stack<Integer>St = new Stack<>();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(5);
        St.push(9);
        System.out.println(St);
        St.pop();
        System.out.println(St);
        St.pop();
        System.out.println(St);
        St.pop();
        System.out.println(St);
        St.pop();
        System.out.println(St);
        St.pop();
        System.out.println(St);
        //St.pop();
        System.out.println(St);
        //St.pop();

    }
}

package Stacks;

import java.util.Stack;

class Introduction_Stacks {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        //ArrayList<Integer>pt = new ArrayList<>(5);
        Stack<Integer>St = new Stack<>();
        System.out.println("Size is:" + St.size());
        System.out.println(St);
        St.push(9);
        St.push(10);
        St.push(7);
        St.push(2);
        System.out.println(St);
        System.out.println("Size is " + St.size());
        St.pop();
        System.out.println(St);
        St.peek();
        System.out.println(St.peek());
        System.out.println(St.empty());
        System.out.println(St.add(2));
        System.out.println(St);



    }
}

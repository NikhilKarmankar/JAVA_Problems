package Stacks;

import java.util.Scanner;
import java.util.Stack;

class InsertionIn_Stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer>St = new Stack<>();
        int n ;
        System.out.println("Enter the number of elements you want in the Stack:");
        n = input.nextInt();

        System.out.println("Enter the Elements:");
        for(int i= 0;i<n;i++){
            int x = input.nextInt();
            St.push(x);
        }
        System.out.println(St);

        System.out.println("Enter the position of the insertion in Stack:");
        int p = input.nextInt();


        System.out.println("Enter thr element want to push in Stack:");
        int element = input.nextInt();

        Stack<Integer>temp = new Stack<>();
        for(int i=0;i<p;i++){
            temp.push(St.pop());
        }

        St.push(element);
        while(!temp.isEmpty()){
            St.push(temp.pop());
        }
        System.out.println(St);


    }
}

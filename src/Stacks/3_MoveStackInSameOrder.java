package Stacks;

import java.util.Scanner;
import java.util.Stack;

class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer>St = new Stack<>();

        int n ;
        System.out.println("Enter the number of the element to put in the Stack:");
        n = input.nextInt();

        System.out.println("Enter the elements:");
        for(int i = 0;i<n;i++){
            int x  = input.nextInt();
            St.push(x);
        }
        System.out.println(St);

        Stack<Integer>gt = new Stack<>();
        while(St.size()>0){
            int x = St.peek();
            gt.push(x);
            St.pop();
        }
        System.out.println(gt);

        Stack<Integer>rt = new Stack<>();
        while(gt.size()>0){
            int x = gt.peek();
            rt.push(x);
            gt.pop();
        }
        System.out.println(rt);
    }
}

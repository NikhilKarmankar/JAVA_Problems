package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class ReverseKElements {
    public static void main(String[] args) {
        Queue<Integer>Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(5);
        Q.add(8);
        System.out.println(Q);
        Stack<Integer>St = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = input.nextInt();
        int n = Q.size();
        for(int i=0;i<k;i++){
            St.push(Q.remove());
        }
        while(St.size()>0){
            Q.add(St.pop());
        }
        for(int i=0;i<n-k;i++){
            Q.add(Q.remove());
        }
        System.out.println(Q);


    }
}

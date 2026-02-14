package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseElementsInQueue {
    public static void main(String[] args) {
        Queue<Integer>Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(5);
        Q.add(8);
        System.out.println(Q);
        Stack<Integer>St = new Stack<>();
        while(Q.size()>0){
            St.push(Q.remove());
        }
        while(St.size()>0){
            Q.add(St.pop());
        }
        System.out.println(Q);
    }
}

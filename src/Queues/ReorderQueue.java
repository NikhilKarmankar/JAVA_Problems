package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        Stack<Integer>St = new Stack<>();
        int n = q.size();
        for(int i=1;i<=n/2;i++){
            St.push(q.remove());
        }
        while(St.size()>0){
            q.add(St.pop());
        }
        for(int i=1;i<=n/2;i++){
            St.push(q.remove());
        }
        for(int i=1;i<=n/2;i++){
            q.add(St.pop());
            q.add(q.remove());
        }
        while(q.size()>0){
            St.push(q.remove());
        }
        while(St.size()>0){
            q.add(St.pop());
        }
        System.out.println(q);
    }
}

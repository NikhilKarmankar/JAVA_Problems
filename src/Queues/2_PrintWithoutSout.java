package Queues;

import java.util.LinkedList;
import java.util.Queue;

class PrintWithoutSout {
    //Display
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(9);
        q.add(8);
        q.add(2);
        //System.out.println(q.peek());
        Queue<Integer>Qr = new LinkedList<>();
        while(q.size()>0){
            System.out.println(q.peek());
            Qr.add(q.remove());
        }
        while (Qr.size()>0){
            q.add(Qr.remove());
        }

    }
}

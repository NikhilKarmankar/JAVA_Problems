class Removing_Nth_Node_From_End {
    public  static class nthNodeFromEnd {
        public static Node FindnthNode(Node head,int n){
            int size = 0;
            Node temp = head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            int m = size - n + 1; //mth node from start

            temp = head;
            for (int i = 1;i<m;i++){
                temp = temp.next;
            }
            return temp;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(46);
        Node c = new Node(23);
        Node d = new Node(89);
        Node e = new Node(96);
        Node f = new Node(52);
        Node g = new Node(59);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node temp = nthNodeFromEnd.FindnthNode(a,3);
        System.out.println(temp.data);



    }
}

class reverse_list {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);

        head.next.next = head; // interchanging the connection
        head.next = null;
        return newHead;
    }

    public static void displayrev(Node head){
        if(head == null) return ;                          //base case
        //System.out.print(head.val + " ");
        displayrev(head.next);                                //call
        System.out.println(head.val + " ");                   // work


    }

    public static void display(Node head){
        if(head == null) return ;                          //base case
        System.out.print(head.val + " ");
        display(head.next);                                //call
        //System.out.print(head.val + " ");                   // work
    }


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);

        Node r = reverse(a);
        System.out.println("Reverse List: ");
        display(r);


    }
}

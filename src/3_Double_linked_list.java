class Double_linked_list {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static Node insertAtBetween(Node head,int data,int pos){
        if(head ==null) return null ;
        Node t = new Node(data);
        Node temp = head;
        for(int i = 1;i<pos-1 &&temp!=null;i++){
            temp = temp.next;
            t.next = temp.next;
            t.prev = temp;
            temp.next.prev = t;
            temp.next = t;

        }
        return head;

    }
    public static Node insertAtHead(Node head){
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAttail(Node head,int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static Node DeleteHead(Node head){
        if(head==null) return null;
        Node newHead = head.next;
        if(newHead != null){
            newHead.prev=null;
        }
        head.next = null;
        return newHead;
    }
    public static Node deleteTail(Node head){
        if(head == null ||head.next ==null)return null;
        Node temp = head;
        while(temp.next != null) temp =temp.next;
        temp.prev.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        display(a);
//        displayrev(e);
//        display2(c);
//        Node head = a;
//        head = insertAtBetween(head,43,3);
//        display(a);
//        Node newhead = insertAtHead(a);
//        display(newhead);
//        insertAttail(a,90);
//        display(a);
//        a = DeleteHead(a);
//        display(a);
        Node head = a;
        head = deleteTail(head);
        display(head);

    }
}

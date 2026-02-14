class PalindromeDoublyLinkedList{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }

    }

    public static boolean ispanlindrome(Node head){

        if(head == null|| head.next == null)return true;

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        while(head != tail && head.prev != tail){
            if(head.val != tail.val){
                return false;
            }
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(43);
        Node b = new Node(57);
        Node c = new Node(54);
        Node d = new Node(89);
        Node e = new Node(9);
        //a.prev = e;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
       // e.next = a;
        if(ispanlindrome(a)){
            System.out.println("palindrome is doubly linked list");
        }else{
            System.out.println("Not palindrome");
        }

    }
}

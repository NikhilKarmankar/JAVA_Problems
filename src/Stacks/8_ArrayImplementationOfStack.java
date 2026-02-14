package Stacks;

class ArrayImplementationOfStack {
    public static class Stack{

        private int arr[] = new int[5];
        private int idx = -1;
        void push  (int x){
            if(isfull()){
                System.out.println("Stack is full:");
                return ;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty:");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty:");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else{
                return false;
            }
        }
        boolean isfull(){
            if(idx == arr.length){
                return true;
            }
            else{
                return false;
            }
        }
        int capacity(){
            return arr.length;
        }

    }
    public static void main(String[] args) {
        Stack St = new Stack();
        St.push(4);
        St.display();
        St.push(9);
        St.pop();


    }
}

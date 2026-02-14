package Queues;

class ArrayImplementationOfCircularQueue {
    public static class CircularQueueArray{
        int front = -1;
        int rear = -1;
        int size = 0;
        int []arr = new int[10];
        public void add(int val)throws Exception{
            if(size == arr.length){
                throw new Exception("queue is full");
            }
            else if(size==0){
                front = rear = 0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0]= val;
            }
            size++;
        }
        public int remove()throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }else{
               int val = arr[front];
               if(front == arr.length-1)front=0;
               else front++;
               size--;
               return val;

            }

        }
        public int peek()throws Exception{
            if(size==0){
                throw new Exception("Queue is empty:");
            }else{
                return arr[front];
            }
        }
        public boolean isempty(){
            if(size==0){
                return true;
            }else{
                return false;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            } else if (front<=rear) {
                for(int i = front;i<=rear;i++){
                    System.out.println(arr[i]+" ");
                }
            } else if (rear<front) {
                for(int i=front;i< arr.length;i++){
                    System.out.println(arr[i]+" ");
                }
                for(int i=0;i<= rear;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        CircularQueueArray q = new CircularQueueArray();
        try {
            q.display();
            q.display();
            q.add(1);
            q.add(2);
            q.add(6);
            q.add(9);
            q.add(10);
            q.display();
            q.remove();
            q.display();
            System.out.println(q.peek());
            System.out.println(q.isempty());
        }catch (Exception e){
            System.err.println("Error:"+ e.getMessage());
        }

    }
}

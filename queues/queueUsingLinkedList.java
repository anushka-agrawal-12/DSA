package queues;

public class queueUsingLinkedList {
    public class Node{
        Node next;
        int val;

        Node(int val){
            this.val=val;
        }
    }
    public class Queue{
        Node front;
        Node rear;

        Queue(){
            front=null;
            rear=null;
        }

        public void enqueue(int x){
            Node newNode = new Node(x);
            if(front==null){
                rear=newNode;
                front=newNode;
            }
            else{
                rear.next = newNode;
                 rear=rear.next;
            }
            
        }

        public int dequeue(){
            if(front==null){
                System.out.println("queue is Empty");
                return -1;
            }
            else if(front==rear){
                int value = front.val;
                front = null;
                rear = null;
                return value;
            }
            else{
                int value = front.val;
                front=front.next;
                return value;
            }
        }

        public int peek(){
            if(front==null){
                System.out.println("queue is empty");
                return -1;
            }
            return front.val;
        }
        public boolean isEmpty(){
            return front==null;
        }
    }
}

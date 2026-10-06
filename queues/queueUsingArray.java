package queues;

public class queueUsingArray {
    public class Queue {
    int[] arr;
    int size;
    int front;
    int rear;

        Queue(int size){
            this.size= size;
            arr=new int[size];
            front=0;
            rear=-1;
        }

        public void enqueue(int x){
            if(rear==arr.length-1){
                System.out.println("queue is full");
            }
            else{
                rear++;
                arr[rear]=x;
            }
        }

        public int dequeue(){
            if(front>rear){
                System.out.println("queue is empty");
            }
            else{
                int value = arr[front];
                front++;
                return value;
            }
            return -1;
        }

        public int peek(){
            if(front>rear){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            return front>rear;
        }

    }


       

   
}

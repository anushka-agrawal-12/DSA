package queues;

public class circularQueue {
    public class circularQueue{
        int[] arr;
        int size;
        int front;
        int rear;
        int count;

        circularQueue(int size){
            this.size=size;
            arr=new int[size];
            front=0;
            rear=-1;
            count=0;
        }

        public void enqueue(int x){
            if(count==size){
                System.out.println("queue is full");
            }
            else{
                rear=(rear+1)%size;
                arr[rear]=x;
                count++;
            }
        }

        public int dequeue(){
            if(count==0){
                System.out.print("queue if empty");
                return -1;
            }
            else{
                int value = arr[front];
                front=(front+1)%size;
                count--;
                return value;
            }
        }
        public int peek(){
            if(count==0){
                System.out.print("queue is Empty");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            return count==0;
        }
        public boolean isFull(){
            return count==size;
        }
    }
}

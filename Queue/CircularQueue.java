    package Queue;

    public class CircularQueue{
        int [] arr;
        int front;
        int rear;
        int size;

        public CircularQueue(int size){
            this.size = size;
            this.arr = new int[size];
            this.front = 0;
            this.rear = -1;
        }

        public void enqueue(int data){
            if(isFull()){
                System.out.println("Overflow!");
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Underflow!");
            }
            int val = arr[front];
            front = (front+1)%size;
            return val;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow!");
            }
            return arr[front];
        }

        public boolean isEmpty(){
            return this.arr.length == 0;
        }
        public boolean isFull(){
            return this.arr.length == size;
        }

        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            System.out.println();
        }

    }
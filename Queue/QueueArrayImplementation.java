package Queue;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class QueueDS{
   private int rear = -1;
   private int front = 0;
   private int queueArr [];

    QueueDS(int size){
        queueArr= new int[size];
    }

    void enqueue(int value){
        if(rear == queueArr.length){
            System.out.println("Overflow!");
        }
        else{
            rear++;
            queueArr[rear] = value;
        }
    }

    int dequeue(){
        if(front > rear){
            System.out.println("Underflow");
        }
        return  queueArr[front++];
    }

    void display(){
        int traverser = front;
        while(traverser <=rear){
            System.out.print(queueArr[traverser++]+" ");
        }
        System.out.println();
    }

    int frontElement(){
        return queueArr[front];
    }

    int rearElement(){
        return queueArr[rear];
    }
}

public class QueueArrayImplementation {
    
    public static void main(String[] args) {
        int size = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the capacity of the queue --> ");
        try{
          size =  Integer.parseInt(input.readLine());
          if(size < 0){
            throw new IOException("Undersized");
        }
        QueueDS q1 = new QueueDS(size);
        q1.enqueue(Integer.parseInt(input.readLine()));
        q1.enqueue(Integer.parseInt(input.readLine()));
        q1.enqueue(Integer.parseInt(input.readLine()));
        q1.enqueue(Integer.parseInt(input.readLine()));
        q1.dequeue();
        q1.display();
        System.out.println(q1.rearElement());
        System.out.println(q1.frontElement());

        }
        catch(IOException io){
            io.printStackTrace();
        }

    }

}

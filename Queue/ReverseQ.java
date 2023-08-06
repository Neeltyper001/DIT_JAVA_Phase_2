package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQ {
    
    static Queue<Integer> reverseQ(Queue<Integer> q , int value){

        if(q.isEmpty()){
            q.add(value);
        }
        
        int data = q.remove();
        q = reverseQ(q, data);
        q.add(value);
        return q;
    }

    static Queue<Integer> reverseQ(Queue<Integer> q ){
        return reverseQ(q, q.remove());
    }
    
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        for(int i=1 ; i<=4; i++){
            q1.add(i*10);
        }
        System.out.println(reverseQ(q1));
    }
}

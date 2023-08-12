package Queue;

import java.util.LinkedList;
import java.util.Queue;

class Stacks{
    Queue<Integer>q1;
    Queue<Integer>q2;

         Stacks(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    void push(int data){
        q2.add(data);

        while(!(q1.isEmpty())){
            q2.add(q1.remove());
        }

        while(!(q2.isEmpty())){
            q1.add(q2.remove());
        }
    }

    void print(){
        while(!(q1.isEmpty())){
            System.out.println(q1.remove());
        }
    }

    int pop(){
        return q1.remove();
    }

    void top(){
        System.out.println(q1.peek());
    }

    boolean isItEmpty(){
        return q1.isEmpty();
    }

    int theSize(){
        return q1.size();
    }

}
public class StackImpQueue {
    public static void main(String[] args) {
        Stacks stk = new Stacks();
        stk.push(20);
        stk.push(30);
        stk.push(50);
        stk.top();
        System.out.println(stk.isItEmpty());
        System.out.println(stk.theSize());
        System.out.println(stk.pop());  
        stk.top();

    }
}

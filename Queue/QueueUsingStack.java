package Queue;
import java.util.Stack;

 class QUsingStack{
        Stack<Integer> st1; 
        Stack<Integer> st2;

        QUsingStack(){
            st1 = new Stack<>();
            st2 = new Stack<>();
        }
        
        
     void push(int data){
        st2.push(data);
        
        while(!(st1.isEmpty())){
            st2.push(st1.pop());
        }

        while(!(st2.isEmpty())){
            st1.push(st2.pop());
        }
    }

     int peek(){
        return st1.peek();
    }
}
public class QueueUsingStack {
   
    public static void main(String[] args) {    

         QUsingStack obj = new QUsingStack();
         obj.push(20);
         obj.push(30);
         obj.push(40);
         System.out.println(obj.peek());
    }
}

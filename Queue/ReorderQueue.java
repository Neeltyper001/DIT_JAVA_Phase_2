package Queue;

import java.util.Queue;
import java.nio.file.WatchEvent;
import java.util.LinkedList;
import java.util.Stack;
public class ReorderQueue {
    static void reorder(Queue<Integer> queue){
        if(queue.size()%2 != 0)
            System.out.println("Cannot REORDER");

        else{
            Queue<Integer> temp = new LinkedList<>();
            int hs = queue.size()/2;
            for(int i=0; i<hs; i++){
                temp.add(queue.poll());
            }
            while(!temp.isEmpty()){
                queue.add(temp.poll());
                queue.add(queue.poll());
            }
        }
    }

    static void reorderStack(Queue<Integer> queue){
                if(queue.size()%2 != 0)
            System.out.println("Cannot REORDER");

            else{
                Stack<Integer> stk = new Stack();
                int hs = queue.size()/2;
                for(int i=0; i<hs; i++){
                    stk.push(queue.poll());
                }
                
                while(!(stk.isEmpty())){
                    queue.add(stk.pop());
                }

                for(int i=0; i<hs; i++){
                    stk.push(queue.poll());
                }
                                
                while(!(stk.isEmpty())){
                    queue.add(stk.pop());
                    if(!(stk.isEmpty()))
                        queue.add(queue.poll());
                        
                }
            }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        // reorder(queue);
        reorderStack(queue);
        for(int i: queue){
            System.out.print(i+" ");
        }
        
    }
}

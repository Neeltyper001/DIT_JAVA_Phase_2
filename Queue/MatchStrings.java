package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class MatchStrings {

        static void matchIt(int arr[] , Queue<Integer> q1){
            
            int pointer = 0;
            int counter = 0;
            int totalMatches = 0;
            while(pointer < arr.length){
                
                if(arr[pointer] == q1.peek()){
                    pointer++;
                    q1.remove();
                    totalMatches+=1;
                }

                else{
                     if(counter == arr.length){
                        break;
                     }

                     else{
                        q1.add(q1.poll());
                        counter++;
                     }
                }
            }

            System.out.println(totalMatches);
        }
        public static void main(String[] args) {

            int arr1 [] = {1,1,0};
            Queue<Integer> q1 = new LinkedList<>();
            q1.add(0);
            q1.add(1);
            q1.add(0);
            matchIt(arr1, q1);
    }
}

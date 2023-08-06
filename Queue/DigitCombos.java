package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class DigitCombos {
    
    static void digitCombos(int arr[]){

        Queue<String> q = new LinkedList<>();
        for(int i: arr){
            q.offer(i+"");
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                q.offer(q.remove()+arr[j]);
                q.offer(arr[j]+q.remove());
            }
        }

        System.out.println(q);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        digitCombos(arr);
    }
}

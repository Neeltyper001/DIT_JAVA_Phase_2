package Heap;
import java.util.PriorityQueue;

 class MinDifference {

    static int minDiff(int arr[]){
        if(arr.length <= 1){
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i: arr){
            minHeap.offer(i);
        }
    
        int min = Integer.MAX_VALUE;
        int top = minHeap.poll();
        while(!minHeap.isEmpty()){
            int current = minHeap.poll();
            int diff = current - top;
            min = Math.min(min,diff);
            top = current;
         }
         return min;
    }

    public static void main(String[] args) {
        int arr[] = {};
        int ans = minDiff(arr);
        System.out.println(ans);
        String str = "sted";
        char arr1[] = str.toCharArray();

    }
}

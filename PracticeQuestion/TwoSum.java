package PracticeQuestion;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        // for(int i=0; i<arr.length; i++){
        //     for(int j= i+1; j<arr.length; j++){
        //         int sum = arr[i] + arr[j];
        //         if(sum == target){
        //             System.out.println("Two sum "+arr[i]+" "+arr[j]);
        //             return;
        //         }
        //     }
        // }

        // Approach - 2 Sort the array and use the two pointer approach
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while(low<high){
            if(arr[low] + arr[high] == target){
                System.out.println("Two sum");
                System.out.println(arr[low] +" "+arr[high]);
                return;
            }

            if(arr[low] + arr[high] < target){
                low++;
            }
            else if(arr[low] + arr[high] > target){
                high--;
            }
        }
    }
}

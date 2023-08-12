package PracticeQuestion;
import java.io.*;


public class TestMain {
    public static void main(String[] args) throws IOException {
        Solution t = new Solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine()); 

        int arr[] = new int[n];
        while(n!=0){
            arr[arr.length-n] =  Integer.parseInt(br.readLine()); 
            n--;
        }

        int result = t.print2largest(arr, arr.length);
        System.out.println(result);
    }

}

class Solution{
    public int print2largest(int arr[],int n){
        int firstMax = arr[0];
        int secondMax = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > firstMax){
                firstMax = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
 }


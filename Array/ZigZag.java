package Array;

public class ZigZag {
    
    static int [] swap(int arr[] , int val1, int val2){

        int temp;
        temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};
        int first = 0;
        int second = 1;
        int third = 2;

        while(third < arr.length ){

            if(arr[first] > arr[second]){
                arr = swap(arr , first , second);
            }

            if(arr[second] < arr[third]){
                arr = swap(arr, second , third);
            }

            first+=2;
            second+=2;
            third+=2;
        }

        for(int eachNum: arr){
            System.out.print(eachNum+" ");
        }
    }
}

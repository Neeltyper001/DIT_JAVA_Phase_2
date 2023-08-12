package Array;

public class SortZeroOne {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,1,1,0,1,0,0};

        int count =0;
        for(int element: arr){
            if(element == 0){
                count++;
            }
        }

        for(int i=0; i<count; i++){
            arr[i] = 0;
        }

        for(int i=count; i<arr.length; i++){
            arr[i] = 1;
        }

        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}

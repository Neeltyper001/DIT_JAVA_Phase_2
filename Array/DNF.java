package Array;

public class DNF {
    
    public static void main(String[] args) {
        int arr[] = {2,1,0,2,0,2};
        int resultArr[] = new int[arr.length];

        int low = 0;
        int mid = 0;
        int high = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                low++;
            }
            if(arr[i] == 1){
                mid++;
            }
            if(arr[i] == 2){
                high++;
            }
        }

        low = low - 1;
        mid += low;
        high += mid;

        for(int i=0 ; i<arr.length; i++){
            if(arr[i] == 0){
                resultArr[low--] = arr[i];
            }
            if(arr[i] == 1){
                resultArr[mid--] = arr[i];
            }
            if(arr[i] == 2){
                resultArr[high--] = arr[i];
            }
        }

        
        for(int eachNum: resultArr){
            System.out.print(eachNum+" ");
        }
        
    }
}

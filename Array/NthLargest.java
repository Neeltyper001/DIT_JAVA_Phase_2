package Array;

public class NthLargest {
    public static void main(String[] args) {
        int arr[] = {23,45,6,2,32,89,54,2,8};
        int nthPointer = arr.length;
        int nth = 5;
        int result = 0;
                
        if(arr.length < nth){
            System.out.println("Cannot find due to insufficient data");
        }

        else{

            for(int i=0; i<nth; i++){
                int max = arr[0];
                int index = 0;
                for(int j=0; j<nthPointer; j++){
                    if(max < arr[j]){
                        max = arr[j];
                        index = j;                        
                    }
                }
                result = max;
                int temp = arr[nthPointer - 1];
                arr[nthPointer - 1] = max;
                arr[index] = temp;
                nthPointer--;
            }
            
            System.out.println();
            System.out.println(nth+" largest is : "+result);
        }
    }
}

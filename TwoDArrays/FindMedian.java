package TwoDArrays;

public class FindMedian {
    public static void main(String[] args) {
        int totalNums = 0;
        int arr1[] = {1,2};
        int arr2[] = {2,3,5};         
        totalNums = arr1.length + arr2.length;
         int result [] = new int[totalNums];
         int n = 0, m = 0;
        if(totalNums % 2 == 0){
            n = totalNums/2;
            m = totalNums/2 - 1;
        }

        else{
            n = totalNums + 1 /2;
            m = 0;
        }
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }

           else if(arr1[i] > arr2[j]){
                result[k] = arr2[j];
                k++;
                j++;
            }   
            
            else if(i<arr1.length){
                result[k] = arr1[i];
                i++;
                k++;
            }
            else if(j<arr2.length){
                result[k] = arr2[j];
                j++;
                k++;
            }

        }
            double ans = (arr1[n] + arr2[m])/2;
    }
}

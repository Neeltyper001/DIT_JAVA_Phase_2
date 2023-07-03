package Array;

public class AddSubArrays {
    // add arrays is supported only for the two same size of arrays
    static int [] addArrays(int arr1[] , int arr2[]){
        int result[];
        int carry;
        boolean isCarry = false;

        if(arr1[0] + arr2[0] >= 9){
            result = new int[arr1.length + 1];
        }

        else{
            result = new int[arr1.length];
        }
        
        for(int i=arr1.length - 1; i>=0; i--){
            carry = isCarry ? 1 : 0;
            int sumOfIndices = arr1[i] + arr2[i] + carry;

            if(sumOfIndices >= 10 && i!=0){
                result[i+1] = sumOfIndices % 10;
                isCarry = true;
            }

            else{
                result[i+1] = sumOfIndices;   
                isCarry = false;             
            }
        }
// Last check up for getting the carry

        if(arr1[0] + arr2[0] >= 9){
            result[0] = 1;
            result[1] = result[1] % 10;
        }

        return result;
    }


    static int[] subtrArrays(int arr1[] , int arr2[]){
        int result [] = new int[arr1.length];

        for(int i=arr1.length - 1; i>=0; i-- ){
                // logic of borrowing
            if(arr1[i] < arr2[i]){
                result[i] = 10 + arr1[i] - arr2[i];
                arr1[i-1] = arr1[i-1] - 1;
            }

            else{
                result[i] = arr1[i] - arr2[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {9,2,7,4};
        int arr2[] = {5,4,4,5};
        // Addition of two arrays
        System.out.print("Addition: ");System.out.print("Addition: ");
        for(int elements : addArrays(arr1,arr2)){
            System.out.print(elements+" ");
        }
        System.out.println();
        // Subtraction of two arrays
        System.out.print("Subtraction: ");
        for(int elements: subtrArrays(arr1, arr2)){
            System.out.print(elements+" ");
        }
    }
}

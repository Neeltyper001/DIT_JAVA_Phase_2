package Recursion;
public class LocateAllOccurence {

    // static int [] arrOfIndexes = new int[7];
    // static int locs = 0;

    // static void printArr(int indexNo){
    //     if( arrOfIndexes.length == indexNo){
    //         return;
    //     }
    //     System.out.print(arrOfIndexes[indexNo]+" ");
    //     printArr(indexNo + 1);
    // }

    // Stack building Approach

    static void locateAllOccurence(int arr[] , int index, int search ){
        if(index < 0){
            return;
        }

        if(arr[index] == search){
            // arrOfIndexes[locs] = index;            
            // ++locs;     
            System.out.print(index+" ");       
        }

        locateAllOccurence(arr, index - 1, search );
    }

    static void locateAllOccurence(int arr[] , int search){
        locateAllOccurence(arr, arr.length - 1, search );
    }

    // Stack Falling Apporach
    static void locateAllOccurences(int arr[] , int index, int search){
        if(index < 0){
            return;
        }

        locateAllOccurences(arr, index -1 , search);
        if(arr[index] == search){
            System.out.print(index+" ");
        }

        return;
    }

    static void locateAllOccurences(int arr[] , int search){
        locateAllOccurences(arr , arr.length - 1 , search);
    }

    public static void main(String[] args) {
        int arr [] = {1, 1, 6 , 7 , 1, 4, 10};
        locateAllOccurence(arr, 1);
        System.out.println();
        locateAllOccurences(arr, 1);
    }
}

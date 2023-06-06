package Recursion;
public class LocateAllOccurence {

    static int [] indexesArr;

    // Stack building Approach

    static void locateAllOccurence(int arr[] , int index, int search ){
        if(index < 0){
            return;
        }

        if(arr[index] == search){
            indexesArr[indexesArr.length - 1] = index;
        }

        locateAllOccurence(arr, index - 1, search);
    }

    static void locateAllOccurence(int arr[] , int search){
        locateAllOccurence(arr, arr.length - 1, search);
    }

    public static void main(String[] args) {
        int arr [] = {1, 1, 6 , 7 , 1, 4, 10};
        locateAllOccurence(arr, 1);
        for(int i: indexesArr){
            System.out.print(i+" ");
        }
    }
}

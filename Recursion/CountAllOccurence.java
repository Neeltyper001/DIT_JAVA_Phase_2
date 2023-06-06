package Recursion;

public class CountAllOccurence {
    
    static void countAllOccurence(int arr[] , int index , int count , int search){
        if(index < 0){
            System.out.println("The total count "+count);
            return ;
        }

        if(arr[index]  == search){
            count+=1;
        }

        countAllOccurence(arr, index - 1 , count, search);
    }

    static void countAllOccurence(int arr[] , int search){
        countAllOccurence(arr, arr.length - 1, 0, search);
    }

    public static void main(String[] args) {
        int arr [] = {1, 1, 6 , 7 , 1, 4, 10};
        countAllOccurence(arr, 1);
    }
}

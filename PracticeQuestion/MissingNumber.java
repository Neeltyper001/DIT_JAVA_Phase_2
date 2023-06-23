package PracticeQuestion;

public class MissingNumber {
      static  int missingNumber(int array[], int n) {
        
        return ((n*(n+1))/2) - sumOfNumbers(array , array.length - 1) ;
    }
    
   static int sumOfNumbers(int array[] , int index){
        if(index == 0){
            return array[index];
        }
        
        int smallSum = sumOfNumbers(array , index - 1) + array[index];
        return smallSum;
    }

    public static void main(String[] args) {
        int array [] = {1,2,3,5};
        int N= 5;
        System.out.println(missingNumber(array , N));
    }
}
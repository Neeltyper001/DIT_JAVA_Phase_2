package Array;

public class ThirdLargest {
    
    public static void main(String[] args) {
        int arr [] = {5,1,88,23,69,3};

        int firstLarge = arr[0];
        int secondLarge = arr[0];
        int thirdLarge = arr[0];

        if(arr.length <=2){
            System.out.println("Cannot Decide due to insufficient numbers");
        }

        else{
            for(int i=0; i<arr.length; i++){
                if(arr[i] > firstLarge){
                    firstLarge = arr[i];
                }
            }        
            for(int i=0; i<arr.length; i++){
                if(arr[i] > secondLarge && arr[i] != firstLarge){
                    secondLarge = arr[i];
                }
            }
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] > thirdLarge && arr[i] != secondLarge && arr[i] != firstLarge){
                    thirdLarge = arr[i];
                }
            }

            System.out.println(thirdLarge);
        }

    }
}

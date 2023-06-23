package PracticeQuestion;

public class BarChart {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = {2,1,7,9,0};

        for(int element: arr){
            if(element>max){
                max = element;
            }
        }

        int min = 1;

        for(int i = max ; i>= min ; i--){
            for(int j=0; j<arr.length; j++){
                if(i<=arr[j]){
                    System.out.print("*     ");
                }

                else{
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }

}

package Array;

class MissingNum{

    static int sumOfElems(int arr[]){
        int sum = 0;
        for(int elements : arr){
            sum+=elements;
        }

        return sum;
    }

    public static void main(String[] args) {
        int N = 10;
        int arr[] = {6,1,2,8,3,4,7,10,5};
        int MissingNum = (N*(N + 1))/2 - (sumOfElems(arr));
        System.out.println(MissingNum);
    }
}
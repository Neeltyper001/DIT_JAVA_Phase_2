package ArrayRecursion;

public class ProductOfAllNumbers {

    static int productNums(int inputArr [] , int index){
        if(index < 0){
            return 1;
        }

        int subResult = inputArr[index]*(productNums(inputArr, index -1));
        return subResult;
    }

    public static void main(String[] args) {
        int  [] inputArr = {8, 4 , 2 , 1 , 3};
        System.out.println("Product is : "+productNums(inputArr, inputArr.length - 1));
    }
}

package Backtracking;
import java.util.List;
import java.util.ArrayList;
public class CombinationSum {
    
    static void combinationSum(int index , int candidates[] ,  int target , int sum,  List<Integer> subResult , List<List<Integer>> result){
        if(sum == target){
            List<Integer> smallAns = new ArrayList<>(subResult);
            result.add(smallAns);
            System.out.println(result);
        }

       else if(index == candidates.length){
            return;
        }
       

       else if( sum > target){
            return;
        }

        else{

            subResult.add(candidates[index]);
            sum = sum + subResult.get(subResult.size() - 1);
            combinationSum(index, candidates, target, sum, subResult, result);
            sum = sum - subResult.get(subResult.size()- 1);
            subResult.remove(subResult.size() - 1);
            combinationSum(index + 1, candidates, target, sum, subResult, result);
        }

    }

    static List<List<Integer>> combinationSum(int candidates[] , int target){

            List<List<Integer>> result = new  ArrayList<>();
            List<Integer> subResult = new ArrayList<>();

            combinationSum(0 ,candidates , target , 0, subResult , result);
            return result;
    }

    public static void main(String[] args) {
        int inputArr [] = {2,3,6,7};
        System.out.println(combinationSum(inputArr, 7));
    }
}

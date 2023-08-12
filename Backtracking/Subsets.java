package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void subsets(int idx ,int nums[], List<Integer> subResult , List<List<Integer>> result ){
        // Some termination condition
        if(idx == nums.length){
                List<Integer> smallAns = new ArrayList<>(subResult);
                result.add(smallAns);                
        }

        else{

            subResult.add(nums[idx]);
            subsets(idx + 1, nums ,subResult, result); 
            subResult.remove(subResult.size() - 1);
            subsets(idx + 1, nums ,subResult, result);
        }
    }   
    static List<List<Integer>> subsets(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subResult = new ArrayList<>();
          subsets(0, nums, subResult, result);
          return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
         System.out.println(subsets(nums));   
    }
}

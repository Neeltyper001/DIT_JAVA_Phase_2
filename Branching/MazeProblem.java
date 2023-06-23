package Branching;

import java.util.ArrayList;
// Using Stack Fall Approach
public class MazeProblem {
    
    static ArrayList<String> mazeProblem(int right , int down){

        if(right == 2 && down == 2){
            ArrayList<String> smallResult = new ArrayList<>();
            smallResult.add("");
            return smallResult;
        }

        if(right > 2 || down > 2){
            ArrayList<String> smallResult = new ArrayList<>();
            return smallResult;
        }

        ArrayList<String>finalResult = new ArrayList<>();
        
        ArrayList<String>rightResult = mazeProblem(right + 1, down);
        for(String strs: rightResult){
            finalResult.add(strs + 'R');
        }

        ArrayList<String>downResult = mazeProblem(right , down + 1);
        for(String strs: downResult){
            finalResult.add(strs + 'D');
        }
        
        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(mazeProblem(0,0));
    }
}

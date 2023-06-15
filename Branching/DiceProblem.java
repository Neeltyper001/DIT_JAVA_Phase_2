package Branching;
import java.util.ArrayList;

public class DiceProblem {

    static ArrayList<String> diceProblem(int currentValue , int endValue){

        if(currentValue == endValue){
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add("");
            return arrList;
        }

        if(currentValue > endValue){
            ArrayList<String>arrList  = new ArrayList<>();
            return arrList;
        }

        ArrayList<String> finalResult = new ArrayList<>();

        for(int i=1 ; i<= 6; i++){
            ArrayList<String> result = diceProblem(currentValue + i , endValue);
            for(String elem: result){
                finalResult.add(elem + i);
            }
        }

        return finalResult;
    }

    public static void main(String[] args) {
        System.out.print(diceProblem(0, 10));
    }
}

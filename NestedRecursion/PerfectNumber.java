package NestedRecursion;
import java.util.ArrayList;
public class PerfectNumber {

    static ArrayList<Integer> perfectNums(int num){

        ArrayList<Integer> perfectNumList = perfectNums(num, num);
        return perfectNumList;
        
    }
    
    static ArrayList<Integer> perfectNums(int num, int eachNums){
        if(eachNums == 1){
            ArrayList<Integer> perfectNumList = new ArrayList<>();
            perfectNumList.add(perfectNum(eachNums));
            return perfectNumList;
        }

        ArrayList<Integer> perfectNumList = perfectNums(num, eachNums - 1);
        perfectNumList.add(perfectNum(eachNums));

        return perfectNumList;
    }

    static int perfectNum(int num){
        int sumOfDivs = 0;
        ArrayList<Integer>divisors = numDivisors(num, num);

        for(int val: divisors ){
            sumOfDivs += val;
        }


        if(num == sumOfDivs){
            return  num;
        }

        return 0;
    }

    static ArrayList<Integer> numDivisors(int num, int testDiv){

        if(testDiv == 1){
            ArrayList<Integer>divs = new ArrayList<>();
            divs.add(testDiv);
            return divs;
        }

        ArrayList<Integer> result = numDivisors(num, num - 1);
        if(num % testDiv == 0){
            result.add(testDiv);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(perfectNums(10));
    }
}

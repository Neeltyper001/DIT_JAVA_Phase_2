package NestedRecursion;

import java.io.*;
import java.util.*;

class Solution {
    public ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                perfectNumbers.add(i);
            }
        }
        
        return perfectNumbers;
    }
    
    private boolean isPerfectNumber(int num) {
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
}


public class PerfectNumber2 {
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading N
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }

}

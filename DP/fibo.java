package DP;

public class fibo {
    static int fiboMemorisation(int n, int cache []){

        if(n <=1){
            return n;
        }

        if(cache[n] != 0){
            return cache[n];
        }

        int first = fiboMemorisation(n-1 , cache);
        int second = fiboMemorisation(n-2 , cache);
        int result = first  + second;
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int cache [] = new int[n+1];
        System.out.println(fiboMemorisation(n, cache));
    }
}

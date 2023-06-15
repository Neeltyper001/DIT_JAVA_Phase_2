package Branching;

public class Fibonacci {
    
    static int fibo(int num){
        if(num <= 1){
            return num;
        }

        int result = fibo(num - 1) + fibo(num - 2);        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}

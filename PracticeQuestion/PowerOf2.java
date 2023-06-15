package PracticeQuestion;

public class PowerOf2 {
    static boolean powerOf_2_Iterative(int num){    
        while(num >= 1){

        if(num == 1){
            return true;
        }


        if(num % 2 == 0){
            num /=2;
        }

            else{
                return false;
            }
            
        }

        return false;
    }

    static boolean powerOf_2_Recursive(int num){

        if(num == 1){
            return true;
        }

        if(num % 2 == 1){
            return false;
        }

        boolean result = powerOf_2_Recursive(num/2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOf_2_Iterative(82));
        System.out.println(powerOf_2_Recursive(7));
    }
}

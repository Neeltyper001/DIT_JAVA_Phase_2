package PracticeQuestion;

public class PowerOf3 {
        static boolean powerOf_3_Iterative(int num){   
        
        if(num > 0){

            while(num >= 1){
    
            if(num == 1){
                return true;
            }
    
    
            if(num % 3 == 0){
                num /=3;
            }
    
                else{
                    return false;
                }
                
            }
        }
            

        return false;
    }

    static boolean powerOf_3_Recursive(int num){

        if(num <= 0){
            return false;
        }

        if(num == 1){
            return true;
        }

        if(num % 3 != 0){
            return false;
        }

        boolean result = powerOf_3_Recursive(num/3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOf_3_Iterative(27));
        System.out.println(powerOf_3_Recursive(82));
    }
}

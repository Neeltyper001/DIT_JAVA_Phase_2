package PracticeQuestion;

public class PowerOf4 {
            static boolean powerOf_4_Iterative(int num){   
        
        if(num > 0){

            while(num >= 1){
    
            if(num == 1){
                return true;
            }
    
    
            if(num % 4 == 0){
                num /=4;
            }
    
                else{
                    return false;
                }
                
            }
        }
            

        return false;
    }

    static boolean powerOf_4_Recursive(int num){

        if(num <= 0){
            return false;
        }

        if(num == 1){
            return true;
        }

        if(num % 4 != 0){
            return false;
        }

        boolean result = powerOf_4_Recursive(num/3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOf_4_Iterative(36));
        System.out.println(powerOf_4_Recursive(32));
    
    }
}

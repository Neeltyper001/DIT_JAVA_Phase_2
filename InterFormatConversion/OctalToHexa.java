package InterFormatConversion;

class OctalToHexa {

    static int octalToDecimal(int num , int count){
        if(num == 0){
            return 0;
        }

        int bit = num % 10;
        int result = bit * (int)Math.pow(8,count) + octalToDecimal(num/10, count + 1);
        return result;
    }

    static int octalToDecimal(int num){            
        return octalToDecimal(num , 0);
    }

        static void decimalToHexa(int num , StringBuilder result){
        if(num == 0){
            System.out.println(result.reverse());
            return;
        }

        int rem = num % 16;                
        if(rem >= 10){ 

            result.append((char)(rem - 10 + 97));         
        }

        else{
            result.append(rem);
        }

        decimalToHexa(num/16, result);
    }

    static void decimalToHexa(int num){
        decimalToHexa(num, new StringBuilder(""));
    }

    static void octalToHexa(int num){
        decimalToHexa(octalToDecimal(num));
    }

    public static void main(String[] args) {
        octalToHexa(370);
    }
}
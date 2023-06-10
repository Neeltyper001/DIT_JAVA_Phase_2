package InterFormatConversion;

public class test {

        static int rawDecimalToBinary(int num){

        if(num == 0){
            return 0;
        }

        // int quotient = num / 2;
        int remainder = num % 2;
        int result = 10*rawDecimalToBinary(num / 2) + remainder;
        return result;
        
    }

    static int countBinaryStrings(int num){
        if(num == 0){
            return 0;
        }

        int count = countBinaryStrings(num/10);
        return ++count;

    }

    static StringBuilder formattedBinary(int rawBinary , int count){
        if(count == 0){
            return new StringBuilder(""+rawBinary);
        }

        StringBuilder result = formattedBinary(rawBinary, count - 1).insert(0,"0");
        return result;
    }

    static StringBuilder properDeciamlToBinary(int num){
        // int rawBinary = rawDecimalToBinary(num);
        int count = countBinaryStrings(rawDecimalToBinary(num));
        if(count % 4 == 0){
            count = 0;
        }
        else{
            count = 4 - (count % 4);
        }
        return formattedBinary(rawDecimalToBinary(num), count);
    }
    public static void main(String[] args) {
        // int val = 101;
        // StringBuilder sb = new StringBuilder(""+val);
        // sb.insert(0,"0");
        
        System.out.println(properDeciamlToBinary(14));
    }
}

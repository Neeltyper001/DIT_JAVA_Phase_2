package Strings;

public class ParseString {
    public static void main(String[] args) {
        String str = "this is -49";
        int sign = 0;
        
        while(!(str.charAt(0) >= 48 && str.charAt(0) <= 57)){
           sign =  str.charAt(0) == 45 ? -1: 1;
           str =  str.substring(1);           
        }
                System.out.println(sign * Integer.parseInt(str));        
    }
}

package Strings;

public class ValidPalindrome {
    static boolean isValidPalindrome(String s) {
        StringBuilder strBuilder = new StringBuilder(s);

        for(int i=0; i<strBuilder.length(); i++){
            if(!(strBuilder.charAt(i) >= 97 && strBuilder.charAt(i) <=122)){
                if(strBuilder.charAt(i) >=65 && strBuilder.charAt(i) <=90 ){
                    strBuilder.setCharAt(i , (char)(strBuilder.charAt(i) + 32));
                }

                else{
                    strBuilder.deleteCharAt(i);
                }
            }
        }
        s = strBuilder.toString();
        System.out.println(s);
        System.out.println(strBuilder);
        return s.equals(strBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }
}

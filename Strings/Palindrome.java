package Strings;

public class Palindrome {

    //  ---- using StringBuilder reverseFunction ---
     
    static boolean isPalindrome(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        return str.equals(strBuilder.reverse().toString());
    }

    // ----- using two pointers apporach -------------
    static boolean isPalindrome2(String str){
       int start = 0;
       int end = str.length() - 1;

       while(start<end){
           
           if(str.charAt(start) != str.charAt(end)){
               return false;
           }

           start++;
           end--;
       }

       return true;
    }




    public static void main(String[] args) {
        String str = "naman";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));
    }
}

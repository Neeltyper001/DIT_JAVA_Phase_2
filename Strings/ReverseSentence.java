package Strings;

public class ReverseSentence {
    
// ============== Approach 1 ========================    
    static String [] reverseSentenceApproach1(String str){
        return str.split(" ");
    }


    public static void main(String[] args) {
        String str = "The sky is blue";
        String strArr [] = reverseSentenceApproach1(str);
        for(int i=strArr.length - 1; i>=0; i--){
            System.out.print(strArr[i]+" ");
        }
    }
}

package Branching;

public class PermutationStrings {
        static void premutation(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
       char firstchar=str.charAt(0);
       String smallsubstring=str.substring(1);
       premutation(smallsubstring, result);
       premutation(smallsubstring, result+firstchar);
       
    }
    public static void main(String[] args) {
        premutation("abc","");
    }

}

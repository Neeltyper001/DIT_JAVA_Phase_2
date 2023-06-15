package Branching;

import java.util.ArrayList;

// using stack fall approach
public class PermutationStrings_2 {
    
    static ArrayList<String> permutationStrings(String input){

        if(input.length() == 0){
            ArrayList<String> l = new ArrayList<>();
            l.add("");
            return l;
        }

        ArrayList<String>finalList = new ArrayList<>();
        char firstChar = input.charAt(0);
        ArrayList<String> result = permutationStrings(input.substring(1));

        for(String subString : result){            
            for(int i=0 ; i<= subString.length(); i++){
                StringBuilder sb = new StringBuilder(subString);
                sb.insert(i,firstChar);
                finalList.add(sb.toString());
            }
        }
        
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(permutationStrings("abc").toString());
    }
}

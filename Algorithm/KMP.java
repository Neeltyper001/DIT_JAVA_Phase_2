package Algorithm;


public class KMP {
    static int searchPattern(String text , String pattern){
        int i=0;
        int j=0;
    
        while(i<text.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                return i -j;
            }
    
            else{
                if(j!=0){
                    j = weightArray[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;
    }
}

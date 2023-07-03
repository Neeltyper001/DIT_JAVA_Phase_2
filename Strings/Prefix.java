package Strings;

public class Prefix {
    static void findPrefix(String str){
        int n = str.length();
        String [] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = str.substring(0,i+1);
        }
    
        for(String element: arr){
            System.out.println(element);
        }
    } 
    public static void main(String[] args) {
        findPrefix("apple");
        
    }
}

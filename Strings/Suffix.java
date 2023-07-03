package Strings;

  

public class Suffix {
    static void findSuffix(String str){
        int n= str.length();
        String [] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = str.substring(n-1-i);
        }
    
        for(String element: arr){
            System.out.println(element);
        }
    } 

    public static void main(String[] args) {
        findSuffix("apple");
    }
}

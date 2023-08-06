package Strings;

public class Test {
    public static void main(String[] args) {
        // String str = "0P";
        // str = str.toLowerCase();
        // String sb = "";

        // for(int i=str.length() - 1; i>=0 ; i--){
        //     if(str.charAt(i) >=97 && str.charAt(i) <=122){
        //         sb += str.charAt(i);
        //     }
            
        //     if(str.charAt(i) >=65 && str.charAt(i) <= 90){
        //         sb += (char)(str.charAt(i) + 32);
        //     }

        //     if(str.charAt(i) >= 48 && str.charAt(i) <=57){
        //         sb += str.charAt(i);
        //     }
        // }
        // boolean judge = true;
        // for(int i=0 ; i<sb.length()/2; i++){
        //     if(sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
        //         judge= false;
        //         break;
        //     }
        // }

        // System.out.println(judge);

        StringBuilder sb = new StringBuilder("Console");
            sb.replace(2, 3, "h");
            System.out.println(sb);
    }   
}

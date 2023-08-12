package Strings;

public class RLE {
    static String genRLE(String str){
        char value = str.charAt(0);
        String ans = "";
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != value ){
                ans = (ans + value) + count;
                System.out.println(ans);
                value = str.charAt(i);
                count = 0;
            }
            count++;
        }

        ans = (ans + value) + count;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(genRLE("aaabbbccc"));
    }
}

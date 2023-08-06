package Branching;
import java.util.ArrayList;
public class test {

    static void print(int num){

        if(num <= 0){
            return;
        }

        System.out.print(num+" ");
        print(num - 1);
        print(num - 2);
        
    }
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("");
        // ArrayList<String> sbarr = new ArrayList<>();
        // sbarr.add("");
        // System.out.println(sb);
        // // sb.insert(0,"c");
        // // System.out.println(sb.length());
        // // sb.insert(0,"s");
        // // System.out.println(sb);
        // // print(3);
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        System.out.println(list);
        list.add(list.get(0) + "Momo");
        System.out.println(list);
        System.out.println(list.get("Momo"));
    }
}

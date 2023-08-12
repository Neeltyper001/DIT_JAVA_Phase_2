package Backtracking;
import java.util.ArrayList;
public class test {
    
    public static void main(String[] args) {
        int inval = 1;
        // char val = (char)(48 + inval);        
        // System.out.println(val);
        // System.out.println("Hello world");    
        // ArrayList<Integer> arrlist = new ArrayList<>();
        // arrlist.add(2);
        // arrlist.add(3);
        // arrlist.add(4);
        // ArrayList<Integer> arrlist2 = new ArrayList<>(arrlist);
        // arrlist2.add(5);
        // System.out.println(arrlist2);

        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        list_1.add(25);
        list_1.add(26);
        list_1.add(27);
        list_1.add(28);

        list_2.add(25);
        list_2.add(26);
        // list_2.add(28);
        list_2.add(27);

        System.out.println(list_1.containsAll(list_2));
        System.out.println(list_1);
        System.out.println(list_2);
    }
}

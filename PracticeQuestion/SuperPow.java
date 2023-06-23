package PracticeQuestion;

public class SuperPow {
    
    static int superPow(int a , int [] b){
        int base = a;
        System.out.println(a);
        System.out.println(Integer.parseInt(chotaPow( b , b.length - 1).toString()));
        int power = Integer.parseInt(chotaPow( b , b.length - 1).toString());
        int result = ((int)Math.pow(base , power) % 1337);
        return result;
    }

    static StringBuilder chotaPow(int [] b , int index){
        if(index < 0){
            return new StringBuilder("");
        }

        StringBuilder result = chotaPow( b , index - 1).append(b[index]);
        return result;
    }

    public static void main(String[] args) {
        int [] b = {2,0,0};
        System.out.println(superPow(2147483647, b));
    }
}

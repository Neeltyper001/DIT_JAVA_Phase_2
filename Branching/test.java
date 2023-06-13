package Branching;
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
        print(3);
    }
}

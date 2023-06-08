package NestedRecursion;

public class LeftPyramid {

    static void printStars(int rows){
        if(rows == 0){
            return;
        }
        System.out.print("* ");
        printStars(rows - 1);
    }
    
    static void printLines(int rows){
        if(rows == 0){
            return;
        }

        printLines(rows - 1);
        printStars(rows);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
    }
}

package NestedRecursion;

public class HollowSquare {

    static void printStars(int rows, int stars){
        if(stars == 0){
            return;
        }

        if(rows == 5 || rows == 1){
            System.out.print("* ");
        }

        else{
            if(stars == 5 || stars == 1){
                System.out.print("* ");
            }

            else{
                System.out.print("  ");
            }
        }

        printStars(rows, stars - 1);
    }
    static void printLines(int rows , int stars){
            if(rows == 0){
                return;
            }

            printStars(rows, stars);
            System.out.println();
            printLines(rows - 1 , stars);
    }

    public static void main(String[] args) {
        printLines(5,5);
    }
}

package NestedRecursion;

 class Pattern {
    static void printStar(int stars){
        if(stars  == 0){
            return;
        }
        
        printStar(stars - 1);
        System.out.println("*");
        return;
    }

    static void printLine(int rows, int stars){
        if(rows == 0){
            return;
        }

        printLine(rows - 1, stars);
        printStar(stars);
    }
}

package Branching;

import java.net.SocketTimeoutException;

public class MazeProblem {
    
    static void mazeProblem(int right , int down , String movementType){

        if(right == 4 && down == 4){           
            return;
        }

        if(right == 3 && down == 3){
            System.out.println(" Reached !");
            System.out.println();
            return;
        }
        if(right == 4 || down == 4 ){             
            return;
        }

        if(movementType == "right"){
            System.out.print("R");
        }

        else{
            System.out.print("D");
        }                
        mazeProblem(right + 1, down , "right");
        mazeProblem(right, down + 1 , "down");            
    }

    public static void main(String[] args) {
        mazeProblem(0, 0, "");
    }
}

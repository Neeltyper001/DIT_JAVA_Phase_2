package Branching;

public class MazePathProblem {
        static void mazePathProblem(int row , int col, int endRow, int endCol, String result){
        if(row == endRow && col == endCol){
            System.out.println(result);
            return;
        }
        if(row > endRow || col > endCol){
            return;
        }
        //for Right move
       mazePathProblem(row, col+1, endRow, endCol, result+"R");
        //for down move
        mazePathProblem(row+1, col, endRow, endCol, result+"D");
    }
public static void main(String[] args) {
    mazePathProblem(0, 0, 2, 2,"");
}

}

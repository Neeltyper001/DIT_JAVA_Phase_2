package PracticeQuestion;

class RatInMaze{

 static  boolean isNotBlocked(int board[][] , int row, int col){
        if(row<board.length && col<board[row].length && board[row][col] == 1){
            return true;
        }
        return false;
    }


   static boolean RatInAMaze(int board [][], int row, int col , int [][]path){
    if(row == board.length - 1 && col == board.length - 1)    {
        path[row][col] = 1;
        return true;
    }
    
  
    if(isNotBlocked(board , row ,col)){
        path[row][col] = 1;
    }
    
            if(RatInAMaze(board, row+1, col, path)){

            }
        return false;
    }

    public static void main(String[] args) {
        int board [][] = {
            {1,0,1,0,1},
            {1,0,1,1,1},
            {0,1,0,1,0},
            {1,0,0,1,1},
            {1,1,1,0,1}
        };

        int path [][] = new int[board.length][board.length];
        for(int i=0 ; i<path.length; i++){
            for(int j=0; j<path[i].length; j++){
                System.out.println(path[i][j]);
            }
        }


    }
}
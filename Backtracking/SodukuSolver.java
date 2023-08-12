package Backtracking;

public class SodukuSolver {
    static final int MAX_SIZE = 9;
    static char [][] board;

    static boolean isCorrectToPlaceNumber(int row, int col, char value){
        // The value is present in Row
        // The value is present in Col
        // The value is present in SubGrid
        return false;
    }

    static boolean solveSudoku(int row, int col){
        
        // If we reach to last column / then move to the next row
        if(col == MAX_SIZE){
            // means the current row is completed time to move to the next row
            row++;
            col = 0;
        }
        
        // If reach  the last row 
        if(row == MAX_SIZE){
            return true;
        }
         // If cell is not empty so move to the next column
        if(board[row][col] != '.'){
            return solveSudoku(row , col+1);
        }
        
        // If cell is Empty , then place the digits from 1 to 9 by using pre-checks which is defined by the isCorrectoPlaceNumer
        for(int i=1; i<=9; i++){
            if(isCorrectToPlaceNumber(row, col, (char)( 48 + i))){                    
                board[row][col] = (char)(48 + i);
                boolean result = solveSudoku(row, col + 1);
                if(result){
                    return true;
                }
            }            
        }

        return false;
    }
    static void solveSudoku(char[][] board) {
        // If we reach to the last row + 1 , we solve the sudoku (temination case)
                    
    }

    public static void main(String args[]){
        
    }
}

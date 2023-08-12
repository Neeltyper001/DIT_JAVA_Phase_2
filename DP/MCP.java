package DP;
public class MCP {
    
    // static int mcp(int costMatrix[][], int m,int n){
        
    //     if(n<0 || m<0){
    //         return Integer.MAX_VALUE;
    //     }

    //     if(m==0 && n== 0){
    //         return costMatrix[m][n];
    //     }

    //     return costMatrix[m][n] + Math.min(Math.min(mcp(costMatrix,m-1,n-1), mcp(costMatrix,m-1,n)),mcp(costMatrix,m,n-1));
        
    // }
    public static void main(String[] args) {
        int costMatrix[][] = {{2,0,6},{3,1,7},{4,5,9}};
        int resultMatrix[][] = new int [costMatrix.length][costMatrix.length];
        resultMatrix[0][0] = costMatrix[0][0];
        for(int i=1; i<resultMatrix.length ; i++){
            resultMatrix[i][0] = resultMatrix[i-1][0] + costMatrix[i][0];
        }
        for(int i=1; i<resultMatrix.length ; i++){
            resultMatrix[0][i] = resultMatrix[0][i-1] + costMatrix[0][i];
        }

        for(int i=1; i<resultMatrix.length; i++){
            for(int j=1; j<resultMatrix.length;j++){
                resultMatrix[i][j] = Math.min(((Math.min(resultMatrix[i-1][j-1],resultMatrix[i-1][j]))),resultMatrix[i][j-1]) + costMatrix[i][j];
            }
        }
        System.out.println(resultMatrix[resultMatrix.length-1][resultMatrix.length-1]);
        // int initialVal = costMatrix[costMatrix.length-1][costMatrix.length - 1];
        // System.out.println(initialVal);
    }

}

package DP;
public class LCS {

        static int lcsTabulation(String first, String second, int m, int n ){
            int matrix [][] = new int[m+1][n+1];
            for(int i=0; i<=m ; i++){
                for(int j=0; j<=n; j++){
                    if(i==0 || j==0){
                        matrix[i][j] = 0;
                    }
                    else{
                        if(first.charAt(i-1) == second.charAt(j-1)){
                            matrix[i][j] = matrix[i-1][j-1] + 1;
                        }
                        else{
                            matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                        }
                    }
                }
            }
            return matrix[m][n];
        }
        // Memorization

        static int lcs(String first, String second, int m, int n ,int[][]cache){
            if(first.length() == 0 || second.length() == 0){
                return 0;
            }
            if(cache[m-1][n-1]!=0){
                return cache[m-1][n-1];
            }
            if(first.charAt(m-1) == second.charAt(n-1)){
                cache[m-1][n-1] = 1 + lcs(first, second, m-1, n-1, cache);
            }

            else{
                int result1 = lcs(first, second , m , n-1, cache);
                int result2 = lcs(first, second , m-1, n, cache);
                cache[m-1][n-1] = Math.max(result1,result2);
            }
            return cache[m-1][n-1];
        }

        static int lcs(String first, String second){
            if(first.length() == 0 || second.length() == 0){
                return 0;
            }
            
            int count=0;            
            if(first.charAt(0) == second.charAt(0)){
                count = 1+ lcs(first.substring(1),second.substring(1));
            }
            else{
                int result1 = lcs(first.substring(1),second);
                int result2 = lcs(first , second.substring(1));
                count = Math.max(result1,result2);
            }
            return count;
        }
    public static void main(String[] args) {
        String first = "abbg";
        String second = "agbg";
        int cache[][] = new int[first.length()][second.length()];
       int len =  lcsTabulation(first, second, first.length(), second.length());
        System.out.println(len);
    }   
}

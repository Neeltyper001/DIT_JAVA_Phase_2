package TwoDArrays;
class OneDtoTwoD{

    static int [][] convert2D(int []arr , int n , int m){
        int result[][] = new int[n][m];
        int row = 0 , col = 0;
        // if(m*n != arr.length){
        //     return new int[0][0];
        // }
        for(int i=0; i<arr.length; i++){
            if(col == m){
                col = 0;
                row++;
            }
            result[row][col] = arr[i];
            col++;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};        

        int [][] ans = convert2D(arr , 2 , 3);

            for(int i=0; i<2; i++){
                for(int j=0; j<3; j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }

    }
}
package A3Arrays;
//my approach 1ms
//class MatrixDiagonal{
//    public int diagonalSum(int[][] mat) {
//        int sum=0;
//        for(int i=0;i<mat.length;i++)
//        {
//            for(int j=0;j<mat[0].length;j++)
//            {
//                if(i==j || (i+j)==(mat.length-1)) sum=sum+mat[i][j];
//            }
//        }
//        return sum;
//    }
//}
//0ms approach
class MatrixDiagonal{
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            sum+=mat[i][i]//primary diagonal
            +mat[i][mat.length-i-1];//secondaty diagonal
        }
        if((mat.length%2)!=0)
            sum-=mat[mat.length/2][mat.length/2];//In order numbered matrices middle value is added twice which must be removed
        return sum;
    }
}
package A3Arrays;

import java.util.ArrayList;
import java.util.List;

//2ms approach
class LuckyNumber{
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            int ans=Integer.MAX_VALUE;
            int minj=-1;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<ans)
                {
                    ans=matrix[i][j];
                    minj=j;
                }
            }
            boolean bool=true;
            for(int r=0;r<matrix.length;r++)
            {
                if(matrix[r][minj]>ans)
                {
                    bool=false;
                    break;
                }
            }
            if(bool) ls.add(ans);
        }
        return ls;
    }
}

//Oms approach
//class Solution {
//    public List<Integer> luckyNumbers (int[][] matrix) {
//        List<Integer> result = new ArrayList<Integer>();
//
//        for (int row = 0; row < matrix.length; row++) {
//            int minCol = minColInRow(matrix, row);
//            int value = matrix[row][minCol];
//            if (checkIfMaxInCol(matrix, minCol, value)) {
//                result.add(value);
//            }
//        }
//
//        return result;
//    }
//
//    private int minColInRow(int[][] matrix, int row) {
//        int minIndex = 0, min = matrix[row][minIndex];
//        for (int col = 1; col < matrix[row].length; col++) {
//            if (matrix[row][col] < min) {
//                min = matrix[row][col];
//                minIndex = col;
//            }
//        }
//        return minIndex;
//    }
//
//    private boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
//        for (int row = 0; row < matrix.length; row++) {
//            if (matrix[row][col] > value) return false;
//        }
//        return true;
//    }
//}

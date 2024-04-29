package A3Arrays;

//1ms approach
class ReshapeMatrix{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length)!= (r*c)) return mat;
        int[][] ans=new int[r][c];
        int ans_r=0,ans_c=0;
        for(int i =0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                ans[ans_r][ans_c]=mat[i][j];
                ans_c++;
                if(ans_c==c)
                {
                    ans_r++;
                    ans_c=0;
                }
            }
        }
        return ans;
    }
}

//approach


package A3Arrays;

class Set0{
    public void setZeroes(int[][] matrix) {
        boolean isRow0=false,isCol0=false;
        //sets isrow0 to true if an element of first row is 0
        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[0][i]==0) isRow0=true;
        }
        //sets iscol0 to true if an element of first column is 0
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0) isCol0=true;
        }
//sets value of first row and coloumn to zero if an element in row and columns other than first row and column is zero
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //sets full rows and columns to zero by traversing through the updated first r and c
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
            }
        }
        //sets first row to zero if isrow0 is true
        if(isRow0)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[0][i]=0;
            }
        }
        //sets first col to zero if iscol0 is true
        if(isCol0)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}
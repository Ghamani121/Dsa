package A3Arrays;

class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int rstart=0,cstart=0,rend=n-1,cend=n-1;
        int direction =0;
        int value=1;
        if(n==1)
        {
            matrix[0][0]=1;
            return matrix;
        }
        while(rstart<=rend && cstart<=cend)
        {
            switch(direction)
            {
                case 0://right
                    for(int i=cstart;i<=cend;i++)
                    {
                        matrix[rstart][i]=value;
                        value++;
                    }
                    rstart++;
                    break;
                case 1://down
                    for(int i=rstart;i<=rend;i++)
                    {
                        matrix[i][cend]=value;
                        value++;
                    }
                    cend--;
                    break;
                case 2://left
                    for(int i=cend;i>=cstart;i--)
                    {
                        matrix[rend][i]=value;
                        value++;
                    }
                    rend--;
                    break;
                case 3://up
                    for(int i=rend;i>=rstart;i--)
                    {
                        matrix[i][cstart]=value;
                        value++;
                    }
                    cstart++;
                    break;
            }
            direction=(direction+1)%4;
        }
        return matrix;
    }
}

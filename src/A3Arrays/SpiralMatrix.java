package A3Arrays;
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<Integer>();
        int  rstart=0,cstart=0,rend=matrix.length-1,cend=matrix[0].length-1;
        int direction=0;
        if(matrix.length==0 || matrix==null) return ls;
        while(rstart<=rend && cstart<=cend)
        {
            switch(direction)
            {
                case 0://right
                    for(int i=cstart;i<=cend;i++)
                    {
                        ls.add(matrix[rstart][i]);
                    }
                    rstart++;
                    break;
                case 1://down
                    for(int i=rstart;i<=rend;i++)
                    {
                        ls.add(matrix[i][cend]);
                    }
                    cend--;
                    break;
                case 2://left
                    for(int i=cend;i>=cstart;i--)
                    {
                        ls.add(matrix[rend][i]);
                    }
                    rend--;
                    break;
                case 3://up
                    for(int i=rend;i>=rstart;i--)
                    {
                        ls.add(matrix[i][cstart]);
                    }
                    cstart++;
                    break;
            }
            direction=(direction+1)%4;
        }
        return ls;
    }
}

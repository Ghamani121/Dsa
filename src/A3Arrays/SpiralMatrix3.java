package A3Arrays;

class SpiralMatrix3  {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int totalLen=rows*cols,distance=0,direction=0,resultrow=1,r=rStart,c=cStart;
        int[][] result=new int[totalLen][2];
        int[][] allDirection={{0,1},{1,0},{0,-1},{-1,0}};
        result[0]= new int[] {rStart,cStart};
        if(totalLen==1) return result;
        while(resultrow<totalLen)
        {
            if(direction==0 || direction==2) distance++;

            for(int i=1;i<=distance;i++)
            {
                r+=allDirection[direction][0];
                c+=allDirection[direction][1];

                if(r>=0 && r<rows && c>=0 && c<cols)
                {
                    result[resultrow++]=new int[] {r,c};
                    if(resultrow==totalLen) return result;
                }
            }
            direction=(direction+1)%4;
        }
        return result;
    }
}
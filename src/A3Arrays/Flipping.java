package A3Arrays;

class Flipping {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int[][] result= new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                result[i][j]=image[i][c-j-1];
                if(result[i][j]==0) result[i][j]=1;
                else result[i][j]=0;
            }
        }
        return result;
    }
}

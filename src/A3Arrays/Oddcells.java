package A3Arrays;

class Oddcells {
    public int oddCells(int m, int n, int[][] indices) {
        int[] r=new int[m];
        int[] c=new int[n];
        int count=0;
        for(int i[]:indices)
        {
            //indices has two columns 0 and 1
            r[i[0]]++;//0 has all the row indices
            c[i[1]]++;// 1 has all the column indices
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((r[i]+c[j])%2!=0) count++;
            }
        }
        return count;
    }
}


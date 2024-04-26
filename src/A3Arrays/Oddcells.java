package A3Arrays;

class Oddcells {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row=new int[m];
        int[] c=new int[n];
        int count=0;
        for(int result[]:indices)
        {
            row[result[0]]++;
            c[result[1]]++;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((row[i]+c[j])%2!=0) count++;
            }
        }
        return count;
    }
}


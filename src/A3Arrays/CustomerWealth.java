package A3Arrays;

import java.util.Scanner;

class CustomerWealth{
    public int maximumWealth(int[][] accounts) {
        //my approach
//        int[] wealth=new int[accounts.length];
//        for(int i=0;i< accounts.length;i++)
//        {
//            for (int j=0;j<accounts[i].length;j++)
//            {
//                wealth[i]+=accounts[i][j];
//            }
//        }
//        int max=wealth[0];
//        for(int i=1;i<wealth.length;i++)
//        {
//            if(wealth[i]>max) max=wealth[i];
//        }
        //approach in where i dont store sum of wealth
        //comparison done inside loop itself
        //using math.power
        int max=0;
        for(int i=0;i< accounts.length;i++)
        {
            int wealth=0;
            for (int j=0;j<accounts[i].length;j++)
            {
                wealth+=accounts[i][j];
            }
            max=Math.max(max,wealth);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of customers");
        int r=in.nextInt();
        int[][] accounts=new int[r][];
        int c;
        for(int i=0;i< accounts.length;i++)
        {
            System.out.println("Enter number of banks for customer "+(i+1));
            c=in.nextInt();
            accounts[i] = new int[c]; // Initialize the inner array with the correct size
            for (int j=0;j<c;j++)
            {
                accounts[i][j]= in.nextInt();
            }
        }
        CustomerWealth s=new CustomerWealth();
        int max =s.maximumWealth(accounts);
        System.out.println("Richest customer has wealth of "+max);
    }
}

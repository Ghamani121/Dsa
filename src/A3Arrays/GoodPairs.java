package A3Arrays;

import java.util.Scanner;

class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int ans=0,count[]=new int[101];//constraint is one to 100,there if we have 3 ones then count[1]=3
        for(int i=0;i<nums.length;i++)
        {
            ans+=count[nums[i]]++;
            //if nums=1,1,1,0,0 then
            // loop 1,ans=0,count[1]=1
            // loop 2,ans=1,count[1]=2
            // loop 3,ans=1+2,count[1]=3
            // loop 4,ans=3+0,count[0]=1
            // loop 5,ans=3+1,count[0]=2
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        GoodPairs s=new GoodPairs();
        int ans= s.numIdenticalPairs(nums);
        System.out.println(ans);
    }
}

package A3Arrays;

import java.util.Scanner;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        for (int i=0;i<nums.length-1;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]) ans++;
            }
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
        Solution s=new Solution();
        int ans= s.numIdenticalPairs(nums);
        System.out.println(ans);
    }
}

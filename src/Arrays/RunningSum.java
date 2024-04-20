package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class RunningSum{
    public int[] runningSum(int[] nums) {
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        RunningSum s=new RunningSum();
        System.out.println(Arrays.toString(s.runningSum(nums)));
    }
}

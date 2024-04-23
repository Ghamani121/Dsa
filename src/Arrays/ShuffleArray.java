package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public int[] shufflearray(int[] nums) {
        int ans[]=new int[nums.length];
        int half= nums.length/2;
        for(int i=0,j=0;i<half;i+=2,j++)
        {
            ans[i]=nums[j];
            ans[i+1]=nums[half];
            half++;
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
        ShuffleArray s=new ShuffleArray();
        System.out.println(Arrays.toString(s.shufflearray(nums)));
    }
}

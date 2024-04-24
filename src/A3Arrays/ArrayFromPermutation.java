package A3Arrays;
import java.util.Arrays;
import java.util.Scanner;
class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter array length");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        ArrayFromPermutation s=new ArrayFromPermutation();
        System.out.println(Arrays.toString(s.buildArray(nums)));   //best way to print arrays
    }
}
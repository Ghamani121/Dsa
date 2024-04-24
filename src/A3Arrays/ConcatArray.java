package A3Arrays;
import java.util.Arrays;
import java.util.Scanner;
class ConcatArray{
    //my approach
//    public int[] getConcatenation(int[] nums) {
//        int i;
//        int[] ans=new int[2*nums.length];
//        for(i=0;i<nums.length;i++){
//            ans[i]=nums[i];
//        }
//        int count =i;
//        for(int j=0;j< nums.length;j++)
//        {
//            ans[count]=nums[j];
//            count++;
//        }
//        return ans;
//    }

    //insane approach
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i+ nums.length]=nums[i];
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
        ConcatArray s=new ConcatArray();
        int[] ans= s.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}

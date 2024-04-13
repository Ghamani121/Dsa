package A1SimpleJavaPrograms;
import java.util.Scanner;
class TwoSum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n=in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        System.out.println("Enter target value");
        int target=in.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                    break;
                }
            }
        }
    }
}
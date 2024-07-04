package A3Arrays;

public class SmallerThanCurrent8{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[]=new int[101];
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)//all the values of nums is incremented to how many times it is repeated
        {
            count[nums[i]]++;
        }
        for(int i=1;i<=100;i++)//add the needed values in array
        {
            count[i]+=count[i-1];//increment values of i with number of values that are less than i
        }
        for(int i=0;i<nums.length;i++)//return ans array
        {
            if(nums[i]==0) ans[i]=0;//NO VALUE IS LESS THAN ONE
            else ans[i]=count[nums[i]-1];//we return previous value of nums
        }
        return ans;
    }
}

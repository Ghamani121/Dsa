package A3Arrays;

class HouseRobbeer{
    public int rob(int[] nums) {
        int max=0;
        if(nums.length%2==0) max=Even(nums,max);
        else max=Odd(nums,max);
        return max;
    }
    private int Odd(int[] nums,int max)
    {
        int sum_i=0,sum_j=0;
        for(int i=0,j=1;i<nums.length;i=i+2,j=j+2)
        {
            sum_i=sum_i+nums[i];
            if(j==nums.length) break;
            sum_j=sum_j+nums[j];
        }
        max=Math.max(sum_i,sum_j);
        return max;
    }
    private int Even(int[] nums,int max)
    {
        int sum_i=0,sum_j=0;
        for(int i=0,j=1;i<nums.length;i=i+2,j=j+2)
        {
            sum_i=sum_i+nums[i];
            sum_j=sum_j+nums[j];
        }
        max=Math.max(sum_i,sum_j);
        return max;
    }
}

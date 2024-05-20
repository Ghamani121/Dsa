package Searching;

class SplitArrayLargetSum10  {
    public int splitArray(int[] nums, int k) {
        int start=0,end=0;
        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(start,nums[i]);//to find max value in the array
            end+=nums[i];//sum of all values in array
        }
        while(start<end)//beacause start and end is our ans when it is equal
        {
            int mid=start+(end-start)/2;
            int kcount=1,sum=0;
            for(int num:nums)
            {
                if(sum+num<=mid) sum+=num;
                else
                {
                    sum=num;
                    kcount++;
                }
            }
            //condition is checking if our mid value is too small aka we will increse out smallest value i.e, start
            if(kcount>k) start=mid+1;
            else end=mid;
        }
        return end;//can return either end or start since both will be equal
    }
}
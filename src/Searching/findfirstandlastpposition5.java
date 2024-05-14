package Searching;

class findfirstandlastpposition5 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1)
        {
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    public static int search(int[] nums,int target,boolean FindFirstIndex)
    {
        int start=0,end=nums.length-1,mid=0,a=-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target<nums[mid]) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else {
                a=mid;
                if(FindFirstIndex) end=mid-1;
                else start=mid+1;
            }
        }
        return a;

    }
}
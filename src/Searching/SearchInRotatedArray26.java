package Searching;

public class SearchInRotatedArray26 {
    public int search(int[] nums, int target)
    {
        int pivot=findPivot(nums,target);
        if(pivot==-1) return search(nums,0,nums.length-1,target);
        else
        {
            if(nums[pivot]==target) return pivot;
            if(target<nums[0]) return search(nums,pivot+1,nums.length-1,target);
                //else if target is equal or greater than nums[0]
            else return search(nums,0,pivot,target);
        }
    }//7 here is our pivot value
    public int findPivot(int[] nums,int target)
    {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            if(nums[mid]<=nums[start]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public int search(int[] nums,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}

package Searching;

class RoatatedSortedArray8 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 9, 2};
        int target=9;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
//        int pivot=Pivot(nums);
        int pivotWithDuplicates=PivotWithDuplicates(nums);

//        if(pivot==-1)
//        {
//            return binarySearch(nums,target,0,nums.length-1);
//        }
//        else
//        {
//            if(nums[pivot]==target) return pivot;
//            else if(target>=nums[0]) return binarySearch(nums,target,0,pivot);
//            else return binarySearch(nums,target,pivot+1,nums.length-1);
//        }
        if(pivotWithDuplicates==-1)
        {
            return binarySearch(nums,target,0,nums.length-1);
        }
        else
        {
            if(nums[pivotWithDuplicates]==target) return pivotWithDuplicates;
            else if(target>=nums[0]) return binarySearch(nums,target,0,pivotWithDuplicates);
            else return binarySearch(nums,target,pivotWithDuplicates+1,nums.length-1);
        }
    }
//    int Pivot(int[] nums)
//    {
//        int start=0,end=nums.length-1,mid=0;
//        while(start<=end)
//        {
//            mid=start+(end-start)/2;
//            if(mid<end && nums[mid]>nums[mid+1]) return mid;
//            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
//            if(nums[mid]<=nums[start]) end=mid-1;
//            else start=mid+1;
//        }
//        return -1;
//    }
static int PivotWithDuplicates(int[] nums)
    {
        int start=0,end=nums.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                //check if these value are pivots or not before incrementing
                if(start<end && nums[start]>nums[start+1]) return start;
                start++;
                if(end>start && nums[end]<nums[end-1]) return end-1;
                end--;
            }
            //to make sure pivot doesnt exist on the left side, so we can move to right side
            //nums[start]<nums[mid] = left is sorted in ascending order
            //nums[start]==nums[mid] = checking if there are more than one occurrence
            //nums[end]>nums[mid] = checking that right side is unsorted
            else if (nums[start]<nums[mid] || nums[start]==nums[mid] && nums[end]>nums[mid] )
            {
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
    static int binarySearch(int[] nums, int target, int start, int end)
    {
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if (nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
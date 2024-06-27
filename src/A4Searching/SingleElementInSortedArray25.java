package A4Searching;

public class SingleElementInSortedArray25 {
        public int singleNonDuplicate(int[] nums) {
            int start=0,end=nums.length-1;
            while(start<end)
            {
                int mid=start+(end-start)/2;
                //if mid is even then mid+1 would contain duplicate of mid
                //if mid is odd then mid-1 would contain duplicate of mid
                //therefore,we move to right side of array and to check where the pattern is broken
                //else if condition is not true, means pattern is broken and we need to move to left side of array to find where the singleelement exists
                if(mid%2==0 && nums[mid+1]==nums[mid] || mid%2==1 && nums[mid-1]==nums[mid])
                {
                    start=mid+1;
                }
                else  end=mid;
            }
            return nums[end];
        }
    }

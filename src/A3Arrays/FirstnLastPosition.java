package A3Arrays;


// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] array={-1,-1};
//         int countouu=0;
//         if(nums.length==0) return array;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]!=target)
//             countouu++;
//         }
//         if(countouu==nums.length) return array;
//         int count=0,countNo=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==target) count++;

//         }
//         int i=0;
//         while(nums[i]!=target && i<nums.length)
//         {
//             countNo++;
//             i++;
//         }
//         array[0]=countNo;
//         array[1]=(countNo-1)+count;
//         return array;

//     }
// }

//log n approach

 class FirstnLastPosition {
     public int[] searchRange(int[] nums, int target) {
         int[] array = new int[2];
         array[0] = FirstPosition(nums, target);
         array[1] = LastPosition(nums, target);
         return array;
     }

     private int FirstPosition(int[] nums, int target) {
         int i = -1, start = 0, end = nums.length - 1, mid;
         while (start <= end) {
             mid = (start + end) / 2;
             if (nums[mid] >= target) end = mid - 1;
             else start = mid + 1;
             if (nums[mid] == target) i=mid;
         }
         return i;
     }

     private int LastPosition(int[] nums, int target) {
         int i = -1, start = 0, end = nums.length - 1, mid;
         while (start <= end) {
             mid = (start + end) / 2;
             if (nums[mid] <= target) start = mid + 1;
             else end = mid - 1;
             if (nums[mid] == target) i=mid;
         }
         return i;
     }
 }

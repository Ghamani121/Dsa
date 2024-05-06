package A3Arrays;

//bruteforce
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int[] rotate=new int[nums.length];
//        for(int i=0;i<k;i++)
//        {
//            rotate[0]=nums[nums.length-1];
//            for(int j=1;j<nums.length;j++)
//            {
//                rotate[j]=nums[j-1];
//            }
//            for(int j=0;j<nums.length;j++)
//            {
//                nums[j]=rotate[j];
//                rotate[j]=0;
//            }
//        }
//    }
//}
// reversing the array values




//        Okay Bonus point what if we have k = -1, then how can we rotate the array. If k is -1 then we have to rotate the value backward not in the front.
//        Eg -
//        Input : [1,2,3,4,5,6,7], k = -1
//        Output : [2,3,4,5,6,7,1]
//
//        Now how did we figure out this, if you carefully look that k = -1 is equals to k = 6.
//        Just look at the table which I have made for every possible k values
//
//        So, what It represent is that add the -ve value to the length of array. And you will get your answer!

public class RotateArray {
    public static void reverse(int nums[], int i, int j) {
        int li = i; // left index;
        int ri = j; // right index

        while (li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }

    public void RotateArray(int[] nums, int k) {
        k = k % nums.length; // if we have let's say 101 to rotate, then we only rotate it 1 time not 101 times
        if (k < 0) { // if we get -ve value, then -ve is just equals to it's -ve + array.length
            k += nums.length;
        }
        // part 1 reverse
        reverse(nums, 0, nums.length - k - 1);
        // part 2 reverse
        reverse(nums, nums.length - k, nums.length - 1);
        // complete reverse
        reverse(nums, 0, nums.length - 1);
    }
}
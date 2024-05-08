package A3Arrays;

//class Solution {
//    public void sortColors(int[] nums) {
//        int zero=0,one=0,two=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            if(nums[i]==0) zero++;
//            else if(nums[i]==1) one++;
//            else two++;
//        }
//        one=zero+one;
//        two=one+two;
//        int j;
//        for(j=0;j<zero;j++)
//        {
//            nums[j]=0;
//        }
//        int h;
//        for(h=j;h<one;h++)
//        {
//            nums[h]=1;
//        }
//        for(int i=h;i<two;i++)
//        {
//            nums[i]=2;
//        }
//    }
//}
class SortColors {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;//
            }
            else if(nums[mid]==1) mid++;
            else
            {
                swap(nums,high,mid);
                high--;
            }
        }
    }
    private void swap(int nums[],int value1,int value2)
    {
        int temp;
        temp=nums[value1];
        nums[value1]=nums[value2];
        nums[value2]=temp;
    }
}
package Searching;

public class TwoSum14 {
        public int[] twoSum(int[] numbers, int target) {
            for(int i=0;i<numbers.length-1;i++)
            {
                int start=i+1,end=numbers.length-1;
                int temp=target-numbers[i];
                while(start<=end)
                {
                    int mid=start+(end-start)/2;
                    // if(i==mid) mid=i+1;   //use i+1 for initializing start rather than giving start as 0
                    if(temp==numbers[mid]) return new int[]{i+1,mid+1};
                    else if(temp>numbers[mid]) start=mid+1;
                    else end=mid-1;
                }
            }
            return new int[]{-1,-1};
        }
    }
}
//using binary approach here is redundant, use two pointers approach
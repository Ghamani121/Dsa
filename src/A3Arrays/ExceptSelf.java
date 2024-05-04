package A3Arrays;

import java.util.Arrays;


//    //bruteforceclass Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int[] answer=new int[nums.length];
//        int position=1;
//        for(int i=0;i<nums.length;i++)
//        {
//            answer[i]=1;
//        }
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=0;j<nums.length;j++)
//            {
//                if(i==j) continue;
//                answer[i]=answer[i]*nums[j];
//            }
//        }
//        return answer;
//    }
//}
//aproach 1
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int pre[] = new int[n];
//        int suff[] = new int[n];
//        pre[0] = 1;
//        suff[n - 1] = 1;
//
//        for(int i = 1; i < n; i++) {
//            pre[i] = pre[i - 1] * nums[i - 1];
//        }
//        for(int i = n - 2; i >= 0; i--) {
//            suff[i] = suff[i + 1] * nums[i + 1];
//        }
//
//        int ans[] = new int[n];
//        for(int i = 0; i < n; i++) {
//            ans[i] = pre[i] * suff[i];
//        }
//        return ans;
//    }
//}
class ExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int a=1;
        Arrays.fill(answer,1);//fills answer array with 1 value
        //prefix logic
        for(int i=0;i<nums.length;i++)
        {
            answer[i]*=a;
            a*=nums[i];
        }
        a=1;
        //suffix logic=prefix logic in reverse
        for(int i=(nums.length-1);i>=0;i--)
        {
            answer[i]*=a;
            a*=nums[i];
        }
        return answer;
    }
}
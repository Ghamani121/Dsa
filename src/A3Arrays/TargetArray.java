package A3Arrays;

import java.util.ArrayList;

class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetlist=new ArrayList<>();
        for(int i=0;i< nums.length;i++)
        {
              targetlist.add(index[i],nums[i]);
//            System.out.println(target[index[i]]+"  "+nums[i]+"  "+index[i]);
        }
        int[] targetarray=new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
             targetarray[i]=targetlist.get(i);
        }
        return targetarray;
    }
}

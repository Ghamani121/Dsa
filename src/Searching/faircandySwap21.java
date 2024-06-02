package Searching;

import java.util.Arrays;

public class faircandySwap21 {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //atotal+b[j]-a[i]=btotal+a[i]-b[j]
        //b[j]any value that is added to a and removed from b
        //a[i]any value that is removed from a and added to b
        //used to find the target value of b aka b[j]
        //b[j]=btotal+2a[i]-atotal/2;
        int atotal=0,btotal=0;
        for(int a:aliceSizes)
        {
            atotal+=a;
        }
        for(int a:bobSizes)
        {
            btotal+=a;
        }
        Arrays.sort(bobSizes);//make sure bobsizes is a sorted array
        for(int i=0;i<aliceSizes.length;i++)
        {
            int target=(btotal+2*aliceSizes[i]-atotal)/2;
            if (binarySearch(bobSizes,target)) return new int[]{aliceSizes[i],target};
        }
        return new int[0];
    }
    boolean binarySearch(int[] bobSizes,int target)
    {
        int start=0,end=bobSizes.length-1;//shoudl be -1 for end usually
        while(start<=end)//usually equals
        {
            int mid=start+(end-start)/2;
            if(bobSizes[mid]==target) return true;
            if(bobSizes[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}

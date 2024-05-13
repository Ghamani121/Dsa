package Searching;

public class CeilingOfANo //smallest number that is greater or equal to target element
{
    public static void main(String[] args) {
        int a[]={2,3,5,9,14,16};
        int target=4;
        System.out.println(Ceiling(a,target));
    }
    static int Ceiling(int[] a,int target)
    {
        int start=0,end=a.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return a[start];
    }
}
//to find the floor of an element just return end instead of start
package Searching;

class MountainArray7 {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1,mid=0;
        while(start<end) //loop ends when start becomes equal to 0
        {
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {//descending order of array found
                end=mid;  //best possible ans found
            }
            else{ //ascending order
                start=mid+1; //since mid+1 is greater than mid
            }
        }
        return start;
    }
}
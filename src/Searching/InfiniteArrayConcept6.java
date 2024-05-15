package Searching;

//infinite meaning try to do it without using length function
public class InfiniteArrayConcept6 {
    public static void main(String[] args) {
        int[] a={3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(Infinitty(a,target));
    }
    public static int Infinitty(int[] a, int target)
    {
        int start=0,end=1;
        while(a[end]<target)
        {
            int tempStart=end+1;
            end=end+(end-start+1)*2;
        }
        return binarySearch(a,target,start,end);
    }
    public static int binarySearch(int[] a,int target,int start,int end)
    {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}


